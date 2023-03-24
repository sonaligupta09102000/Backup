<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.hibernatecrud.HibEmployee" %>
    <%@page import="com.hibernatecrud.HibDetailsDao" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
<link rel="stylesheet" href="/HibernateCrud/backcolor.css" type="text/css">
</head>
<body>

<% 
String id=request.getParameter("id");
int Id=Integer.parseInt(id);
HibEmployee h=HibDetailsDao.GetSingleUsersById(Id);

out.print("<form action='AllDetails?action=UpdateUser'  method='post'>");
out.print("<table border='1' width='100%'>");
out.print("<tr> <td> Id </td><td><input type=text name=id  value="+ h.getId()+" readonly> </td></tr>");
out.print("<tr> <td> Name </td><td> <input type=text name=name value="+h.getName()+"> </td><tr>");
out.print("<tr> <td> EmailId </td><td> <input type=text name=emailId value="+h.getEmailId()+"></td></tr> ");
out.print("<tr> <td> Password </td><td> <input type=text name=password value="+h.getPassword()+"></td></tr>");
out.print("<tr><td> <input type=Submit value=update> </td></tr>");
out.print("</table>");
out.print("</form>");
	
%>

</body>
</html>