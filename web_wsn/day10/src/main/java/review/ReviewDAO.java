package review;

import java.sql.*;
import java.util.ArrayList;

public class ReviewDAO {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	 public  Connection dbcon() {		 
		 Connection  con=null;
		 try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println("db ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch blockif(
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return con;
	 }
	
	
			
	public ArrayList<Review> selectAll(){		
		Connection con = dbcon();
		String sql ="select * from reviewtbl";
		ArrayList<Review> list = new ArrayList<>();
		try {
			PreparedStatement  pst= con.prepareStatement(sql);
			ResultSet rs  = pst.executeQuery();
			
			while( rs.next()) {
				//System.out.println( rs.getString(2));
				String id  = rs.getString(1);
				String content  = rs.getString(2);				
				Review review = new Review( id, content);
				list.add(review);			
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;		
	}	
	
	
	public  void  insertReview( Review review) {
		Connection con  = dbcon();
		String sql="insert into reviewtbl values(?,?)";
		try {
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, review.getId());
			pst.setString(2, review.getContent());			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public void updateReview( Review review) {		
		Connection con  =dbcon();
		String sql="update reviewtbl set content=? where id=? ";
		try {
			PreparedStatement  pst= con.prepareStatement(sql);
			pst.setString(1, review.getContent());
			pst.setString(2, review.getId());
			
			pst.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}		
	public void deleteReview( String id) {		
		Connection con = dbcon();
		String sql="delete from reviewtbl where id  =?";		
		try {
			PreparedStatement pst =	con.prepareStatement(sql);
			pst.setString(1, id);			
			pst.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {		
		ReviewDAO dao = new ReviewDAO();
		//dao.selectAll();
		//dao.deleteReview("2");
		//dao.insertReview( new Review("4", "만족스럽다!"));
		//dao.updateReview(new Review("4" , "너무 좋아요 ^"));
	}
	
}
