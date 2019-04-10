<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2 style="color:#0066CC">${message}</h2>
<h3>Trainee Management App</h3>
<table border="1px">
	<tr><td><h2>Pick an option</h2></td></tr>
	<tr><td><a href="addTraineeForm.obj">Add a Trainee</a></td></tr>
	<tr><td><a href="showDeleteTraineeForm.obj">Delete a Trainee</a></td></tr>
	<tr><td><a href="showSearchTraineeForm.obj">Search a Trainee</a></td></tr>
	<tr><td><a href="showUpdateTraineeForm.obj">Modify a Trainee</a></td></tr>
	<tr><td><a href="showAllTrainee.obj">Show All Trainee Details</a></td></tr>
	<tr><td><a href="showAllTraineeShowButton.obj">Show All Trainee with Fetch Button </a></td></tr>
	
</table>
</center>
</body>
</html>