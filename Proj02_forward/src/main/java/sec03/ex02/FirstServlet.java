package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first0002")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		System.out.println("요청확인됨");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		req.setAttribute("address", "서울시 강남구 역삼동");
		req.setAttribute("email", "aaa@aaa.com");
		RequestDispatcher dis = req.getRequestDispatcher("second0002");
		dis.forward(req, resp);

		
		//resp.sendRedirect("index.jsp"); //jsp페이지로
		
		
	}

	
	
	
}
