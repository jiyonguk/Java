  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mId = (String)session.getAttribute("memberId");

	if(mId==null){
%>
		 <script>
		 	alert('로그인해주세요');
		 	location.href='../loginForm.jsp';
		 </script>
		 
<%
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css">
</head>
<body>
<%@ include file="/include/header.jsp" %>
	<h1>마이페이지</h1>
	<%@ include file="/include/footer.jsp" %>
</body>
</html>
