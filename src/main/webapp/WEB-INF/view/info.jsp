<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String s=(String)request.getAttribute("key"); %>
<h1>wlecome <%=s %></h1>
<a href="./inbox">inbox</a>
</body>
</html>