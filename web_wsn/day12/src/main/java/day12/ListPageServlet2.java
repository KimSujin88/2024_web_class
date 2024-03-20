package day12;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list2.page")
public class ListPageServlet2 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//모델 -> 목록
		//	  -> 페이지에 관련된 데이터 (페이지객체)
		int currentPage=1;
		int pageSize=2;
		
		String p = request.getParameter("p");
		if(p != null) {
			currentPage = Integer.parseInt(p);
		}
		
		
		MemberService service = new MemberService();
		ArrayList<Member> list = service.getListPaging(currentPage, pageSize);
		int totalRecord = service.getTotalCnt();
		PageHandler handler = new PageHandler(currentPage, totalRecord, pageSize);
		
		//request 모델 심기
		request.setAttribute("list", list);
		request.setAttribute("handler", handler);
		
		
		request.getRequestDispatcher("WEB-INF/views/list2.jsp").forward(request, response);
	}
}
