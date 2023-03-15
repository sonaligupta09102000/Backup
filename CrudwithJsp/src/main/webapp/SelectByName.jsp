<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ page import="com.jspcrud.DaoDetails" %>
    <%@ page import="com.jspcrud.Details" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select By Name</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>

<% 

    String name=request.getParameter("name");

   Details ds=DaoDetails.GetSingleUsersByName(name);

 out.print("The Data you search are here!!!!..");
 out.print("<table border='1' width='100%'>");
 out.print("<tr> <th> ID</th> <th> Name </th> <th> EmailID </th> <th> Password </th> </tr>");
 out.print("<tr><td>" +ds.getId() + "</td><td>" +ds.getName()+"</td><td>" + ds.getEmailId()+"</td><td>" + ds.getPassword()+"</td></tr>");
 out.print("</table>");
 out.print("<a href='RegisForm.html'> Back to the registration </a>");
 out.close();
 %>

</body>
</html>