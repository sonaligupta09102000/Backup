package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrieveUsersByID")
public class RetrieveUsersByID extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<form action=RetrieveUsersByID method=get>");
		out.print("<h1> Search User By ID </h1>");
		out.print("<h2> Enter ID that you want to search </h2>");
		out.print("<table>");
		out.print("<tr> <td> ID: </td> <td> <input type=text name=ID></td></tr>");
		
		out.print("</table>");
		out.print("<input type=Submit value=submit>");
		out.print("</form>");
		
		String iD=request.getParameter("ID");
		int id=Integer.parseInt(iD);
		Users u=SaveDetailsConn.GetSingleUsersById(null, id);
		//out.print(u);
    	//boolean ID=true;
//        if(id>0 && id==id && iD.equals(id))
//		{
    	//if(GetSingleUsersById(iD)) {
		out.print("The Data you search are here!!!!..");
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
		out.print("<tr><td>" +u.getID() + "</td><td>" +u.getName()+"</td><td>" + u.getEmailID()+"</td><td>" + u.getPassword()+"</td></tr>");
		out.print("</table>");
		out.print("<a href='Registration.html'> Back to the registration </a>");
		out.close();
//		}
//        if(id!=id)
//        {
//        	out.print("The Entered data is not correct!!!..");
//        }
		
	}catch(Exception e)
		{
		    e.getStackTrace();
		}
	
	}

}
