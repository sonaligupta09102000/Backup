<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ page import="com.jspcrud.DaoDetails" %>
    <%@ page import="com.jspcrud.Details" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update By Id</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>
<% 
String id=request.getParameter("id");
int Eid=Integer.parseInt(id);
Details ds=DaoDetails.GetSingleUsersById(Eid);


out.print("<form action = UpdateDetails.jsp  method=post>");
out.print("<table border='1' width='100%'>");
out.print("<tr> <td> Id </td><td><input type=text name=id  value="+ ds.getId()+" readonly> </td></tr>");
out.print("<tr> <td> Name </td><td> <input type=text name=name value="+ds.getName()+"> </td><tr>");
out.print("<tr> <td> EmailId </td><td> <input type=text name=emailId value="+ds.getEmailId()+"></td></tr> ");
out.print("<tr> <td> Password </td><td> <input type=text name=password value="+ds.getPassword()+"></td></tr>");
out.print("<tr><td> <input type=Submit value=update> </td></tr>");
out.print("</table>");
out.print("</form>");


	
%>
</body>
</html>