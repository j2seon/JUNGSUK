<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>session 객체의 변수에 할당된 값 가져오기</h2>

<%
	//세션 객체의 값을 가져올때 object 타입이기 때문에 형변환이 필요하다.
		// 모든 페이지에서 session의 변수에 들어간 값을 가져와서 null 일 경우 : 로그인이 안된상태!!
		//getAttribute는 세션변수의 하나의 변수의 값을 가져올 때 
	String user_id = (String)session.getAttribute("userID");
	String user_pw = (String)session.getAttribute("userPW");
	
	out.println("설정된 세션을 속성 값 1 " + user_id);
	out.println("설정된 세션을 속성 값 1 " + user_pw);



%>

</body>
</html>