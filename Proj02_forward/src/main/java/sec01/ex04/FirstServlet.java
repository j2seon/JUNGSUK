package sec01.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first04") //dispatcher�� ����� ������ �̵�
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		System.out.println("��ûȮ�ε�");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		//resp.addHeader("Refresh","5;url=second02");//������ ��û�� �ٸ� �������� �̵� 
		//resp.addHeader("Refresh","5;url=index.jsp");
		//resp.sendRedirect("index.jsp"); //jsp��������
		
		//out.print("<script type = 'text/javascript'>");
		//out.print("location.href='second03';");
		//out.print("location.href='index.jsp';");
		//out.print("</script>");
		
		//url�� �ּҰ� �ٲ��� �ʴ´� �������� ó���ϱ� ������ 
		//RequestDispatcher dis = req.getRequestDispatcher("second04");
		RequestDispatcher dis = req.getRequestDispatcher("index.jsp");
		dis.forward(req, resp);
		
	}

	
	
	
}
