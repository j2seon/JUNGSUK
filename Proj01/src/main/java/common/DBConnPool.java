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
	
	//ê¸°ë³¸ ?ƒ?„±? 
	public DBConnPool() {
		
        try {
            // JDBC ?“œ?¼?´ë²? ë¡œë“œ
            Class.forName("oracle.jdbc.OracleDriver");

            // DB?— ?—°ê²?
            String url = "jdbc:oracle:thin:@localhost:1521:xe";  
            String id = "hr2";
            String pwd = "1234"; 
            con = DriverManager.getConnection(url, id, pwd); 

            System.out.println("DB¿¬°áÀÌ µÇ¾ú½À´Ï´Ù.");
        }
        catch (Exception e) {            
            e.printStackTrace();
        }
		
		
/*		
 * System.out.println("DBCP ê°ì²´ ì¶œë ¥ ");
		try {
			//?†°ì¼“ì— ?„¤? •?•œ ì»¤ë„¥?…˜ ?? (DBCP) ? •ë³? ?–»?–´?˜¤ê¸?
			Context initCtx = new InitialContext(); 
			Context ctx = (Context)initCtx.lookup("java:comp/env"); 
			DataSource source = (DataSource)ctx.lookup("dbcp_myoracle"); 
			
			//ì»¤ë„¥?…˜ ???„ ?†µ?•´?„œ ?—°ê²? ?–»ê¸? 
			con = source.getConnection();
			
			System.out.println("ì»¤ë„¥?…˜??(DBCP) ?—°ê²? ?„±ê³?");
			
		}catch (Exception e) {
			System.out.println("ì»¤ë„¥?…˜??(DBCP) ?—°ê²? ?‹¤?Œ¨");
			e.printStackTrace(); 	//?˜¤ë¥? ë©”ì„¸ì§? ì¶œë ¥ : ??„¸?•œ ? •ë³? ì¶œë ¥ 
			System.out.println(e.getMessage()); //?˜¤ë¥? ë©”ì„¸ì§? ì¶œë ¥ (ê°„ëµ ? •ë³?)
		}	
		
			*/
	}
	
	//ÀÚ¿ø ¿¬°á ÇØÁ¦  (ÀÚ¿ø ¹İ³³) : close() ¸Ş¼Òµå È£Ãâ½Ã ÀÚ¿øÀ» ¹İ³³ÇÏµµ·Ï ¼³Á¤ 

    public void close() {
        try {            
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (psmt != null) psmt.close();
            if (con != null) con.close();  

            System.out.println("DB Ä¿³Ø¼Ç Ç® ÀÚ¿ø ¹İ³³");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	

}