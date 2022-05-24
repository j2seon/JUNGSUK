package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second002")
public class secondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String pwd =req.getParameter("pwd");
		
		
		out.print("<html><body>");
		out.println("name : "+ name);
		out.print("pwd : "+ pwd);
		out.print("</body></html>");

	}
	
	
	
	
}
