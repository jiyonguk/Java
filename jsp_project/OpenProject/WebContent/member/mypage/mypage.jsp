  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="requestInfo" class="model.RequestMemberInfo" scope="page"/>
<jsp:setProperty property="*" name="requestInfo"/>    
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
	<hr>
	<ul>
		<li>id :<%=requestInfo.getId() %> <%--=request.getParameter("id")--%></li>
		<li>pw :<%=requestInfo.getPw() %> <%--=request.getParameter("pw")--%></li>
		<li>name :<%=requestInfo.getUname() %> <%--=request.getParameter("uname")--%></li>
		<li>photo :<%--=request.getParameter("uphoto")--%></li>
	</ul>
<%@ include file="/include/footer.jsp" %>
</body>
</html>
