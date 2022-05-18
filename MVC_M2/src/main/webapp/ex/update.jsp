<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>값을 추가할 수 있음.</title>
</head>
<body>
<form method ="post" action = "update_process.jsp" > 
		<p> 아이디 : <input type = "text" name = "id"> 
		<p> 비밀번호 : <input type ="password" name = "pwd"> 
		<p> <input type="submit" value ="전송"> 
	</form>

</body>
</html>