<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ page import="com.jspcrud.DaoDetails" %>
    <%@ page import="com.jspcrud.Details" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>
 <% 
 Details ds=new Details();
 String id=request.getParameter("id");
 int Eid=Integer.parseInt(id);
	String name= request.getParameter("name");
	String emailId =request.getParameter("emailId");
	String password=request.getParameter("password");
 ds.setId(Eid);
 ds.setName(name);
 ds.setEmailId(emailId);
 ds.setPassword(password);
 
 
 int status=DaoDetails.UpdateUserById(ds);
 
 if(status>0)
 {
	out.print("Record Update Successfully");
	 response.sendRedirect("SelectAll.jsp");
 }
 else
 {
	 out.println("Sorry!!.. Unable to Update Record");
 }
 
 %>
</body>
</html>