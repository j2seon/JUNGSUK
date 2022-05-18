package model2.mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.DBConnPool;

public class MVCBoardDAO extends DBConnPool{

	//기본생성자 호출시 부모클래스를 호출 ==> db랑 연동이 되겠징?
	public MVCBoardDAO() {super();} //DBCConnPoll객체의 기본 생성자 호출, DBCP에서 con 객체 활성화

	//검색 조건에 맞는 게시물 갯수를 반환한다.
	public int selectCount(Map<String, Object> map) {
		
		int totalCount = 0; //초기값
		String query = "select count(*) from mvcboard"; //레코드의 총 개수 , 조건이 없으면 총개수가 나온다.
			if(map.get("searchWord") != null) { //검색기능을 사용했을 때 where 조건 //검색한 값이 있다면 
				query += "where" + map.get("serchField") + " " + "like '%" + map.get("serchWord") + "%'";
			}
			
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1); //레코드 개수 가져옴
		} catch (Exception e) {
			System.out.println("게시물 카운트 중 예외발생");
			e.printStackTrace();
		}
		
		return totalCount;
	}
	
	//검색조건에 맞는 게시물 목록을 반환합니다.
		//DataBase에서 Select 한 결과 값을 DTO에 담아서 리턴 시켜줌
	public List<MVCBoardDTO> selectListPage( Map<String,Object> map){ //리스트안에 user객체가 들어간다. 
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>(); //인터페이스인 리스트를 vector로 구현하게싸
		String query =" "
				+ "select * from ("
				+ "Select Tb.*, rownum rnum from ( "
				+ "select * from mvcboard ";
		
		if(map.get("searchWord") !=null) { //검색기능을 사용했라면 
			query += " where "+ map.get("searchField")
			+"Like '%" + map.get("searchWord")+"%' ";
		}
			query += " Order by"
					+" ) Tb "
					+") "
					+" where rnum between ? And ?";
			
			
			try { //pstmt 객체 생성 후 쿼리 실행
				pstmt = con.prepareStatement(query); //prepareStatement 갹체 생성
				pstmt.setString(1, map.get("start").toString());
				pstmt.setString(2, map.get("end").toString());
				rs = pstmt.executeQuery(); //select한 결과같을 rs에 저장.
				
				//rs 의 저장된 값을 DTO에 저장시킨다. ==> DTO 객체를 list에 add
			while(rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setOfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto); //List에 DB의 rs에서 하나의 레코드값을 dto에 저장하고 
								//dto를 List에 추가 
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		return board;	//board는 DTO객체를 저장하고 있다.
	}
	
	
	
	//목록 검색(Select) : 주어진 일련변호에 대한 값을 DTO에 담아 반환.(한페이지 read)
	
	
	//데이터 삽입(Insert)
	public int InsertWrite(MVCBoardDTO dto) {
		int result = 0;
		
		try {
			String query = "insert into mvcboard ( " 
						+ "idx, name , title, content, ofile,sfile,pass)"
						+ "values( "+"seq_board_num.nextval, ?,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(query); //PretaredStatement
			pstmt.setString(1, dto.getName());
			pstmt.setNString(2, dto.getContent());
			pstmt.setString(4, dto.getOfile());
			pstmt.setString(5,dto.getSfile());
			pstmt.setString(6, dto.getPass());
			
			result = pstmt.executeUpdate(); // insert가 실패하면 0 아니면 0보다 큰값 //DB에 값을 저장.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	} 
	
	
	
	//데이터 수정(Update)
	
	//데이터 삭제(Delete)
	
	//데이터 검색(Select 특정조건으로)
	
	
	
	
}
