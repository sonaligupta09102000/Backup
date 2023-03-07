package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteByID")
public class DeleteByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//int Users=0;
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.print("<form action=DeleteByID  method=get>");
		out.print("<h1> Delete User </h1>");
		out.print("<h2> Delete User by ID </h2>");
		out.print("<table>");
		out.print("<tr> <td> ID: </td> <td> <input type=text name=ID> </td> </tr>");
		out.print("</table>");
		out.print("<input type=Submit value= submit>");
		out.print("</form>");
		
		String iD=request.getParameter("ID");
		int id=Integer.parseInt(iD);
		
		
		Users u=SaveDetailsConn.DeleteUserById(null, id);
		
		if(id>0)
	    {
	    	out.print("Record Delete Sucessfully");
	    	request.getRequestDispatcher("Registration.html").include(request, response);
	    }
		//out.print(u);
		
//		out.print("<table border='1' width='100%'>");
//		out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
//		out.print("<tr><td>" +u.getID() + "</td><td>" +u.getName()+"</td><td>" + u.getEmailID()+"</td><td>" + u.getPassword()+"</td></tr>");
//		out.print("</table>");
		
     
		
	    
	    else
	    {
	    	out.print("Something Wrong happened!!!.. Try Again!!");
	    }
		
		//out.print("<a href='Registration.html'> Back to the registration </a>");
		//out.close();
		
			
	}catch(Exception e)
		{
		   e.getStackTrace();
		}

}
}
