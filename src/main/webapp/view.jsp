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
<title>Display Student List</title>
</head>
<body>
	<h1 align="center">Our Student</h1>

		<table border="1" align="center">
		<thead>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>City</th>
		<th>DOB</th>
		
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
		
				
		</tr>
		<%
		}
		%>
		<tbody>
		</table>
</body>
</html>