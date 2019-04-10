<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Trainees</title>
</head>
<body>
<center>
	<h2>All Trainees </h2>
	<table border="1px">
		<tr>
			<th bgcolor="bisque">Trainee Id</th>
			<th bgcolor="bisque">Trainee Name</th>
			<th bgcolor="bisque">Trainee Domain</th>
			<th bgcolor="bisque">Trainee Location</th>
		</tr>
	
		<c:forEach var="traineeList" items="${trainees}">
			<tr>
				<td>${traineeList.traineeId}</td>
				<td>${traineeList.traineeName}</td>
				<td>${traineeList.traineeDomain}</td>
				<td>${traineeList.traineeLocation}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="menu.obj">Click
			Here To Go to Home</a>
</center>
</body>
</html>