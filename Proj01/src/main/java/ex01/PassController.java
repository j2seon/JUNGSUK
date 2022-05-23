package ex01;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/pass.do")
public class PassController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//±€ ªË¡¶
		String id = req.getParameter("id");
		String mode = req.getParameter("mode");
		
		MemberDAO dao = new MemberDAO();
		boolean confirmed = dao.check(id);
		MemberDTO dto = new MemberDTO();
		if(confirmed) {
			mode = 
			 dto = dao.MemSelectCheck(id);
			int result = dao.Memdelete(id);
			dao.close();
		}
		
	}
	
}
