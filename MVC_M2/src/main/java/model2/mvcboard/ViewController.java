package model2.mvcboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get 요청시 처리블락
		//System.out.println("ViewController 정상 작동 (get 요청)");
	
		//게시물 정보 불러오기 (1. 조회수 증가, 2. 게시물 정보 가져오기 )
		MVCBoardDAO dao = new MVCBoardDAO(); 
		String idx = req.getParameter("idx"); 
		
		//조회수 증가
		dao.updateVisitCount(idx); 
		
		//게시물의 자세한 정보 값 가져오기 
		MVCBoardDTO dto = dao.selectView(idx); 
		dao.close();   //객체 반납 
		
		//DataBase의 content 컬럼의 \r\n 을 "<br /> 태그로 변환
		//디비에서 가져올 때는 한라인으로 들어가기때문에 엔터를 해줄 필요가 있다.
		dto.setContent(dto.getContent().replaceAll("\r\n", "<br/>"));
		
		//게시물(dto) 객체를 view 페이지로 전달하기 위한 변수 저장.
		req.setAttribute("dto", dto); 
		req.getRequestDispatcher("/mvcboard/View.jsp").forward(req, resp); 
		
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//post 요청시 처리블락
		System.out.println("ViewController 정상 작동 (post 요청 )");

	}
	
	
	

}
