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




public class AlltheClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AlltheClasses() {
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		 Configuration con = new Configuration().configure().addAnnotatedClass(StudentPojo.class);
		 ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
		 SessionFactory sf =con.buildSessionFactory(reg);
        Session session = sf.openSession();
        session.beginTransaction();      
       
        PrintWriter out = response.getWriter();			
	   
	    	String section ="";
			RequestDispatcher rd = null;
			if ("1AA".equals(request.getParameter("b1"))) {
				 section= "1A";
			}else if("1BB".equals(request.getParameter("b2"))) {
				 section= "1B";
	        }else if("2AA".equals(request.getParameter("b3"))) {
				 section= "2A";
	        }else if("2BB".equals(request.getParameter("b4"))) {
				 section= "2B";
	        }else if("3AA".equals(request.getParameter("b5"))) {
				 section= "3A";
	        }else if("3BB".equals(request.getParameter("b6"))) {
				 section= "3B";
	        }else if("4AA".equals(request.getParameter("b7"))) {
				 section= "4A";
	        }else if("4BB".equals(request.getParameter("b8"))) {
				 section= "4B";
	        }else if("5AA".equals(request.getParameter("b9"))) {
				 section= "5A";
	        }else if("5BB".equals(request.getParameter("b10"))) {
				 section= "5B";
	        }else if("6AA".equals(request.getParameter("b11"))) {
				 section= "6A";
	        }else if("6BB".equals(request.getParameter("b12"))) {
				 section= "6B";
	        }else if("7AA".equals(request.getParameter("b13"))) {
				 section= "7A";
	        }else if("7BB".equals(request.getParameter("b14"))) {
				 section= "7B";
	        }else if("8AA".equals(request.getParameter("b15"))) {
				 section= "8A";
	        }else if("8BB".equals(request.getParameter("b16"))) {
				section= "8B";
	        }else if("9AA".equals(request.getParameter("b17"))) {
				 section= "9A";
	        }else if("9BB".equals(request.getParameter("b18"))) {
				 section= "9B";
	        }else if("10AA".equals(request.getParameter("b19"))) {
				 section= "10A";
	        }else {
				 section= "10B";
	        }
			
			
			 List<StudentPojo> StudentList = new ArrayList();			     
		      Query query = session.createQuery(" from StudentPojo s where s.ClassSection =:sec ");
		      		
		      
		      		
		      query.setParameter("sec", section);
		      StudentList = query.list();
		      rd=request.getRequestDispatcher("Stud.jsp");
		      	
		      rd.include(request, response);		     
		      out.print("<h2>Class Records</h2>");
		        out.print("<div id=box>");
				out.print("<table class='center'  border ='1' id='Students' position='absolute' top='100' align='center'><tr><th>SID</th><th>SFirsttName</th><th>SLastName</th><th><ClassSection</th></tr>");
		        for ( StudentPojo s : StudentList ) {
		        	
		        	out.print("<tr><td>");
					out.print(s.getSID());
					out.print("<td>");					
					out.print(s.getSFirstName());
					out.print("<td>");					
					out.print(s.getSLastName());
					out.print("<td>");
					out.print(s.getClassSection());
					out.print("</td>");
					out.print("</tr>");	        	
		        			        	
		        	}
		        out.print("</table>");
		        out.print("</div>");
						
		    // session.getTransaction().commit();
		     session.close();
	}

}
