<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Employee List</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #b8e2f2;
		}
		h1 {
			color: #006699;
			text-align: center;
			padding-top: 20px;
		}
		table {
			border-collapse: collapse;
			margin: auto;
			width: 80%;
			background-color: #FFFFFF;
			box-shadow: 0px 0px 10px #888888;
		}
		th, td {
			padding: 10px;
			text-align: left;
		}
		th {
			background-color: #006699;
			color: white;
		}
		tr:nth-child(even) {
			background-color: #f2f2f2;
		}
		a {
			color: #006699;
			text-decoration: none;
			margin-right: 10px;
		}
	</style>
</head>
<body>
	<h1>Employee Dashboard</h1>

<br>
<div align="center">

	<table border=1>
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Employee Address</th>
				<th>Operation</th>
			</tr>
		</thead>

		<c:forEach var="employee" items="${employees}">
			<tr>
				<td>${employee.empId }</td>
				<td>${employee.empName }</td>
				<td>${employee.empSalary }</td>
				<td>${employee.empAddress }</td>
				<td><a href="updateForm?empId=${employee.empId}">Edit</a>
					<a href="deleteEmployee?empId=${employee.empId}"
					onclick="if (!(confirm('Do you really want to delete this employee record?'))) return false">Delete</a>
				</td>
			</tr>
		</c:forEach>

	</table>
</div>
</body>
</html>