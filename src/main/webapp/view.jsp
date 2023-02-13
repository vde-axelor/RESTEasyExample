<%@page import="java.util.List"%>
<%@page import="com.rest.db.StudentDetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Our Student</h1>

	<table border=2 align="center">
        <tr>
            <th>ID</th>
            <th>Fname</th>
            <th>Lname</th>
            <th>City</th>
            <th>Dob</th>
        </tr>
			  <% for (StudentDetail sd :(List<StudentDetail>)request.getAttribute("list")) { %>
			<tr width="42" height="42">
				<td><%=sd.getId()%></td>
				<td><%=sd.getFname()%></td>
				<td><%=sd.getLname()%></td>
				<td><%=sd.getCity()%></td>
				<td><%=sd.getDob()%></td>
			</tr>
			<%
			}
			%>
		</tb>
	</table>
</body>
</html>