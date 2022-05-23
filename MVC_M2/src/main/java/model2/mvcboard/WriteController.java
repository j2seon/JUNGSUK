package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import fileupload.FileUtil;
import utils.JSFunction;



/**
 * Servlet implementation class WriteController
 */
@WebServlet("/mvcboard/write.do")
public class WriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get 방식 요청 처리  
		//List,jsp(view 페이지)에서 글쓰기를 쿨릭했을 때 글쓰기 뷰페이지(write.jsp)
		
		//view 페이지로 전송 
		request.getRequestDispatcher("/mvcboard/write.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식 요청 처리 
		//write.jsp 페이지에서 전송을 클릭했을 때 form에서 넘어오는 변수의 값을 처리
		//form에서 파일을 전송하므로 cos.jar 라이브러리의 객체 생성 후 변수으 ㅣ값을 받아야한다.
		
		//1.파일 업로드처리 ==========================
			//saveDirectory 변수에 업로드할 서버의 물리적인 경로에 저장되도록 설정.
		String saveDirectory = request.getServletContext().getRealPath("/Uploads");
		
			//maxPostSize: 업로드할 최대 용량 (web.xml에 설정되어있다.)
			ServletContext application = getServletContext();
			
			int maxPostSize = Integer.parseInt(application.getInitParameter("maxPostSize")); 
			
			//파일 업로드 객체 생성 ()
			MultipartRequest mr = FileUtil.uploadFile(request, saveDirectory, maxPostSize);
		
			// 객체 생성 실패 시 처리할 내용  
			if(mr == null) { // 객체생성 실패 (1MB 이상의 용량의 파일 전송시 )
				JSFunction.alertLocation(response, "첨부용량이 초과되었습니다.", "../mvcboard/write.do");
				
				return;
			} 
			
		 
		//2. 파일업로드 외 처리 (Form의 변수 값 처리 )================
			//폼에서 넘겨받은 값을 받아서 DTO(VO)에 setter 주입을 하고 DAO에 insert메소드에 전달.
			//form >> DTO >> DAO 로 이동.
			
			MVCBoardDTO dto = new MVCBoardDTO();
			
			dto.setName(mr.getParameter("name"));
			dto.setTitle(mr.getParameter("title"));
			dto.setContent(mr.getParameter("content"));
			dto.setPass(mr.getParameter("pass"));
			
			//원본 파일 이름과 저장 파일이름 설정
			String fileName = mr.getFilesystemName("ofile"); //첨부파일이름 ~
			System.out.println("ofile"+fileName);
			if(fileName!=null) { //첨부파일이 비어있지 않다면
				
				//새로운 파일이름으로 변경해서 서버에 저장함.(서버의 해당파일이 존재할 경우가 있으므로)
				String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
				System.out.println("now : " + now);
				//확장자만잘라서 
				String ext =fileName.substring(fileName.lastIndexOf("."));
					System.out.println("ext : " + ext);
					
				//서버에 저장할 파일이름 생성
					String newfileName = now + ext;
					
					System.out.println(newfileName);
					
				//파일명 변경
					File oldfile = new File(saveDirectory+File.separator+fileName);
					File newfile = new File(saveDirectory+File.separator+fileName);
					System.out.println("oldfile:"+oldfile);
					System.out.println("newfile"+newfile);
					
					oldfile.renameTo(newfile);
					
					//DTO에 setter 주입(조건 : 파일을 업로드한 경우에만)
					dto.setOfile(fileName); //원래 파일이름
					dto.setSfile(newfileName);	//서버에 저장될 파일이름
					
			}
			
			// DTO에 객체를 DAO의 insert메소드를 호출해서 DB에 저장. 
				MVCBoardDAO dao = new MVCBoardDAO();
				
				int result = dao.insertWrite(dto); 
				
				//객체종료 메소드 호출 (rs.stmt.psmt,con 모두 종료 )
				dao.close();
				
			//글쓰기 성공일때 이동할 페이지 
				if(result==1) {//성공일때 list페이지로 이동
					response.sendRedirect("../mvcboard/list.do");
				}
				
			//글쓰기 실패일때 이동할 페이지 
				if(result==0) { //실패일때 다시 글쓰기 페이지로 이동  
					response.sendRedirect("../mvcboard/write.do");
				}
			
			
			
	}

}
