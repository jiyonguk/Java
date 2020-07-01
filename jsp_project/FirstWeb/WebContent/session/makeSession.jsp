<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    session.setAttribute("username", "KING");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><a href="sessionView01.jsp">session View</a></h1>
	
	<!-- 갱신 -->
	<% 
		session.setAttribute("username", "Scott");
	%>
	<br>
	<a href="../session/sessionView01.jsp">session View</a>
</body>
</html>