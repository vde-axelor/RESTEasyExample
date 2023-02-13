<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body align="center">
	<h1>Student Register Form</h1>
		<form action="student/add" method = "post">
		First Name : <input type="text" name="fname" placeholder="Enter First Name "> <br>
		Last  Name : <input type="text" name="lname" placeholder="Enter Last Name "> <br>
		City       : <input type="text" name="city" placeholder="Enter City "> <br>
		Date Of Birth : <input type="text" name="dob" placeholder="Enter Date Of Birth "> <br>
		<input type="submit" name="submit">
		</form>
		
		
	
</body>
</html>