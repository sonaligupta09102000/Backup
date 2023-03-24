<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.hibannonation.FacultyDao" %>
    <%@page import="com.hibannonation.Faculty" %>
    <%@page import="com.hibannonation.FactInfo" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Information </title>
</head>
<body>
 <% 
    
     response.sendRedirect("FactInfo?action=GetAllUser");
 %>

</body>
</html>