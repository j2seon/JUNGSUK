package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnPool {

	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	
	public DBConnPool() {
		//기본 생성자
		
		try {
			//톰켓에 설정한 커넥션 풀(DBCP) 정보얻어오기
			Context initCtx = new InitialContext();
			Context ctx = (Context) initCtx.lookup("java:comp/env");
			DataSource source = (DataSource)ctx.lookup("dbcp_myoracle");
			
			//커넥션 풀을 통해서 연결얻기
			con = source.getConnection();
			System.out.println("커넥션 풀(DBCP연결 성공)");
			
		} catch (Exception e) {
			System.out.println("커넥션 풀연결 실패 ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
	}
	//자원 연결 해제 (자원 반납) : close() 메소드 호출 시 자원을 반납하도록 설정.
	public void close() {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close(); //자원을 커넥션 풀로 반납
				
				System.out.println("DB커넥션 풀 자원 반납");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	
	
}
