<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>
<h1>This is Success Page</h1>
<%String name=request.getParameter("name");
String email=request.getParameter("email");
String message=request.getParameter("message");
%>

<h3>name of customer is: <%=name %></h3>
<h3>email of customer is: <%=email %></h3>
<h3>message is: <%=message %></h3>

</body>
</html>