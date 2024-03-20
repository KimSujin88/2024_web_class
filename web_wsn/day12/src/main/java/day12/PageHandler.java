package day12;

public class PageHandler {

	 int  currentPage;          //현재페이지
	 int  totRecords ;          // 총 레코드 수 	 
	 int  pageSize ;              //페이지 사이즈  (데이터 건수 , 한 페이지에 보이는 레코드 수 )	 	 
	 int  totalPage;             // 총 페이지수: 전체 페이수   
	  
	 int  grpSize=5 ;             // 한 그룹에 5깨씩 보겟다
	 int  currentGrp ;  	      // 현재그룹
	 int  grpStartPage;           // 현재그룹의 시작번호
	 int  grpEndPage;             // 현재그룹의 마지막번호
	
	 
	 public PageHandler(int currentPage, int totRecords, int pageSize) {
		super();
		this.currentPage = currentPage;
		this.totRecords = totRecords;
		this.pageSize = pageSize;
		
		calcPage();
	}
	 
	 
	 public PageHandler() {
		// TODO Auto-generated constructor stub
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public int getTotRecords() {
		return totRecords;
	}


	public int getPageSize() {
		return pageSize;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public int getGrpSize() {
		return grpSize;
	}

	public int getCurrentGrp() {
		return currentGrp;
	}

	public int getGrpStartPage() {
		return grpStartPage;
	}

	public int getGrpEndPage() {
		return grpEndPage;
	}	
		
	private void calcPage() {		
		// total페이지 수 
		int remain = totRecords  % pageSize ;		
		if( remain==0) {
			totalPage = totRecords/pageSize;
		}else {
			totalPage = totRecords/pageSize +1;
		}
				
		// 현재그룹 구하기	
		
		int remain2  = currentPage  % grpSize;
		
		if( remain2  ==0) {
			currentGrp  = currentPage / grpSize;
		}else {
			currentGrp  = currentPage / grpSize+1;
		}
		
		
		// 그룹시작, 그룹 끝 구하기		
		grpStartPage  = ( currentGrp -1) * grpSize +1;
		grpEndPage = currentGrp *grpSize;
						
		//1 =>  1  ~ 5		
		// 그룹의 끝 확인하고 변경하기
		
		// 총페이지수 확인하고 그룹의 끝이 변경되어야 함 
		if( grpEndPage > totalPage) {
			grpEndPage =totalPage;
		}
	}
	
	public static void main(String[] args) {
		// public PageHandler(int currentPage, int totRecords, int pageSize) {
		PageHandler handler = new PageHandler(6, 30, 4);   // 1  ,  1  ,  5
				
				
		System.out.println(handler.getCurrentPage());
		System.out.println( "현재그룹"+ 	handler.getCurrentGrp());
		System.out.println( "현재그룹의 시작"+ handler.getGrpStartPage());
		System.out.println( "현재그룹의 끝" +handler.getGrpEndPage());
		System.out.println( "total페이지" +handler.getTotalPage());
				
		
		
	}
	
	
}
