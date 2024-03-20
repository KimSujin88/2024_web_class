package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/regReview")
public class ReviewReg  extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));		
		String str="";
		String line="";		
		while(  ( line  = reader.readLine()) != null) {
			str  +=  line;
		
		}		
		System.out.println( str);
		
				
		JSONObject  o = new JSONObject(str);
		String id  = o.getString("id");
		String content  = o.getString("content");
		
		Review review = new Review( id, content);
		
		ReviewService service  = new ReviewService();
		service.registerReview(review);
		
		
		
	}
}
