<%@page import="java.sql.Time"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>This is help page</h1>
<h1>thrown by help controller</h1>

<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");

%>
<h1>name is: <%=name %></h1>
<h1>id is: <%=id %></h1>
<h1>Date & Time is: <%= time.toString() %></h1>
</body>
</html>