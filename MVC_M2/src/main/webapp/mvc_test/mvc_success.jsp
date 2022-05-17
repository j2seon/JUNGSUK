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

<p> <%
		LoginBean bean = (LoginBean) request.getAttribute("bean");
		out.println ("아이디 : " + bean.getId()); 
		 %> 


</body>
</html>