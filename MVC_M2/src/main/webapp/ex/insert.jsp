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
	//1.인코딩을한다
	//2.값을 받을 변수 선언한다.
	
	request.setCharacterEncoding("EUC-KR");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//3. 디비와연결한다!
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
	<!-- 위에서 넣어준 값을 import 해준다.  -->
	<c:import var="url" url="select.jsp"/>
	
	 ${url}
 




</body>
</html>