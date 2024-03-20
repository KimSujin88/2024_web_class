package acorn;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Acorn>  getMembers(){		
		return dao.selectAll();		
	}
	
	
	// []
	// [  {id:"ks" , pw:"1234" , name:"홍길동}, {id:"abc" , pw:"1234" , name:"김길동}   ];
	public  JSONArray  getMembersJSON() {
		
		ArrayList<Acorn>  list  =dao.selectAll();
		
		JSONArray  arr  = new JSONArray();		
		
		for( int i=0; i< list.size() ; i++) {
			Acorn acorn  = list.get(i);
			JSONObject o = new JSONObject();
			
			o.put("id", acorn.getId());
			o.put("pw", acorn.getPw());
			o.put("name", acorn.getName());			
			
			arr.put(o);			
		}		
		
		System.out.println( arr);		
		return arr;		
	}
	
	
	public void registerMember( Acorn acorn) {		
		dao.insertAcorn(acorn);
	}
	
	
	
	public static void main(String[] args) {
		AcornService  service  = new AcornService();
		service.getMembersJSON();
	}
	
}
