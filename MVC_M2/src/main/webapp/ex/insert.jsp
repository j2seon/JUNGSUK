<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//1.���ڵ����Ѵ�
	//2.���� ���� ���� �����Ѵ�.
	
	request.setCharacterEncoding("EUC-KR");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//3. ���Ϳ����Ѵ�!
%>
	<sql:setDataSource var ="data"
		 url = "jdbc:oracle:thin:@localhost:1521:XE"
     driver="oracle.jdbc.driver.OracleDriver"
     user = "HR2" password="1234" />
     
     <sql:update dataSource = "${data}" var="resultSet" >
		insert into list(id, pwd) values (?,?)
		<sql:param value = "<%= id %>"/>
		<sql:param value = "<%= pwd %>"/>
	</sql:update>
	<!-- ������ �־��� ���� import ���ش�.  -->
	<c:import var="url" url="select.jsp"/>
	
	 ${url}
 




</body>
</html>