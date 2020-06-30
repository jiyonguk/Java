<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include test</title>
<style>
header {
	text-align: center;
}

#wrap {
	overflow: hidden;
}

#news {
	width: 45%;
	float: left;
}

#shopping {
	width: 45%;
	float: right;
}

</style>
</head>
<body>
	<%@ include file="include/header.jsp"%>
	<div id="wrap">
		<%@ include file="include/news.jsp"%>
		<%@ include file="include/shopping.jsp"%>
	</div>
	<jsp:include page="include/footer.jsp">
		<jsp:param value="abc@defg.hij" name="email"/>
		<jsp:param value="123-4567-8901" name="tel"/>
	</jsp:include>
</body>
</html>