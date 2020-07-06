<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<Member> members = new ArrayList();
	members.add(new Member("손흥민1", "asdf1@asdf.asdf"));
	members.add(new Member("손흥민2", "asdf2@asdf.asdf"));
	members.add(new Member("손흥민3", "입력 값이 없습니다."));
	members.add(new Member("손흥민4", "asdf4@asdf.asdf"));
	members.add(new Member("손흥민5", "asdf5@asdf.asdf"));
	members.add(new Member("손흥민6", "asdf6@asdf.asdf"));
	members.add(new Member("손흥민7", "asdf7@asdf.asdf"));
	members.add(new Member("손흥민8", null));
	members.add(new Member("손흥민9", null));
	members.add(new Member("손흥민10", "asdf10@asdf.asdf"));
	
	application.setAttribute("members", members);
	
%>
데이터 생성!!