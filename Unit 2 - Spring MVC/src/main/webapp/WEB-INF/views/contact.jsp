<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>My Form</title>
</head>
<body>
<h1>	CUSTOMER INFORMATION SYSTEM</h1><BR>
	<form action="processform" method="POST">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name"><br><br>
		
		<label for="email">Email:</label>
		<input type="email" id="email" name="email"><br><br>
		
		<label for="message">Message:</label>
		<textarea id="message" name="message"></textarea><br><br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>