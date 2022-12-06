package APIRequest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assertion {

		
		@Test(enabled = true)
	    public void Assertion() {

	        Response resp = RestAssured.given().queryParam("id","3").header("Content-Type", "application/json").when()
	                .get("http://localhost:3000/Food");
	        
	        
	        System.out.println("********************************************************************");
	        System.out.println(resp.asString());
	        System.out.println("The status Code is :" + resp.statusCode());
	        System.out.println("The status response line s :" + resp.statusLine());
	        assertEquals(200, resp.statusCode());
	        assertNotNull(resp.statusCode());
	        System.out.println("********************************************************************");
	        Response resp2 = RestAssured.get("http://localhost:3000/Food");
	        System.out.println(resp2.asString());
	    }

}
