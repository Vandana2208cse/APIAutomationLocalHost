package APIRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Basic5APIRequest {
	
	@Test(enabled=false)
	public void GET() {
		
		Response resp= RestAssured.get("http://localhost:3000/Food");
		System.out.println(resp.asString());
	}
	
	@Test(enabled=false)
	public void Post(){
		

        RestAssured.baseURI = "http://localhost:3000";
        String Body = "    {\r\n" + 
        		"        \"fruits\": [\r\n" + 
        		"            \"apple\",\r\n" + 
        		"            \"orange\",\r\n" + 
        		"            \"pear\"\r\n" + 
        		"        ],\r\n" + 
        		"        \"vegetables\": [\r\n" + 
        		"            {\r\n" + 
        		"                \"veggieName\": \"potato\",\r\n" + 
        		"                \"veggieLike\": true,\r\n" + 
        		"                \"id\": 1\r\n" + 
        		"            },\r\n" + 
        		"            {\r\n" + 
        		"                \"veggieName\": \"broccoli\",\r\n" + 
        		"                \"veggieLike\": false,\r\n" + 
        		"                \"id\": 2\r\n" + 
        		"            }\r\n" + 
        		"        ],\r\n" + 
        		"        \"id\": 4\r\n" + 
        		"    }";
        
        RestAssured.given().log().all().body(Body).header("Content-Type", "application/json").post("/Food");
        Response resp2 = RestAssured.get("http://localhost:3000/Food");
        System.out.println(resp2.asString());
    }
	
	@Test(enabled = false)
    public void Delete() {
        Response resp = RestAssured.when().delete("http://localhost:3000/Food/4");
        System.out.println(resp.statusCode());
        System.out.println(resp.statusLine());
	
	
     }
	
	
	@Test(enabled = false)
    public void PUT() {
        String Body = " {\r\n" + 
        		"            \"fruits\": [\r\n" + 
        		"                \"apple\",\r\n" + 
        		"                \"orange\",\r\n" + 
        		"                \"pear\"\r\n" + 
        		"            ],\r\n" + 
        		"            \"vegetables\": [\r\n" + 
        		"                {\r\n" + 
        		"                    \"veggieName\": \"potato_5\",\r\n" + 
        		"                    \"veggieLike\": true,\r\n" + 
        		"                    \"id\": 1\r\n" + 
        		"                },\r\n" + 
        		"                {\r\n" + 
        		"                    \"veggieName\": \"broccoli_5\",\r\n" + 
        		"                    \"veggieLike\": false,\r\n" + 
        		"                    \"id\": 2\r\n" + 
        		"                }\r\n" + 
        		"            ],\r\n" + 
        		"            \"id\": 1\r\n" + 
        		"        }";

        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .put("http://localhost:3000/Food/5");
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/Food/5");
        System.out.println(resp2.asString());
    }
	
	@Test(enabled = false)
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
	
	
	


