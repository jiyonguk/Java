<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색 키워드 : ${query}</h1>
	<h1>페이지 번호 : ${page}</h1>

	<select>
		<c:forEach items="${searchType}" var="type">
			<option value="${type.tno}">${type.type}</option>
		</c:forEach>
	</select>
</body>
</html>