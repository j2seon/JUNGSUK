<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2> 세션설정하기 </h2>

<h4>Web.xml에 설정된 정보 출력</h4>

세션 유지기간 설정 정보 : <%= session.getMaxInactiveInterval() %> 분 

<p><p>

<h4>========== 세션 설정 정보 변경 ============</h4>
<%
	session.setMaxInactiveInterval(60*60); //한시간으로 설정 
	
	int time = session.getMaxInactiveInterval()/60; //분 :초로나오기때문에 60 나눔
	
	out.println(" 세션 유효 시간 " + time + "분");
%>


</body>
</html>