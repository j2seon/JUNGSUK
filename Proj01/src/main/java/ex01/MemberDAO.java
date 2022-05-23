package ex01;

import java.util.List;
import java.util.Vector;

import common.DBConnPool;

public class MemberDAO extends DBConnPool {
	
	public MemberDAO() {
		super();
	}
	
	
	//List .jsp 출력을 위한 select 
	public  List<MemberDTO> MemSelect() {//
		List<MemberDTO> board = new Vector<MemberDTO>();
		
		
		try {
			String sql = "SELECT * FROM T_member";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setDate(rs.getDate(5));
				
				board.add(dto);
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("select시 예외발생");
		}
		return board;
		
	}
	
	
	
	public boolean check(String id) {
		boolean isCorr = true; 
		
		try {
		String sql = "SELECT * FROM T_member WHERE id= ?";
		psmt = con.prepareStatement(sql);
		rs = psmt.executeQuery();
		
			if (rs.getString(1) == null) {
				isCorr = false; 
			}
		}catch (Exception e) {}
		
		return true;
	}
	
	
	
	
	
	
	public  MemberDTO MemSelectCheck(String id) {//
			MemberDTO dto = new MemberDTO();
		
		
		try {
			String sql = "SELECT * FROM T_member WHERE id= ?";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setDate(rs.getDate(5));
				
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("select시 예외발생");
		}
		return dto;
		
	}
	
	
	
	
	
	
	
	
	//insert
	public int MemInsert (MemberDTO dto) {
		int result = 0;
		try {
			String sql = "INSERT INTO T_member("
					+ "id,pwd,name,,date)"
					+" VALUES (?,?,?,?,?)";
			
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getEmail());
			psmt.setDate(5, dto.getDate());
			
			result =psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insert시 예외발생");
		}
		
		return result;
		
	}
	
	
	public int Memdelete (String id) {
		int result = 0;
		try {
			
			String sql = "DELETE T_member WHERE id = ?"; 
			psmt = con.prepareStatement(sql); 
			psmt.setString(1, "id");
			
			result = psmt.executeUpdate(); 
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("delete시 예외발생");
		}
		return result;		
	}
	
}
