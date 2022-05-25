<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 세션 설정 확인 </h2>

<%
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); //날짜 표시 형식
	long creationTime = session.getCreationTime(); //Unix 시간으로 출력 (1970년 1월 1일 )
	String creationTimeStr = dateFormat.format(new Date(creationTime));
	
	long lastTime = session.getLastAccessedTime(); //마지막 요청 시간
	String lastTimeStr = dateFormat.format(new Date(lastTime));
%>

<ul>

	<li>세션 유지기간 설정정보 : <%= session.getMaxInactiveInterval() / 60 %> ( 분 )</li>
	<li>세션 아이디 : <%= session.getId() %></li>
	<li>최초 요청시간 : <%=session.getCreationTime() %></li>
	<!-- Unix 시간으로 출력 : 1970년 1월 1일 부터 현재 시간까지의 (초)로 출력  -->
	<li>마지막 요청시간 :<%=session.getLastAccessedTime() %></li>
	<!-- Unix 시간으로 출력 : 1970년 1월 1일 부터 현재 시간까지의 (초)로 출력  -->
	
</ul>



</body>
</html>