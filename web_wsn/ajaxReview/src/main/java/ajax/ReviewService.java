package ajax;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReviewService {

	 
	ReviewDAO dao = new ReviewDAO();
	
	
	
	public ArrayList<Review> getReviewList(){		
		return dao.selectAll();
	}
	
	

	public    JSONArray  getFoodJsonArray() {		
		ArrayList<Review> list  = dao.selectAll();		
		JSONArray arr = new JSONArray();
		
		for( int i=0; i<list.size() ;i++) {
			Review review = list.get(i);
			JSONObject o = new JSONObject();
			o.put("id",  review.getId());
			o.put("content",  review.getContent());				 
			arr.put(o);
		}
		
		
		return arr;	  
	}
	
	
	
	public int registerReview( Review review) {
		return dao.insertReview(review);
		
	}
	
	
	public int modifyReview( Review review) {
		return dao.updateReview(review);
	}
	
	
	public int cancleDelete(String id) {
		return dao.deleteReview(id);
	}
	
	
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		 System.out.println( service.getFoodJsonArray());
	}
}
