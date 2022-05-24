package sec02.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second004") //response.addHead 
public class secondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html;charset=utf-8");
		
		String name = req.getParameter("name");
		String pwd =req.getParameter("pwd");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("RequestDispatcher를 이용한 redirect 실습입니다.");
		out.println("name : "+ name);
		out.print("pwd : "+ pwd);
		out.print("</body></html>");

	}
	
	
	
	
}
