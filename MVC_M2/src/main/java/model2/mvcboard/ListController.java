package model2.mvcboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.BoardPage; //페이징 처리하는 객체 

public class ListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get 방식으로 요청이 왔을 때 서버에서 처리
		//1.DAO 객체 생성(Model : 비즈니스로직처리)
		MVCBoardDAO dao = new MVCBoardDAO();
		
		//2. 뷰에 전달할 매개변수 저장용 맵 생성.(key,Value)
		Map<String, Object> map = new HashMap<String, Object>();
		
		String searchField = req.getParameter("searchField");
		String searchWord = req.getParameter("searchWord");
		
		if(searchWord != null) {//검색어가 존재한다면 ! map에 값을 저장한다.
			map.put("searchField", "searchField");
			map.put("searchWord", "searchWord");
		}
		//게시물 갯수 알아오기(DAO에 selectCount(map))
		int totalCount = dao.selectCount(map);
		
		//System.out.println("totalCount(전체 레코드 수) :" + totalCount);
		//System.out.println("list.do 요청시 controller페이지 잘응답");
		
		/*페이징 처리부분 start */
		ServletContext application = getServletContext();
		int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
		int blockPage =Integer.parseInt(application.getInitParameter("PAGES_PER_PAGE"));
		
//		System.out.println(pageSize);
//		System.out.println(blockPage);
		
		//현재 페이지 확인
		int pageNum = 1;
		String pageTemp =req.getParameter("pageNum");
		if(pageTemp !=null && !pageTemp.equals("")) {
			pageNum = Integer.parseInt(pageTemp) ; // 값이 비어있지 않을 때 넘어온 페잉지 변수를 정수로 변환
		}
		
		//목록에 출력할 게시물 범위 계산 
		int start = (pageNum -1)*pageSize + 1; //첫게시물번호
		int end = pageNum * pageSize; //마지막 게시물 번호
		
		//뷰페이지에 값을 던져줌
		map.put("start",start);
		map.put("end",end);
		
		/*페이징 처리부분 end */
		
		
		//게시물 목록을 받아오기 (DAO 객체에 작업을 전달)
		//boardLists는 Db릐 레코드를 담은 DTO객체를 담고있다. 
		List<MVCBoardDTO> boardLists = dao.selectListPage(map);
		dao.close();
		
		//뷰페이지에 전달할 매개 변수들을 추가 
		String pagingImg = BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, "../mvcboard/list.do");
		
		map.put("pagingImg", pagingImg);
		map.put("totalCount",totalCount);
		map.put("pageSize",pageSize);
		map.put("pageNum",pageNum);
		
		//뷰페이지로 데이터전달, request 영역에 전달할 데이터를 저장 후 List.jsp(뷰페이지)로 포워드
		req.setAttribute("boardLists", boardLists);
		req.setAttribute("map", map);
		req.getRequestDispatcher("/mvcboard/List.jsp").forward(req,resp);

		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Post 방식으로 요청이 왔을 때 서버에서 처리
	}

}
