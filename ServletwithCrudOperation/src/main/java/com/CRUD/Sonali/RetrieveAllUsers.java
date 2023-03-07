package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrieveAllUsers")
public class RetrieveAllUsers extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Users u=new Users();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<a href='Registration.html'> Add New Users </a> ");
		out.print("<h1>  All Users List </h1> ");
		//Users u=new Users();
		
		List<Users> getall=SaveDetailsConn.GetAllUsers(null);
		out.print("<table border='1' width='100%'>");
		
		 out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
		 
		 for(Users u :getall)
		 {
		     out.print("<tr><td>" +u.getID() + "</td><td>" +u.getName()+"</td><td>" + u.getEmailID()+"</td><td>" + u.getPassword()+"</td></tr>");
		 }
		 out.print("</table>");
		 out.print("</body></html>");
		 out.close();
	}

}
