<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.List"%>
<%@page import="com.rest.db.StudentDetail"%>
 <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student List</title>
</head>
<body align="center">
	<h1>Student Register Form</h1>
		
	  <%  StudentDetail sd = (StudentDetail) request.getAttribute("StudentById");  %>

       <form action="/student/update/" method = "post">
		First Name : <input type="text" name="fname" value="<%= sd.getFname()  %>"> <br>
		Last  Name : <input type="text" name="lname" value="<%= sd.getLname() %>" > <br>
		City : <input type="text" name="city"  value="<%=  sd.getCity() %>"> <br>
		Date Of Birth : <input type="text" name="dob"  value="<%=  sd.getDob() %>"> <br>
		<input type="submit" name="submit" value="update">
		</form> 	
</body>
</html>