package sec02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second003") //response.addHead 
public class secondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		String pwd =req.getParameter("pwd");
		
		
		
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("location.href를 이용한 redirect 실습입니다.");
		out.println("name : "+ name);
		out.print("pwd : "+ pwd);
		out.print("</body></html>");

	}
	
	
	
	
}
