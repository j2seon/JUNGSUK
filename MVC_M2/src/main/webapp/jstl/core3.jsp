<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>구구단 출력 </title>
</head>
<body>
<h3>구구단 출력</h3>
	<table>
		<c:forEach var ="i" begin ="1" end = "9">
		<tr>
		<c:forEach var ="j" begin ="1" end="9">
			<td width =100> ${i} * ${j} = ${ i *j}</td>
		</c:forEach> 		
		</tr>
	</c:forEach>
	</table>

</body>
</html>