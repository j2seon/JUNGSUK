<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Session </title>
</head>
<body>

<table border="1" width="90%">
	<tr>
		<td align ="center">
			<!-- 로그인 여부에 따른 메뉴 변화 -->
		<%if(session.getAttribute("UserId") == null ){%>
			<a href = "../session03/LoginForm.jsp"> 로그인 </a>
		<%}else{ %>
			<a href = " ../session03/Logout.jsp">로그아웃</a>
		<% } %>
		</td>
	</tr>
</table>

<h2>로그인 페이지 </h2>
<span style = "color:red ; font-size:1.2em;">
	<!--  로그인 에러메세지 출력 -->
	
	<%= request.getAttribute("LoginErrMsg") == null? "" : request.getAttribute("LoginErrMsg") 

			
	%>

</span>

<%
	if(session.getAttribute("UserId") == null){ //로그아웃 상태일 때 
%>
		<!-- 로그아웃 상태일 때 HTML 처리부분 -->
		<script>
			function vallidateForm(form) {
				if(form.user_id.value == ""){
					alert("아이디를 입력해주세요");
					return false;
				}
				if(form.user_pw.value ==""){
					alert("패스워드를 입력해주세요");
					return false;
				}
			}
		</script>
		<form action="LoginProcess.jsp" method="post" name="LoginFrm" 
				onsubmit="return vallidateForm(this);">
			<p> 아이디 : <input type = "text" name="user_id">
			<p> 패스워드 : <input type = "password" name="user_pw">
			<p> <input type="submit" value="로그인하기">
	
		</form>
		
			
<% }else{ //로그인 상태일 때  %>  
		<!-- 로그인 상태일 때 HTML 처리부분 -->
	<%if(session.getAttribute("Grade").equals("vip")){ %>	
		<div style="background-color: red; width: 100px; height: 20px;">vip</div>
	<%}else if(session.getAttribute("Grade").equals("gold")){ %>
		<div style="background-color: yellow; width: 100px; height: 20px;">gold</div>
	<%}else{ %>	
		<div style="background-color: blue; width: 100px; height: 20px;">silver</div>	
	<% } %>	
	
	<%= session.getAttribute("Grade") %>
	<%= session.getAttribute("UserName") %> 회원님 , 로그인하셨습니다 <br>
	<a href ="Logout.jsp">[로그아웃]</a>

<% } %>

	
	





</body>
</html>