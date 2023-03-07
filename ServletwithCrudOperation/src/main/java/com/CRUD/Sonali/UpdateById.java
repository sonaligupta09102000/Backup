package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateById")
public class UpdateById extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Users u1=new Users();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1> Update User </h1>");
		out.print("<h1> For Update User enter a id </h1>");
		out.print("<form action=UpdateById  method=post>");
		out.print("<tr> <td> Enter ID: </td> <td><input type=text name=ID></td> </tr>");
		out.print("<tr><td> <input type=Submit value=submit> </td></tr>");
		out.print("</form>");
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String iD=request.getParameter("ID");
		int id=Integer.parseInt(iD);
		
		Users u=SaveDetailsConn.GetSingleUsersById(null, id);
		
		out.print("<table border='1' width='100%'>");
		if(!(u.getID()==0)) {
		//out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
		out.print("<form action = UpdateDetails  method=post>");
		out.print("<tr> <td> ID </td><td><input type=text name=ID  value="+ u.getID()+" readonly> </td></tr>");
		out.print("<tr> <td> Name </td><td> <input type=text name=Name value="+u.getName()+"> </td><tr>");
		out.print("<tr> <td> EmailID </td><td> <input type=text name=emailID value="+u.getEmailID()+"></td></tr> ");
		out.print("<tr> <td> Password </td><td> <input type=text name=Password value="+u.getPassword()+"></td></tr>");
		out.print("<tr><td> <input type=Submit value=update> </td></tr>");
		out.print("</form>");
		//out.print("<tr><td>" +u.getID() + "</td><td>" +u.getName()+"</td><td>" + u.getEmailID()+"</td><td>" + u.getPassword()+"</td></tr>");
		out.print("</table>");
		}
		
		
		
		
		
		
         //int status=SaveDetailsConn.UpdateUserById(null,id, u);
		 
			/*
			 * if(status>0) { out.print("uusoj"); response.sendRedirect("RetrieveAllUsers");
			 * } else { out.println("Sorry!!.. Unable to Update Record"); }
			 */
		 
		out.close();
		
		
		
	}  
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}
}
