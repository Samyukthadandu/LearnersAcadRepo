package simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Validation() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		RequestDispatcher rd = null;
		if(username.equalsIgnoreCase("Sam")&& password.equalsIgnoreCase("abc123")) {
			rd=request.getRequestDispatcher("Validate.jsp");
			rd.forward(request, response);
		}else {
			rd=request.getRequestDispatcher("index.jsp");
			PrintWriter out =response.getWriter();
			rd.include(request, response);
			out.println("<center> <span style ='color.red'>Invalid Credentials!!</span></center>");			
				
		}
		
		
	}

}
