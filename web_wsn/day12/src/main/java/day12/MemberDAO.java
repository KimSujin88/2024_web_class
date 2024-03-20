package day12;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	 

	public Connection dbcon() {
		
		Connection  con= null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return con;	
		
	}
		
	public ArrayList<Member> selectPaging( int page  , int pageSize){		
		 Connection con  =dbcon();	
		 ArrayList<Member> list = new ArrayList<>();	
		 
		 int start=(page-1)*pageSize+1;
		 int end=  page * pageSize;		   // 1      3   (1~3)  
		                                   // 2      3   (4~6)
		                                   // 3      3   (7~9)   
		 
		 System.out.println( start);
		 System.out.println( end);
		 String sql=" select  num , m_id, m_pw, m_name, m_tel, m_birthday, m_point , m_grade   from ";
		 		sql += "(" ;
		 		sql += "   select  rownum  num  ,  m_id, m_pw, m_name, m_tel, m_birthday, m_point , m_grade ";
		 		sql += "   from member_tbl_11 " ;
		 		sql += " ) " ;
		 		sql += " where num  between  ?  and  ?  ";		 
		 try {
			 PreparedStatement  pst= con.prepareStatement(sql);
			 pst.setInt(1, start);
			 pst.setInt(2, end);			 
			 ResultSet  rs  = pst.executeQuery();
			 
			 while( rs.next()) {				 
				 System.out.println( rs.getString(2));
				 String m_id  = rs.getString(2);
				 String m_pw  = rs.getString(3);
				 String m_name  = rs.getString(4);
				 String m_tel  = rs.getString(5);
				 String m_birthday  = rs.getString(6);
				 int m_point  = rs.getInt(7);
				 String m_grade  = rs.getString(8);				 
				 Member member = new Member(m_id,m_pw, m_name,m_tel,m_birthday,m_point,m_grade);
				 list.add(member);				 
			 }			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return list;
		
	}
	
	// 총레코드수 반환 	
		public int getTotal() {		
			int cnt=0;		
			Connection con =dbcon();
			String sql=" select  count(*) from member_tbl_11";
			try {
				PreparedStatement   pst= con.prepareStatement(sql);
				ResultSet  rs =pst.executeQuery();			
				if( rs.next()) {
					cnt  = rs.getInt(1);
				}			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return cnt;
		}
	
	
   public static void main(String[] args) {
	   MemberDAO dao = new MemberDAO();
	   ArrayList<Member>  list =dao.selectPaging(1, 3);
	   
	   System.out.println(  list.get(0).getM_name( ));
	   
   }
	

}
