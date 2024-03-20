package acorn;

import java.sql.*;
import java.util.ArrayList;

public class AcornDAO {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	
	public Connection dbcon() {		
		Connection con= null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println(" db ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		return con;		
	}	
	


	public ArrayList<Acorn> selectAll(){		
		Connection con  =dbcon();
		String sql ="select * from acorntbl";
		
		ArrayList<Acorn> list  = new ArrayList<>();
		try {
			PreparedStatement pst  =con.prepareStatement(sql);
			ResultSet rs  =pst.executeQuery();
			
			while( rs.next()) {				
				//System.out.println( rs.getString(1));
				String id  = rs.getString(1);
				String pw  = rs.getString(2);
				String name  = rs.getString(3);				
				Acorn acorn  = new Acorn(id, pw, name);
				list.add(acorn);				
			}				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		return list;		
	}
 
	
	
	public void insertAcorn( Acorn acorn) {
		
		 Connection  con  =dbcon();		 
		 String sql="insert into acorntbl values( ? ,?,?)";
		 
		 try {
			 PreparedStatement   pst=con.prepareStatement(sql);
			 pst.setString(1, acorn.getId());
			 pst.setString(2, acorn.getPw());
			 pst.setString(3, acorn.getName());
			 
			 pst.executeUpdate();			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
				
	}
	
	
	public static void main(String[] args) {
		AcornDAO dao  = new AcornDAO();
		//dao.dbcon();		
		//ArrayList<Acorn> list  =dao.selectAll();
		//System.out.println( list.get(0).getId());
		
		Acorn acorn = new Acorn("test10" ,"0000","테스트");
		dao.insertAcorn(acorn);
	}

}
