<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String[] bookNames= {
			"Java의 정석", "HTML5 프로그래밍", "ECMA6 Script"
	};

	request.setAttribute("bookNames", bookNames);
	
	List<String> study = new ArrayList<String>();
	
	study.add("JAVA");
	study.add("Oracle");
	study.add("웹 표준");
	study.add("JSP");
	
	request.setAttribute("study", study);
	
	Map<String, String> student = new HashMap();
	
	student.put("dept", "컴퓨터사이언스");
	student.put("name", "손흥민");
	student.put("phoneNumber", "123-456-789");
	
	request.setAttribute("student", student);
%>	
<jsp:forward page="objectView.jsp"/>