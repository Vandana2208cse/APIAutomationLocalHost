package BasicRequests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstRequest {
	
	@Test(enabled=false)
	public void GET() {
        // First fetch the response in the response container
        Response resp = RestAssured.get("http://localhost:3000/Worker");
        // change the response in string and print it .
        System.out.println(resp.asString());
    }
	
	@Test(enabled = false)
    public void POST() {
        // Basic details which are given to us Should be kept at global level
        // Make sure that there is no space in the URL
        RestAssured.baseURI = "http://localhost:3000";
        String Body = "{\r\n" + "        \"name\": \"Sam7\",\r\n" + "        \"Designation\": \"Engineer\"\r\n"
                + "         }";
        
        // First fetch the response in the response container
        RestAssured
        .given()
        .log().all()
        .body(Body)
                // Giving header details are important
                .header("Content-Type", "application/json")
                .post("/Worker");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker");
        System.out.println(resp2.asString());
    }
	
	@Test(enabled = false)
    public void Delete() {
        // First fetch the response in the response container
        Response resp = RestAssured.when()
                .delete("http://localhost:3000/Worker/4");
        // Extract the response code and response message and print it
        System.out.println(resp.statusCode());
        System.out.println(resp.statusLine());
    }
	@Test(enabled = false)
    public void PUT() {
        // For PUT request , we always have to provide the ID from which you wants to do
        // the changes
        String Body = "{\r\n" + "        \"name\": \"Sam33\",\r\n" + "        \"Designation\": \"Engineer\"\r\n"
                + "         }";
        // First fetch the response in the response container
        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .put("http://localhost:3000/Worker/3");
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker/3");
        System.out.println(resp2.asString());
    }
	
	@Test(enabled = false)
    public void PATCH() {
        // For PATCH request , we always have to provide the ID from which you wants to do
        // the changes
        String Body = "{\r\n" + 
        		"    \"name\":\"Ram\"\r\n" + 
        		"}";
        // First fetch the response in the response container
        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .patch("http://localhost:3000/Worker/3");
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker/3");
        System.out.println(resp2.asString());
    }
	
	
//QueryParameter c oncept passing id as parameter instead of passing directly into url	
	@Test(enabled = false)
    public void QueryParameter() {

        // First fetch the response in the response container
        Response resp = RestAssured.given().queryParam("id","3").header("Content-Type", "application/json").when()
                .get("http://localhost:3000/Worker");
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker");
        System.out.println(resp2.asString());
    }
	
	
	//Assertion Concept to validate what we expect matched with what we recieved in output	
		@Test(enabled = false)
	    public void Assertions() {

	        // First fetch the response in the response container
	        Response resp = RestAssured.given().queryParam("id","3").header("Content-Type", "application/json").when()
	                .get("http://localhost:3000/Worker");
	        // Extract the response code and response message and print it
	        System.out.println("********************************************************************");
	        System.out.println("The status Code is :" + resp.statusCode());
	        System.out.println("The status response line s :" + resp.statusLine());
	        assertEquals(200, resp.statusCode());
	        assertNotNull(resp.statusCode());
	        System.out.println("********************************************************************");
	        Response resp2 = RestAssured.get("http://localhost:3000/Worker");
	        System.out.println(resp2.asString());
	    }
		
	
	
	
	// Passing the ID from dataProvider table using TestNG
    @Test(enabled = true, dataProvider = "DP1")
    public void PATCHUsingDataProvider(String ID) {
        // For PUT request , we always have to provide the ID for which you wants to do
        // the changes
        String Body = "{\r\n" + "     \r\n" + "        \"name\": \"Patch"+ID+"\"\r\n" + "        \r\n" + "         }";
        // First fetch the response in the response container
        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .patch("http://localhost:3000/Worker/" + ID);
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker/" + ID);
        System.out.println(resp2.asString());
    }
	
	
	
	// Data provider method
    @DataProvider(name = "DP1")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "3" }, { "4" }, { "5" } };
    }
	
	

}
