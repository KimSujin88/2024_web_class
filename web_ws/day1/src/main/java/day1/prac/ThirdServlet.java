package day1.prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hap2")
public class ThirdServlet  extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //1~10 수 까지 구해서 응답하는 코드
		
		System.out.println("djdjjf");
		
		String num_ = req.getParameter("num");
		String num2_ = req.getParameter("num2");
		int num  = Integer.parseInt(num_);
		
		int sum=0;
		for(int i=0; i<=num; i++) {
			sum=sum+i;
		}
		
		int num2=2;
		
		
		
		
		
		
		
		
		PrintWriter  out=resp.getWriter();
		out.println(sum);
		
		
		
		
	}
}
