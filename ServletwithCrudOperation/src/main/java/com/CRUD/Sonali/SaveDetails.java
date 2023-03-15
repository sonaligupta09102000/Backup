package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveDetails")
public class SaveDetails extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int status=0;
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String ID=request.getParameter("ID");
		int id=Integer.parseInt(ID);
		String Name= request.getParameter("Name");
		String EmailID=request.getParameter("EmailID");
		String Password=request.getParameter("Password");
		
		Users u=new Users();
		
		u.setID(id);
		u.setName(Name);
		u.setEmailID(EmailID);
		u.setPassword(Password);
		
	
		status=SaveDetailsConn.Insertsave(u, null);
		
	    if(status>0)
	    {
	    	out.print("Record Saved Successfully");
	    	request.getRequestDispatcher("Registration.html").include(request, response);
	    }
	    else
	    {
	    	out.print("Record is not saved!!!.. Try Again!!");
	    }
	    
//	    int status1=status;
//	    status1=SaveDetailsConn.GetAllUsers(u, null);
//	    if(status1==status)
//	    {
//	    	out.print("Shown Records");
//	    }
//	    else
//	    {
//	    	out.print("Sorry Try Again");
//	    }
		out.close();
	}
}
