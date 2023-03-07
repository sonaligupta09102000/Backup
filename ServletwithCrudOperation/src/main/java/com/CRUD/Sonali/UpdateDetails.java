package com.CRUD.Sonali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateDetails")
public class UpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     try {
		// int status=0;
		 response.setContentType("text/html");
		 PrintWriter out =response.getWriter();
		 String iD=request.getParameter("ID");
		 int id=Integer.parseInt(iD);
		 String Name=request.getParameter("Name");
		 String EmailID=request.getParameter("emailID");
		 String Password=request.getParameter("Password");
		 
		 Users u1=new Users();
		 u1.setID(id);
		 u1.setName(Name);
		 u1.setEmailID(EmailID);
		 u1.setPassword(Password);
		 
		 //Users u1=new Users();
		 int status=SaveDetailsConn.UpdateUserById(null, u1);
		 
		 if(status>0)
		 {
			out.print("Record Update Successfully");
			 response.sendRedirect("RetrieveAllUsers");
		 }
		 else
		 {
			 out.println("Sorry!!.. Unable to Update Record");
		 }
		 
		 out.close();
		
	}catch(Exception e)
	     {
		     e.getStackTrace();
	     }
	     }

}
