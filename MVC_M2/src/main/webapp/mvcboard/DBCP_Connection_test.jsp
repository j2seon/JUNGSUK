<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import = "common.DBConnPool" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

 <h3> DBCP 目池记 抛胶飘 </h3>
<%
DBConnPool pool = new DBConnPool();    //目池记 按眉 积己 

	pool.close();    //目池记 按眉 馆吵
%>


</body>
</html>