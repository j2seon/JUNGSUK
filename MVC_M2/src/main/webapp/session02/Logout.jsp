<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	
	// 방법 1 : 회원 인증 정보 속성 삭제 
	session.removeAttribute("UserId");
	session.removeAttribute("UserName");
	
	
	//방법 2: 한번에 삭제하기
	session.invalidate();
	response.sendRedirect("LoginForm.jsp");

%>



</body>
</html>