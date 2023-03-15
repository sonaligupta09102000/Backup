<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page import="com.jspcrud.DaoDetails" %>
    <%@ page import="com.jspcrud.Details" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete By ID</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>

  <% 
 
    String id=request.getParameter("id");
    int Eid=Integer.parseInt(id);
		
		Details ds=DaoDetails.DeleteUserById(Eid);
		
		response.sendRedirect("SelectAll.jsp");
	    %>

</body>
</html>