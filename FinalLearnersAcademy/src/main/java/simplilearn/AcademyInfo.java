package simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;









public class AcademyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AcademyInfo() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.setContentType("text/html");		 
        
         PrintWriter out = response.getWriter();			
	    	RequestDispatcher rd = null;
	    	
	    	if ("TEACHER".equals(request.getParameter("b1")))
	    	{      
	    		 Configuration con = new Configuration().configure().addAnnotatedClass(Teachers.class);
	    		 ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
	    		 SessionFactory sf =con.buildSessionFactory(reg);
	             Session session = sf.openSession();
	             session.beginTransaction();  
	    		
	    		  List<Teachers> TeacherList = new ArrayList();			     
			      Query query = session.createQuery(" from Teachers");
			      TeacherList = query.list();
			      
			      rd=request.getRequestDispatcher("Validate.jsp");			      	
			      rd.include(request, response);
			      out.print("<h2>Teachers Records</h2>");
			      out.print("<table border ='1' id='Teacher' align='center'><tr><th>TID</th><th>FirstName</th><th>LastName </th></tr>");
			    
			    	for ( Teachers teach : TeacherList ) {
			        	
			        	out.print("<tr><td>");
						out.print(teach.getTID());
						out.print("<td>");						
						out.print(teach.getTFirstName());
						out.print("<td>");						
						out.print(teach.getTLastName());						
						out.print("</td>");
						out.print("</tr>");			        	
			        				        	
			        	}
			        out.print("</table>");
							
			     session.getTransaction().commit();
			     session.close();
			}
	    	
	    	if ("STUDENT".equals(request.getParameter("b2")))
			{ 
	    		
				
				 rd=request.getRequestDispatcher("Stud.jsp");			      	
			     rd.include(request, response);
			     
				
			}
			if ("SUB".equals(request.getParameter("b3"))) {
				
                
				
				 rd=request.getRequestDispatcher("sub.jsp");			      	
			     rd.include(request, response);
			}
			if ("REP".equals(request.getParameter("b4"))) {
				
				
				 rd=request.getRequestDispatcher("Rep.jsp");			      	
			     rd.include(request, response);
				
			}
			if ("signout".equals(request.getParameter("b5"))) {
				
				
				 rd=request.getRequestDispatcher("index.jsp");			      	
			     rd.include(request, response);
				
			}
	    	
	    	
	    	
	    	}
}

