<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setAttribute("price", 10000);
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TAG</title>
</head>
<body>

	<fmt:timeZone value="US/Hawaii">

	날짜 포맷팅 <br>
	<fmt:formatDate value="${now}" pattern="yyyy.MM.dd H:mm:ss"/><br>
	</fmt:timeZone>

	<br>
	
	날짜와 시간 동시표현<br>
	<fmt:formatDate value="${now}" type="both"/><br>
	<fmt:formatDate value="${now}" type="both" timeStyle="short"/><br>
	<fmt:formatDate value="${now}" type="both" timeStyle="short" dateStyle="short"/><br>
	
	<br>

	시간표현<br>
	<fmt:formatDate value="${now}" type="time"/><br>
	<fmt:formatDate value="${now}" type="time" timeStyle="short"/><br>
	<fmt:formatDate value="${now}" type="time" timeStyle="full"/><br>

	날짜 표현<br>
	<fmt:formatDate value="${now}"/><br>
	<fmt:formatDate value="${now}" type="date"/><br>
	<fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>
	<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
	
	<hr>

	숫자타입 : <fmt:formatNumber value="${price}" type="number"/>,
	<fmt:formatNumber value="${price}" type="number" var="numberType"/>
	${numberType}
	<br>
	통화 : <fmt:formatNumber value="${price}" type="currency"/>,
	<fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/>
	<br>
	퍼센트 : <fmt:formatNumber value="${price/30000}" type="percent"/>,
	<fmt:formatNumber value="${price/30000}" type="percent" groupingUsed="false"/>
	<br>
	패턴 : <fmt:formatNumber value="${price}" pattern="000000.00"/>,
	<fmt:formatNumber value="${price}" pattern="0000.0000"/>
	
	<br>
	<c:out value="jstl tag out -> 데이터를 출력합니다."/>
	<br>
	<c:out value="${members[7].name}"/>
	<c:out value="${members[7].email}" default="<i>입력값이 없습니다.</i>" escapeXml="false"/>
	<br>
	<c:out value="${members[8].email}" escapeXml="false">
		<span style="color:red">입력값이 없습니다.</span>
	</c:out>
	
	<c:if test="${members[8].email == null}">
		<span style="color:red">입력값이 없습니다.</span>
	</c:if>
	
	
	<c:forEach items="${applicationScope.members}" var="member" varStatus="status">
		<h3>
		${status.index} ${status.count}
		이름 : ${member.name},
		 이메일 : 
		 <c:out value="${member.email}" escapeXml="false">
			 <span style="color: #ff9999">이메일 없음</span>
		</c:out>
		
		<c:if test="${member.email == null}">
			<span style="color:#ff9999">이메일 없음</span>
		</c:if>
		
		<c:if test="${empty member.email}">
			<span style="color:#ff9999">이메일 없음</span>
		</c:if>
			
		</h3>
	</c:forEach>
</body>
</html>
	
	
	<select name="year">
		<c:forEach var="year" begin="1950" end="2020" step="1">
			<option value="${year}"	${param.year==year?'selected':''}>${year}</option>
		</c:forEach>

	</select>

	<br>

	<c:forTokens items="손흥민, 123-456-789, 런던" delims="," var="token">
		${token}<br>
	</c:forTokens>
	
	
	<h1>
	
	URL1 : <c:url value="/index.jsp"/>
	<br>
	<a href="<c:url value="/index.jsp"/>">홈</a>
	<br>
	URL2 : <c:url value="jstl_tag2.jsp">
		<c:param name="year" value="1999"/>
	</c:url>
	<br>
	URL3 : <c:url value="jstl_tag2.jsp?year=1999"/>
	
	<c:url value="jstl_tag2.jsp?year=2020" var="reurl"/>
	
	<br>
	URL4 : ${reurl}
	
	
	</h1>
	
<%-- 	<c:redirect url="${reurl}">
		<c:param name="month">7</c:param>
	</c:redirect> --%>
	
	
	
	