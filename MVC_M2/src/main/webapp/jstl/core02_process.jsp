<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String number = request.getParameter("number");
	%>
	
	<!-- 스크립트릿 태크로 출력 -->
	<%= number %> <br/>
	
	<!-- JSTL로 출력 -->
	
	
	

</body>
</html>