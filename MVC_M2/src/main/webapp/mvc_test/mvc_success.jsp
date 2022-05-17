<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@ page import="com.model.LoginBean" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p> 로그인성공했습니다 </p>

<% LoginBean = (LoginBean)request.getAttribute("bean"); %>


</body>
</html>