package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnPool {
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs; 
	
	//기본 ?��?��?�� 
	public DBConnPool() {
		
        try {
            // JDBC ?��?��?���? 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // DB?�� ?���?
            String url = "jdbc:oracle:thin:@localhost:1521:xe";  
            String id = "hr2";
            String pwd = "1234"; 
            con = DriverManager.getConnection(url, id, pwd); 

            System.out.println("DB������ �Ǿ����ϴ�.");
        }
        catch (Exception e) {            
            e.printStackTrace();
        }
		
		
/*		
 * System.out.println("DBCP 객체 출력 ");
		try {
			//?��켓에 ?��?��?�� 커넥?�� ?? (DBCP) ?���? ?��?��?���?
			Context initCtx = new InitialContext(); 
			Context ctx = (Context)initCtx.lookup("java:comp/env"); 
			DataSource source = (DataSource)ctx.lookup("dbcp_myoracle"); 
			
			//커넥?�� ???�� ?��?��?�� ?���? ?���? 
			con = source.getConnection();
			
			System.out.println("커넥?��??(DBCP) ?���? ?���?");
			
		}catch (Exception e) {
			System.out.println("커넥?��??(DBCP) ?���? ?��?��");
			e.printStackTrace(); 	//?���? 메세�? 출력 : ?��?��?�� ?���? 출력 
			System.out.println(e.getMessage()); //?���? 메세�? 출력 (간략 ?���?)
		}	
		
			*/
	}
	
	//�ڿ� ���� ����  (�ڿ� �ݳ�) : close() �޼ҵ� ȣ��� �ڿ��� �ݳ��ϵ��� ���� 

    public void close() {
        try {            
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (psmt != null) psmt.close();
            if (con != null) con.close();  

            System.out.println("DB Ŀ�ؼ� Ǯ �ڿ� �ݳ�");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	

}