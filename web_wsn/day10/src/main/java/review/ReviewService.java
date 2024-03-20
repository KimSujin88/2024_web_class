package review;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReviewService {
	
	ReviewDAO dao  = new ReviewDAO();	
	
	
	//  [  {id:"1", content:"좋아요"}  ,  {id:"1", content:"좋아요"}    ]
	public JSONArray  getMemberJSON() {
	
		ArrayList<Review>  list  =	dao.selectAll();			//
		
		JSONArray  arr  = new JSONArray();
		for( int i=0; i< list.size() ;i++) {
			Review review = list.get(i);   // {id:"1", content:"좋아요"}
			JSONObject o = new JSONObject();
			o.put("id", review.getId());
			o.put("content", review.getContent());
			
			arr.put(o);			
		}
		
		System.out.println( arr);	
		return arr;		
	}	
	
	public void registerReview( Review review) {
		dao.insertReview(review);
	}	
	public void modifyReview( Review review) {
		dao.updateReview(review);
	}	
	public void cancelReview( String id) {
		dao.deleteReview(id);
	}
	
	
	public static void main(String[] args) {		
		ReviewService service = new ReviewService();
		JSONArray   result  =service.getMemberJSON();
		System.out.println(result );
	}

}
