package com.hibannonation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FactInfo")
public class FactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	

		String category = request.getParameter("action");
		out.println(category);
		
		//out.print("<link rel=\"stylesheet\" href=\"/HibernateCrud/backcolor.css\" type=\"text/css\">");
		switch (category) 
		{
		
		    case "Insert": {
			
			Faculty f = new Faculty();
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);
			//out.print(Id);
			String name = request.getParameter("name");
			String emailId = request.getParameter("emailId");
			String password = request.getParameter("password");

			f.setId(Id);
			f.setName(name);
			f.setEmailId(emailId);
			f.setPassword(password);

			FacultyDao.InsertHibEmps(f);
			out.print("Insert the HibEmp Successful");
			response.sendRedirect("Form.html");
		}
		break;

		case "GetAllUser": {
			Faculty f = new Faculty();
			List<Faculty> getall = FacultyDao.RetrieveAll();
			out.print(" <a href=Form.html> <button> Home </button> </a>");
			out.print("<table border='1' width='100%'>");

			out.print(
					"<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> <th> Edit </th> <th> Delete </th> </tr>");

			for (Faculty f1 : getall) {
				out.print("<tr><td><a href='FactInfo?action=GetUserById&id=" +f1.getId() + "'>" + f1.getId()
						+ "</a></td><td><a href='FactInfo?action=GetUserById&id=" + f1.getId() + "'>" + f1.getName() + "</a></td><td>" + f1.getEmailId() + "</td><td>" + f1.getPassword()
						+ "</td><td><a href='UpdateDetails.jsp?id=" +f1.getId() + "'> Edit </a></td><td><a href='FactInfo?action=DeleteUserById&id=" + f1.getId() + "'> Delete </a></td></tr>");

			}
			out.print("</table>");
			out.print("</body></html>");
			out.close();
		}
		break;

		case "GetUserById": {

			Faculty f = new Faculty();
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);

			f = FacultyDao.GetSingleUsersById(Id);

			
			out.print("The Data you search are here!!!!..");
			out.print("<table border='1' width='100%'>");
			out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
			out.print("<tr><td>" + f.getId() + "</td><td>" + f.getName() + "</td><td>" + f.getEmailId()
					+ "</td><td>" + f.getPassword() + "</td></tr>");
			out.print("</table>");
			out.print("<a href='Form.html'> Back to the registration </a>");
			out.close();
		}
			break;

		case "DeleteUserById": {
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);
			FacultyDao.DeleteById(Id);
			response.sendRedirect("FactInfo?action=GetAllUser");
		}
			break;

		case "UpdateUser": {
			
			 String id=request.getParameter("id");
			 int Id=Integer.parseInt(id);
				String name= request.getParameter("name");
				String emailId =request.getParameter("emailId");
				String password=request.getParameter("password");
				Faculty f=new Faculty();
			 f.setId(Id);
			 f.setName(name);
			 f.setEmailId(emailId);
			 f.setPassword(password);
	
			 FacultyDao.UpdateUser(f);
			 response.sendRedirect("FactInfo?action=GetAllUser");

		    }
		break;
		
		default:
			System.exit(0);
		}
	}

}
