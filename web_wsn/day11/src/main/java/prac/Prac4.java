package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prac4")
public class Prac4 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String[] foods = {"삼겹살", "족발", "소곱창", "막창", "백순대"};
		
		request.setAttribute("foods", foods);
		
		request.getRequestDispatcher("WEB-INF/views/prac4.jsp").forward(request, response);
		
	}

}
