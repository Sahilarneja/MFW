<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>this is home page</h1>
<h1>called by controller</h1>

<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");

%>

<h1>name is : <%=name %></h1>
<h1>Id is : <%=id %></h1>

</body>
</html>