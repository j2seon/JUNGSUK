package sec02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first003")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		System.out.println("요청확인됨");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		//resp.addHeader("Refresh","5;url=second02");//서블릿을 요청시 다른 서블릿으로 이동 
		//resp.addHeader("Refresh","5;url=index.jsp");
		//resp.sendRedirect("index.jsp"); //jsp페이지로
		
		out.print("<script type = 'text/javascript'>");
		out.print("location.href='second003?name=ju&pwd=111';");
		//out.print("location.href='index.jsp';");
		out.print("</script>");
		
	}

	
	
	
}
