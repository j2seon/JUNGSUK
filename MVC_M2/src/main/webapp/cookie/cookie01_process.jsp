<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 

	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("pass");
	
	if(user_id.equals("admin") && user_pw.endsWith("1234")){
		//쿠키 생성, 클라이언트에 쿠키의 값을 저장.
		
		//쿠키는 생성자에서 변수이름과 값을 할당한다.set설정하는 메소드가 없음.
		Cookie cookieid = new Cookie("userID", user_id);
		Cookie cookiepw = new Cookie("userPW", user_pw);
		
		//쿠키 설정 
		//쿠키를 사용할 서버의 경로
		cookieid.setPath(request.getContextPath());
		cookieid.setMaxAge(60*60); //한시간 쿠키는 초단위
		
		cookiepw.setPath(request.getContextPath());
		cookiepw.setMaxAge(60*60);
		
		//쿠키를 response 객체를 사용해서 클라이언트 hdd 에 저장해야된다
		response.addCookie(cookieid);
		response.addCookie(cookiepw);
		
		out.println("쿠키생성이 성공했습니다.");
		out.println(user_id+"님 환영합니다.");
		
		//response.sendRedirect("cookie02.jsp");	
	}else{
		out.println("쿠키생성이 실패하였습니다.");
	}	

%>




</body>
</html>