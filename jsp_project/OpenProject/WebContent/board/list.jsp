  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mId = (String)session.getAttribute("memberId");

	if(mId==null){
%>
		 <script>
		 	alert('로그인해주세요');
		 	location.href='../member/loginForm.jsp';
		 </script>
<%
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css">

<style>
</style>
</head>
<body>

	<%@ include file="/include/header.jsp" %>

	<div>
		<h1>게시판</h1>
	</div>

	<%@ include file="/include/footer.jsp" %>
</body>
</html>

