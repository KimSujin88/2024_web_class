package day12;

import java.util.ArrayList;

public class MemberService {

	MemberDAO dao = new MemberDAO();
	
	public ArrayList<Member> getListPaging( int page, int pageSize){
		
		return dao.selectPaging(page, pageSize);
	}
	
	
	public int getTotalCnt() {
		return dao.getTotal();
	}
}
