package com.hibernatecrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllDetails")
public class AllDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String category = request.getParameter("action");
		out.println(category);
		switch (category) {
		case "HibInsert": {
			out.print("hi");
			HibEmployee hibemp = new HibEmployee();
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);
			out.print(Id);
			String name = request.getParameter("name");
			String emailId = request.getParameter("emailId");
			String password = request.getParameter("password");

			hibemp.setId(Id);
			hibemp.setName(name);
			hibemp.setEmailId(emailId);
			hibemp.setPassword(password);

			HibDetailsDao.InsertHibEmps(hibemp);
			out.print("Insert the HibEmp Successful");
			response.sendRedirect("FormRegis.html");
		}
			break;

		case "GetAllUser": {
			HibEmployee hibemp = new HibEmployee();
			List<HibEmployee> getall = HibDetailsDao.RetrieveAllHibEmps();
			out.print("<a href=FormRegis.html> Home </a>");
			out.print("<table border='1' width='100%'>");

			out.print(
					"<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> <th> Edit </th> <th> Delete </th> </tr>");

			for (HibEmployee h : getall) {
				out.print("<tr><td><a href='AllDetails?action=GetUserById&id=" + h.getId() + "'>" + h.getId()
						+ "</a></td><td>" + h.getName() + "</td><td>" + h.getEmailId() + "</td><td>" + h.getPassword()
						+ "</td><td><a href='UpdateDetails.jsp?id=" + h.getId() + "'> Edit </a></td><td><a href='AllDetails?action=DeleteUserById&id=" + h.getId() + "'> Delete </a></td></tr>");

			}
			out.print("</table>");
			out.print("</body></html>");
			out.close();

		}
			break;

		case "GetUserById": {

			HibEmployee hemp = new HibEmployee();
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);

			hemp = HibDetailsDao.GetSingleUsersById(Id);

			out.print("The Data you search are here!!!!..");
			out.print("<table border='1' width='100%'>");
			out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
			out.print("<tr><td>" + hemp.getId() + "</td><td>" + hemp.getName() + "</td><td>" + hemp.getEmailId()
					+ "</td><td>" + hemp.getPassword() + "</td></tr>");
			out.print("</table>");
			out.print("<a href='FormRegis.html'> Back to the registration </a>");
			out.close();
		}
			break;

		case "DeleteUserById": {
			String id = request.getParameter("id");
			int Id = Integer.parseInt(id);
			HibDetailsDao.DeleteById(Id);
			response.sendRedirect("AllDetails?action=GetAllUser");
		}
			break;

		case "UpdateUser": {
			
			 String id=request.getParameter("id");
			 int Id=Integer.parseInt(id);
				String name= request.getParameter("name");
				String emailId =request.getParameter("emailId");
				String password=request.getParameter("password");
				HibEmployee hemp=new HibEmployee();
			 hemp.setId(Id);
			 hemp.setName(name);
			 hemp.setEmailId(emailId);
			 hemp.setPassword(password);
	
			 HibDetailsDao.UpdateUser(hemp);
			 response.sendRedirect("AllDetails?action=GetAllUser");

		    }
		}
	}
}
