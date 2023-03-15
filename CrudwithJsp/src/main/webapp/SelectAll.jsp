<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.jspcrud.DaoDetails"%>
<%@ page import="com.jspcrud.Details"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select All User</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>

	<%
	out.print("<html><body>");
	out.print("<a href='RegisForm.html'> Add New Users </a> ");
	out.print("<h1>  All Users List </h1> ");

	List<Details> getall = DaoDetails.GetAllUsers();
	out.print("<table border='1' width='100%'>");

	out.print(
			"<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> <th> Edit </th> <th> Delete </th> </tr>");

	for (Details ds : getall) {
		out.print("<tr> <td> <a href='SelectByID.jsp?id=" + ds.getId() + " '>" + ds.getId()
		+ "</a></td>  <td> <a href='SelectByName.jsp?name=" + ds.getName() + " '>" + ds.getName() + "</a></td><td>"
		+ ds.getEmailId() + "</td><td>" + ds.getPassword() + "</td><td><a href='UpdateById.jsp?id="
		+ ds.getId() + "'> Edit </a></td><td><a href='DeleteByID.jsp?id="+ds.getId()+"'> Delete </a></td></tr>");

	}
	out.print("</table>");
	out.print("</body></html>");
	out.close();
	%>

</body>
</html>