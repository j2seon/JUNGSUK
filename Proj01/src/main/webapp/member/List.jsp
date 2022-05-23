<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list 페이지</title>
</head>
<body>
<h2>목록</h2>

 <form method="get">  
 	<input type="hidden" name="id" value = "${param.id }" />
 	<input type="hidden" name="mode" value ="${param.id }"/>
	<table border="1" width="90%">
		<tr>
            <th width="10%">아이디</th>
            <th width="*">비밀번호</th>
            <th width="15%">이름</th>
            <th width="10%">이메일</th>
            <th width="15%">날짜</th>
            <th width="15%">삭제하기</th>
            
        </tr>
  <c:choose>
    <c:when test="${ empty boardLists }"> 
  		<tr>
            <td colspan="6" align="center">
                등록된 게시물이 없습니다
            </td>
        </tr>
  	</c:when>
  <c:otherwise>
    <c:forEach items="${ boardLists }" var="row" varStatus="loop">
    	<tr align="center">
    	 	<td>${ row.id }</td>
    	 	<td>${ row.pwd }</td>
    	 	<td>${ row.name }</td>
    		<td>${ row.email }</td>
    		<td>${ row.date }</td>
    		<td><button type="button" onclick="">삭제하기</button></td>
    	</tr>

    </c:forEach>     
  </c:otherwise> 
  </c:choose>        
	</table>
</form>

</body>
</html>