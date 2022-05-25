<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>세션 객체에 변수 값 할당</title>
</head>
<body>
<%	//클라이언트 폼에서 id와 패스워드
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("pass");
	
	//DB에서 가져온 값 
	if(user_id.equals("admin") && user_pw.equals("1234")){
		//세션에 세션 변수의 값을 할당한다.
		session.setAttribute("userID", user_id);
		session.setAttribute("userPW", user_pw);
		
		out.println("세션설정이 완료되었습니다.");
		out.println(user_id + " 님 환영합니다.");
		
	}else{
		out.println("세션설정이 실패했습니다.");
	}
	


%>
</body>
</html>