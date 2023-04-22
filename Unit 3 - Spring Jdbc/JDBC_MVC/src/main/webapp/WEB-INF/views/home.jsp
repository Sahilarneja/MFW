<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
<style type="text/css">
	body {
		background-color: #D8BFD8;
		background-size: cover;
		font-family: Arial, sans-serif;
		text-align: center;
	}

	h1 {
		font-size: 48px;
		font-weight: bold;
		margin-top: 50px;
		margin-bottom: 30px;
		color: #000000;
	}

	p {
		font-size: 24px;
		margin-bottom: 50px;
		color: #00000;
	}

	a {
		display: inline-block;
		font-size: 24px;
		margin-bottom: 30px;
		color: #ffffff;
		text-decoration: none;
		background-color: #000000;
		padding: 10px 20px;
		border-radius: 5px;
		box-shadow: 2px 2px #000;
	}

	a:hover {
		background-color: #666;
	}

	hr {
		border: none;
		height: 2px;
		background-color: #fff;
		margin: 50px 0;
	}

	.popup {
		position: relative;
		display: inline-block;
	}

	.popup-content {
		display: none;
		position: absolute;
		top: 100%;
		left: 50%;
		transform: translate(-50%, 0);
		background-color: #fff;
		padding: 20px;
		border-radius: 5px;
		box-shadow: 2px 2px #000;
		max-width: 400px;
		z-index: 1;
	}

	.popup:hover .popup-content {
		display: block;
	}

	.popup input[type="text"], .popup input[type="email"],
	.popup input[type="submit"] {
		display: block;
		width: 100%;
		margin-bottom: 10px;
		padding: 10px;
		border: none;
		border-radius: 5px;
		box-sizing: border-box;
		font-size: 16px;
		color: #333;
	}

	.popup input[type="submit"] {
		background-color: #333;
		color: #fff;
		cursor: pointer;
	}

	.popup input[type="submit"]:hover {
		background-color: #666;
	}
</style>
</head>
<body>
	<div>
		<h1>Employee Registration Form!</h1>
		<p>Homepage</p>

		<a href="/JDBC_MVC/form">Employee Registration Form</a> <a
			href="/JDBC_MVC/show">Show Employee Records</a>
	</div>
</body>
</html>