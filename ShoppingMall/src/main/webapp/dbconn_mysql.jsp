
<%@ page import = "java.sql.*" %>

<%

	Connection conn = null;
	String driver = "com.mysql.jdbc.Driver";	
	String urll = "jdbc:mysql://localhost:3306/member";
	
	Class.forName(driver);
	conn = DriverManager.getConnection (urll, "jjs", "1q2w3e4r");

%>
