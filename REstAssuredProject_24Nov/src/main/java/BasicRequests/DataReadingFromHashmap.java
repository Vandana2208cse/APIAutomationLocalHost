package BasicRequests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataReadingFromHashmap {
	

	@Test(enabled = true)
    public void POST() {
		
		
        HashMap<String, String> hm = new HashMap<String, String>();
        
        
        hm.put("firstname", "Krishna");
        hm.put("lastname", "singh");
        hm.put("emailid", "k@gmail.com");
        hm.put("designation", "Manager");
       // hm.put("id", "6");
        
        
        RestAssured.baseURI = "http://localhost:3000";
        RestAssured.given().log().all().body(hm).header("Content-Type", "application/json").when().post("/User");
        Response resp2 = RestAssured.get("http://localhost:3000/User");
        System.out.println(resp2.asString());
    }

}
