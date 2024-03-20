package review;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/reviewlist")
public class ReviewList  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out =  response.getWriter();
		
		ReviewService  service  = new ReviewService();
		JSONArray  result = service.getMemberJSON();
		
		out.print(result);
		
		
	}
}
