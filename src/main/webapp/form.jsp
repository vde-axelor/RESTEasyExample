<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body align="center">
	<h1>Student Register Form</h1>
		<form action="student/create" method = "post">
		First Name : <input type="text" name="fname" placeholder="Enter First Name "> <br>
		Last  Name : <input type="text" name="lname" placeholder="Enter Last Name "> <br>
		City       : <input type="text" name="city" placeholder="Enter City "> <br>
		Date Of Birth : <input type="text" name="dob" placeholder="Enter Date Of Birth "> <br>
		<input type="submit" name="submit">
		</form>
		
		<a href="student/list"><h1>Student Detail </h1></a>
		<table border="1" align="center">
		<thead>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>City</th>
		<th>DOB</th>
		<th>Operation</th>
		</thead>
		<tbody>
		
		<%
		Class.forName("org.postgresql.Driver");
	     Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/restdb","axelor", "axelor");	     
	     Statement st = c.createStatement();
	     ResultSet rs = st.executeQuery("select * from studentdetail");
	     while(rs.next()){
	  	
	    	 int id = rs.getInt("id");
		%>		
		<tr>
		<td><%= rs.getInt("id") %></td>		
		<td><%= rs.getString("fname") %></td>	
		<td><%= rs.getString("lname") %></td>	
		<td><%= rs.getString("city") %></td>
		<td><%= rs.getString("dob") %></td>
		
		<td><a href=student/delete/<%= id %>>Delete</a> &nbsp;
		<a href=update.jsp?id=<%= id %>>Update</a>	
		</td>		
		</tr>
		<%
		}
		%>
		<tbody>
		</table>
	
</body>
</html>