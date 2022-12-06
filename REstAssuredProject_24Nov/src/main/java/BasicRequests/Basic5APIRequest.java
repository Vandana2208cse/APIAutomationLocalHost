package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Basic5APIRequest {
	
	
	@Test(enabled=false)
	public void GET() {
       
        Response resp = RestAssured.get("http://localhost:3000/User");
        System.out.println(resp.asString());
    }
	
	@Test(enabled=false)
	public void Post(){
		

        RestAssured.baseURI = "http://localhost:3000";
        String Body = "    {\r\n" + 
        		"        \"firstname\": \"Bishnu\",\r\n" + 
        		"        \"lastname\": \"singh\",\r\n" + 
        		"        \"emailid\": \"b@gmail.com\",\r\n" + 
        		"        \"designation\": \"associate-Data\"\r\n" + 
        		"    }";
        
        RestAssured.given().log().all().body(Body).header("Content-Type", "application/json").post("/User");
        Response resp2 = RestAssured.get("http://localhost:3000/User");
        System.out.println(resp2.asString());
    }
	
	
	@Test(enabled = false)
    public void Delete() {
        Response resp = RestAssured.when().delete("http://localhost:3000/User/2");
        System.out.println(resp.statusCode());
        System.out.println(resp.statusLine());
	
	
     }
	
	@Test(enabled = false)
    public void PUT() {
        String Body = "    {\r\n" + 
        		"        \"firstname\": \"vandana\",\r\n" + 
        		"        \"lastname\": \"singh\",\r\n" + 
        		"        \"emailid\": \"v@gmail.com\",\r\n" + 
        		"        \"designation\": \"associate-PerfTest\"\r\n" + 
        		"    }";

        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .put("http://localhost:3000/User/1");
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/User/1");
        System.out.println(resp2.asString());
    }
	
	
	@Test(enabled = true)
    public void PATCH() {

        String Body = "    {\r\n" + 
        		"        \"lastname\": \"kumar\"\r\n" + 
        		"    }";
        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .patch("http://localhost:3000/User/4");
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/User/4");
        System.out.println(resp2.asString());
    }
	
	
}



