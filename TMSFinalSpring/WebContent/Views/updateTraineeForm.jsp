<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search trainee</title>
</head>
<body>
<center>
 <h1 style="color:red">${message}</h1>
	<h2>Search trainee form</h2>
	<form action="updateTrainee.obj" method="post">
		Enter trainee Id: <input type="number" name="traineeId">
		<input type="submit" value="Search">
	</form>
	
	<c:if test = "${not empty trainee}">
	<h3>Please Enter the Trainee Details for Updation </h3>
	
		<%-- <c:url var="myAction" value="/addTrainee.obj"></c:url> --%>
		<form:form action="updateTraineeInDB.obj" method="post" modelAttribute="trainee">
		<input type="hidden" value="${trainee.traineeId}" name="traineeId">
			<table bgcolor="#DCDCDC">
				
				<tr>
					<td>Trainee Name:<span style="color: red;">*</span></td>
					<td><form:input path="traineeName" value="${trainee.traineeName}"/></td>
					<td style="color: red;"><form:errors path="traineeName"></form:errors></td>

				</tr>

				<tr>
					<td>Trainee Location:<span style="color: red;">*</span></td>
					<td><form:input path="traineeLocation" value="${trainee.traineeLocation}"/></td>
					<td style="color: red;"><form:errors path="traineeLocation"></form:errors></td>

				</tr>

				<tr>
					<td>Trainee Domain:<span style="color: red;">*</span></td>
					<td><form:input path="traineeDomain" value="${trainee.traineeDomain}"/></td>
					<td style="color: red;"><form:errors path="traineeDomain"></form:errors></td>

				</tr>
			
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Update Trainee"></input></td>
				</tr>
			</table>

		</form:form>
	</c:if>
	<br> <a href="menu.obj">Back To HomePage</a>
</center>
</body>
</html>