package elprj;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/headers")
public class Header정보가져오기  extends HttpServlet{

	 
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 // 요청 URL 정보 출력
        System.out.print("Request URL: =>");
        System.out.println(request.getRequestURL().toString() );

        // 쿼리 문자열 출력
        System.out.print("Query String:=>");
        System.out.println(request.getQueryString() );

		
		 Enumeration<String> headerNames = request.getHeaderNames();
	        while (headerNames.hasMoreElements()) {
	            String headerName = headerNames.nextElement();
	            System.out.println(    headerName + ": " + request.getHeader(headerName)  );
	        }
		
		
		
		
	}
}
