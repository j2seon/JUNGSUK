<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<h2> session ������ Ư�� �Ӽ�(�ʵ�)�� ���� ����(removeAttribute())</h2>

<h4>=======���� ������ �����ϱ� �� ==========</h4>

<%
	String user_id = (String) session.getAttribute("userID");
	String user_pw = (String) session.getAttribute("userPW");
	
	out.println("������ ���� �̸� userID : " + user_id);
	out.println("<p> ������ ���� �̸� userPW : " + user_pw);
	
	//���� ��ü�� ����� Ư�� �Ӽ��� �����Ѵ�.(�ϳ���)
	//��ٱ��Ͽ� ���� ���� session�� ���� �� Ư�� ���� ������ �� ����Ѵ�.
	session.removeAttribute("userID");	// Ű(�̸�)���� ��������Ѵ�.
	
%>

<h4>=======���� ������ ���� �� ==========</h4>

<%
	user_id = (String) session.getAttribute("userID");
	user_pw = (String) session.getAttribute("userPW");
	
	out.println("������ ���� �̸� userID : " + user_id);
	out.println("<p> ������ ���� �̸� userPW : " + user_pw);
	
%>

</body>
</html>