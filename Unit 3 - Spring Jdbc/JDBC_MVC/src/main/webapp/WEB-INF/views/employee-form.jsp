<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Input Form</title>
<style>
body {
    background-color: #c1e7e3;
	font-family: Arial, sans-serif;
	text-align: center;
	color: #000000;
	font-size: 18px;
	line-height: 1.5;
	margin: 0;
	padding: 0;
}

h2 {
	font-size: 32px;
	font-weight: bold;
	margin-top: 40px;
	margin-bottom: 25px;
	color: #000000;
	text-align: center;
	padding: 20px;
}

label {
	display: block;
	margin-top: 12px;
	font-size: 16px;
	font-weight: bold;
	text-align: left;
}

input[type=text], textarea {
	width: 100%;
	padding: 10px;
	border: none;
	border-radius: 2px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 12px;
	resize: vertical;
	font-size: 12px;
	background-color: #f1f1f1;
}

input[type=submit] {
	background-color: #333;
	color: #fff;
	padding: 4px 8px;
	border: none;
	border-radius: 2px;
	cursor: pointer;
	font-size: 16px;
	box-shadow: 2px 2px #000;
	transition: background-color 0.2s;
}

input[type=submit]:hover {
	background-color: #666;
}

hr {
	border: none;
	height: 2px;
	background-color: #fff;
	margin: 50px 0;
}

.container {
	max-width: 300px;
	margin: 0 auto;
	padding: 20px;
	background-color: rgba(255, 255, 255, 0.8);
	border-radius: 6px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Employee Input Form</h2>
		<form:form action="process" method="post" modelAttribute="employee">
			<label for="id">Employee ID</label>
			<form:input type="text" path="empId" />

			<label for="name">Employee Name</label>
			<form:input type="text" path="empName" />

			<label for="salary">Employee Salary</label>
			<form:input type="text" path="empSalary" />

			<label for="address">Employee Address</label>
			<form:textarea path="empAddress" rows="5" cols="30" />

			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>

