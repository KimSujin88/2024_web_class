package acorn;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<String>  getMemberList(){	
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("강지훔");
		list.add("김기엽");
		list.add("김수진");		
		return list; 
	}	
	
	public ArrayList<Acorn> getMemberRealList(){	
		 ArrayList<Acorn> list  =dao.selectAll();
		 return list;
		
	}	
	
	 

}
