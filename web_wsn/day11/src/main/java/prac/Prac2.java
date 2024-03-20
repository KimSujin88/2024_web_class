package prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prac2")
public class Prac2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String data="안녕하세요";
		request.setAttribute("data" , data);
		
		request.getRequestDispatcher("WEB-INF/views/prac2.jsp").forward(request, response);
	}
}
