package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first0001")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		System.out.println("��ûȮ�ε�");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		req.setAttribute("address", "����� ������ ���ﵿ");
		req.setAttribute("email", "aaa@aaa.com");

		
		resp.sendRedirect("second0001");//������ ��û�� �ٸ� �������� �̵� 
		
		//resp.sendRedirect("index.jsp"); //jsp��������
		
		
	}

	
	
	
}
