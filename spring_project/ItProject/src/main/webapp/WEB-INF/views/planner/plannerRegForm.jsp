<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${dateList}" var="list">
		<div>
			<div>날짜 : ${list}</div>
			<div></div>
			<div>추가</div>
		</div>
	</c:forEach>

</body>
</html>