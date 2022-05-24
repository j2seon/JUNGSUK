package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second0001")
public class secondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//이렇게 하면 값이 null 
		
		resp.setContentType("text/html;charset=utf-8");
		
		String address = (String)req.getAttribute("address");
		String email = (String) req.getAttribute("email");
		
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.println("address : "+ address);
		out.print("email : "+ email);
		out.print("</body></html>");

	}
	
	
	
	
}
