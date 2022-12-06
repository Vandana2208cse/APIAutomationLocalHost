package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class QueryParameter {
	

		@Test(enabled = false)
	    public void QueryParameter1() {

	        Response resp = RestAssured.given().queryParam("id","3").header("Content-Type", "application/json").when()
	                .get("http://localhost:3000/User");
	        
	        // Extract the response code and response message and print it
	        System.out.println("********************************************************************");
	        System.out.println(resp.asString());
	        System.out.println("The status Code is :" + resp.statusCode());
	        System.out.println("The status response line s :" + resp.statusLine());
	        System.out.println("********************************************************************");
	        Response resp2 = RestAssured.get("http://localhost:3000/User");
	        System.out.println(resp2.asString());
	    }
	

}
