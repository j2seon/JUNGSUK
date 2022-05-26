<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업 띄우기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	div#popup{
		position: absolute;
		top: 100px;
		left: 50px;
		color: yellow;
		width: 270px;
		height: 100px;
		background-color: gray;
	}
	div#popup>div{
		position: relative;
		background-color: #ffffff;
		height: 100px;
		border: 1px solid gray;
		padding: 10px;
		color: black; 
	}	
</style>
</head>
<script>

$(function(){
	$('#closeBtn').click(function(){
		$('#popup').hide();
	});
});

</script>


<body>

<%
	String popupMode ="on";

%>

<h2> 팝업메인페이지</h2>
<% 
	for(int i =1; i<=10; i++){
		out.println("현재 팝업 창은 "+popupMode +"상태입니다.<br>");
	}
	if(popupMode.equals("on")){
%>
	<!-- popupMode = on 일때 출력됨 -->
	
	<div id = "popup">
		<h2 align="center"> 공지사항 팝업입니다.</h2>
		<div align="right">
			-- 내용 1 <br>	
			-- 내용 2 <br>
			-- 내용 3 <br> <p>
			<form name="popFrm">
			<input type="checkbox" id="inactiveToday" value="1">
				하루동안 열리지 않기
			<input type ="button" value="닫기" id="closeBtn">	 					
			</form>
		</div>
	</div>
	
	

<% 
	} 
%>



</body>
</html>