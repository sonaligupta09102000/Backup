package com.Servlet.Sonali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	
	
		String msg="";
		PrintWriter out; //It is used to write a formatted string to the writer using specified arguments and format string.
		
		public void init() throws ServletException
		{
			msg="My First Servlet Program";
			
		}
		
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		
		System.out.println(id);
		
			response.setContentType("text/html");
			out=response.getWriter();
			out.print(msg);
			
		}
		
		public void destroy()
		{
			out.close();
			
		}
	

}
