<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
%>			
		<!-- var <������ �ǹ��Ѵ�. -->
		<!--  JSTL�� DataBase Connction ���� �����ͺ��̽��� �ҷ��� �װ� dataSource�� ����ȴ�. -->
		<sql:setDataSource var ="dataSource" 
		url = "jdbc:oracle:thin:@localhost:1521:XE"
		driver="oracle.jdbc.driver.OracleDriver"
		user = "HR2" password= "1234" />
		
		
		<!-- dataSource�� ����ȴ�. -->
		<sql:update dataSource = "${dataSource}"  var ="resultSet">
			delete member where id= ? and pass = ? 
			<sql:param value ="<%= id %>"/>
			<sql:param value ="<%= passwd %>"/>
		
		</sql:update>

		<c:import var ="url" url="sql01.jsp"/>
		${url}
		
		
</body>
</html>