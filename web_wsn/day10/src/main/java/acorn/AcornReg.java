package acorn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


@WebServlet("/reg")
public class AcornReg  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));		
		String str="";
		String line="";
		while( ( line =reader.readLine())  !=null  ) {
			str+=line;			
		}				
		System.out.println( str);			
		JSONObject bodyData  = new  JSONObject(str);		
		String id  = bodyData.getString("id");
		String pw  = bodyData.getString("pw");
		String name  = bodyData.getString("name");
		
		System.out.println( id);
		System.out.println( pw);
		System.out.println( name);
			
		Acorn acorn = new Acorn(id, pw, name);
		AcornService service = new AcornService();
		service.registerMember(acorn);		
		
	}
}
