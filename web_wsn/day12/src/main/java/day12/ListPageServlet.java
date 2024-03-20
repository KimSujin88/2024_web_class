package day12;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list.page")
public class ListPageServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String p = request.getParameter("p");
		
		int currentPage=1;		
		int pageSize=2;
		
		
		if( p != null) {
			currentPage = Integer.parseInt(p);
		}
		
		// 고객목록 
		// 전체고객수 (레코드 수)		
		MemberService service = new MemberService();
		ArrayList<Member> list= service.getListPaging(currentPage, pageSize);
		int totalCnt = service.getTotalCnt();
		
		
		request.setAttribute("list",list);
		
		request.setAttribute("totalCnt", totalCnt);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("currentPage", currentPage);
		
		request.getRequestDispatcher("WEB-INF/views/list1.jsp").forward(request, response);
		
		
	}
}
