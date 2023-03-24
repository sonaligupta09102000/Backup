<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.hibannonation.FactInfo" %>
    <%@page import="com.hibannonation.FacultyDao" %>
    <%@page import="com.hibannonation.Faculty" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String id=request.getParameter("id");
int Id=Integer.parseInt(id);
Faculty f=FacultyDao.GetSingleUsersById(Id);

out.print("<form action='FactInfo?action=UpdateUser'  method='post'>");
out.print("<table border='1' width='100%'>");
out.print("<tr> <td> Id </td><td><input type=text name=id  value="+ f.getId()+" readonly> </td></tr>");
out.print("<tr> <td> Name </td><td> <input type=text name=name value="+f.getName()+"> </td><tr>");
out.print("<tr> <td> EmailId </td><td> <input type=text name=emailId value="+f.getEmailId()+"></td></tr> ");
out.print("<tr> <td> Password </td><td> <input type=text name=password value="+f.getPassword()+"></td></tr>");
out.print("<tr><td> <input type=Submit value=update> </td></tr>");
out.print("</table>");
out.print("</form>");
	
%>


</body>
</html>