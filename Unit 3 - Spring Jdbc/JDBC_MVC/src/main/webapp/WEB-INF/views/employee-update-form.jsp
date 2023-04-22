<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<div align="center">

		<h2>Employee Update Form</h2>
		<br>
		<hr>

		<form:form action="processupdate" method="post" modelAttribute="employee">

			<label for="id">Employee ID</label>
			<form:input type="text" path="empId" readonly="true"/>
			<br>
			<br>

			<label for="name">Employee Name</label>
			<form:input type="text" path="empName" />
			<br>
			<br>
			
			<label for="name">Employee Salary</label>
			<form:input type="text" path="empSalary" />
			<br>
			<br>

			<label for="address">Employee Address</label>
			<br>
			<form:textarea path="empAddress" rows="5" cols="30" />
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>