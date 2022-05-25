package membership;

import common.DBConnPool;

public class MemberDAO extends DBConnPool{
	
	public MemberDAO(){
		super(); //기본생성자 호출 시 con 생성
	}
	
	//클라이언트의 ID와 password 값을 받아서 회원테이블의 정보와 일치하는지 확인 후 일치하는 회원 정보 dto에 담아서 반환
	
	public MemberDTO getMemberDTO(String id, String pass) {
		MemberDTO dto = new MemberDTO();
		String sql = "select * from member where id=? and pass =?";
		//1개의 레코드가 출력되면 id pass가 일치하는 것(존재) 
		//0개 나오면 일치하는 값이 없다.
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			rs = psmt.executeQuery();
			
			//rs의 값을 DTO에 저장
			
			if(rs.next()) { //레코드가 존재하면 rs.next(); 이름을 넣어도되고, index를 넣어도된다.
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
				
				System.out.println("인증 성공");
			}else {
				System.out.println("인증 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("일치하는 회원정보가 없습니다.");
		}
		return dto; //client에서 id, pass 를 받아서 db 검색 후 검색된 값을 dto에 담아서 반환한다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
