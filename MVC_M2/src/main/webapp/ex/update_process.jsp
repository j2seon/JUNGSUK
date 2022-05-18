<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>수정?</title>
</head>
<body>
<%
 	request.setCharacterEncoding("EUC-KR");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
%>
	<sql:setDataSource var ="data"
	  url = "jdbc:oracle:thin:@localhost:1521:XE"
      driver="oracle.jdbc.driver.OracleDriver"
      user = "HR2" password="1234" />
	<sql:update dataSource="${data }"  var="resultSet" >
		update member set name = ?  where id = ? and pass = ?
   		<sql:param value = "<%= id %>"/>
   		<sql:param value = "<%= pwd %>"/>
	</sql:update> 
	
	<c:import var="url" url="select.jsp"/>
	
	

</body>
</html>