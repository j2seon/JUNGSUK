<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String passwd = request.getParameter("psswd");
		String name = request.getParameter("name");
%>			
		<!-- var <변수를 의미한다. -->
		<!--  JSTL로 DataBase Connction 설정 데이터베이스를 불러옴 그게 dataSource에 저장된다. -->
		<sql:setDataSource var ="dataSource" 
		url = "jdbc:oracle:thin:@localhost:1521:XE"
		driver="oracle.jdbc.driver.OracleDriver"
		user = "HR2" password= "1234" />
		
		
		<!-- dataSource에 저장된다. -->
		<sql:update dataSource = "${dataSource}"  var ="resultSet">
			insert into member(id, name, pass) values(?, ?, ?)
			<sql:param value ="<%= id %>"/>
			<sql:param value ="<%= name %>"/>
			<sql:param value ="<%= passwd %>"/>
		
		</sql:update>

		<c:import var ="url" url="sql01.jsp"/>
		${url}
		
		
</body>
</html>