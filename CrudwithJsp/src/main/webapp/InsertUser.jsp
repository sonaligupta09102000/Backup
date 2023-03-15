<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="com.jspcrud.DaoDetails" %>
    <%@ page import="com.jspcrud.Details" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Users</title>
<link rel="stylesheet" href="/CrudwithJsp/Color.css" type="text/css">

</head>
<body>
 

  
  <% 
    
    String id=request.getParameter("id");
	int Eid = Integer.parseInt(id);
	String name= request.getParameter("name");
	String emailId =request.getParameter("emailId");
	String password=request.getParameter("password");
	
	  Details ds=new Details();
	  ds.setId(Eid);
	  ds.setName(name);
	  ds.setEmailId(emailId);
	  ds.setPassword(password);
		
	   int status=DaoDetails.Insertsave(ds);
	  
	  if(status>0)
	    {
	    	out.print("Record Saved Successfully");
			//response.sendRedirect("Index.jsp");
	    	request.getRequestDispatcher("Index.jsp").include(request, response);
	    	
	    }
	    else
	    {
	    	out.print("Record is not saved!!!.. Try Again!!");
	    }
	  %>


</body>
</html>