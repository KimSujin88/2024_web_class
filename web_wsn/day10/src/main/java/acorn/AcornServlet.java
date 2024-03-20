package acorn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;


@WebServlet("/acorndata")
public class AcornServlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("application/json;charset=utf-8");
		PrintWriter  out  =response.getWriter();
		AcornService service = new AcornService();		
		JSONArray  list =service.getMembersJSON();		
		out.println( list); 	
		
		
	}
}
