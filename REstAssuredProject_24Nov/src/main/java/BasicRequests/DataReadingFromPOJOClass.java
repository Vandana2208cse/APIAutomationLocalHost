package BasicRequests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataReadingFromPOJOClass {
	
	

	//Serialization code ---
	
	@Test(enabled = true)
	    public void POST() throws JsonProcessingException {
	        RestAssured.baseURI = "http://localhost:3000";
	        
	        
	        // Reading the data from POJO Class for the payload details
	        UserPOJOClass objPojo = new UserPOJOClass();
	        objPojo.setFirstname("Pari");
	        objPojo.setLastname("singh");
	        objPojo.setEmailid("p@gmail.com");
	        objPojo.setDesignation("Student");

	                
	        // Object Mapper
	        ObjectMapper mapper = new ObjectMapper();
	        String jsonBodyData = mapper.writeValueAsString(objPojo);
	        
	        RestAssured.given().log().all().body(jsonBodyData).header("Content-Type", "application/json").when().post("/User");
	        Response resp2 = RestAssured.get("http://localhost:3000/User");
	        System.out.println(resp2.asString());
	        
	        

	        

}
	

}
