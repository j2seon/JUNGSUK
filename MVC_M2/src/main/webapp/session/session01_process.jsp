<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��ü�� ���� �� �Ҵ�</title>
</head>
<body>
<%	//Ŭ���̾�Ʈ ������ id�� �н�����
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("pass");
	
	//DB���� ������ �� 
	if(user_id.equals("admin") && user_pw.equals("1234")){
		//���ǿ� ���� ������ ���� �Ҵ��Ѵ�.
		session.setAttribute("userID", user_id);
		session.setAttribute("userPW", user_pw);
		
		out.println("���Ǽ����� �Ϸ�Ǿ����ϴ�.");
		out.println(user_id + " �� ȯ���մϴ�.");
		
	}else{
		out.println("���Ǽ����� �����߽��ϴ�.");
	}
	


%>
</body>
</html>