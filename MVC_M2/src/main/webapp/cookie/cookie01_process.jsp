<%@page import="java.lang.ProcessBuilder.Redirect"%>
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

	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("pass");
	
	if(user_id.equals("admin") && user_pw.endsWith("1234")){
		//��Ű ����, Ŭ���̾�Ʈ�� ��Ű�� ���� ����.
		
		//��Ű�� �����ڿ��� �����̸��� ���� �Ҵ��Ѵ�.set�����ϴ� �޼ҵ尡 ����.
		Cookie cookieid = new Cookie("userID", user_id);
		Cookie cookiepw = new Cookie("userPW", user_pw);
		
		//��Ű ���� 
		//��Ű�� ����� ������ ���
		cookieid.setPath(request.getContextPath());
		cookieid.setMaxAge(60*60); //�ѽð� ��Ű�� �ʴ���
		
		cookiepw.setPath(request.getContextPath());
		cookiepw.setMaxAge(60*60);
		
		//��Ű�� response ��ü�� ����ؼ� Ŭ���̾�Ʈ hdd �� �����ؾߵȴ�
		response.addCookie(cookieid);
		response.addCookie(cookiepw);
		
		out.println("��Ű������ �����߽��ϴ�.");
		out.println(user_id+"�� ȯ���մϴ�.");
		
		//response.sendRedirect("cookie02.jsp");	
	}else{
		out.println("��Ű������ �����Ͽ����ϴ�.");
	}	

%>




</body>
</html>