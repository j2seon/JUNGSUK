<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �߰��� �� ����.</title>
</head>
<body>
<form method ="post" action = "update_process.jsp" > 
		<p> ���̵� : <input type = "text" name = "id"> 
		<p> ��й�ȣ : <input type ="password" name = "pwd"> 
		<p> <input type="submit" value ="����"> 
	</form>

</body>
</html>