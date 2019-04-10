<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Welcome to Trainee Management App</h1>
		<br />
		<br />

		<!--This code below displays the form to add a trainee to the database	-->
		<h3>Please Enter the Trainee Details</h3>
		<%-- <c:url var="myAction" value="/addTrainee.obj"></c:url> --%>
		<form:form action="addTrainee.obj" method="post" modelAttribute="trainee">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>Trainee Name :<span style="color: red;">*</span></td>
					<td><form:input path="traineeName" /></td>
					<td style="color: red;"><form:errors path="traineeName"></form:errors></td>

				</tr>

				<tr>
					<td>Trainee Location :<span style="color: red;">*</span></td>
					<td><form:input path="traineeLocation" /></td>
					<td style="color: red;"><form:errors path="traineeLocation"></form:errors></td>

				</tr>

				<tr>
					<td>Trainee Domain :<span style="color: red;">*</span></td>
					<td><form:input path="traineeDomain" /></td>
					<td style="color: red;"><form:errors path="traineeDomain"></form:errors></td>

				</tr>
			
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add Trainee"></input></td>
				</tr>
			</table>

		</form:form>
		<br> <a href="menu.obj">Back To HomePage</a>
	</center>
</body>
</html>