package BasicRequests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataReadingFromPOJOClass {
	
	
	
	//POJO CLass code
	
	@Test(enabled = true)
	    public void POST() throws JsonProcessingException {
	        RestAssured.baseURI = "http://localhost:3000";
	        
	        
//	        // Reading the data from POJO Class for the payload details
//	        WorkerPOJOClass objPojo = new WorkerPOJOClass();
//	        objPojo.setDesignation("VIP3");
//	        objPojo.setName("Sonia");
//
//	                
//	        // Object Mapper
//	        ObjectMapper mapper = new ObjectMapper();
//	        String jsonBodyData = mapper.writeValueAsString(objPojo);
//	        
//	        RestAssured.given().log().all().body(jsonBodyData)
//	                // Giving header details are important
//	                .header("Content-Type", "application/json").when().post("/Worker");
//	        Response resp2 = RestAssured.get("http://localhost:3000/Worker");
//	        System.out.println(resp2.asString());
	        
	        
	      //Deserializaion code ---Back to pojo object
	      
	        WorkerPOJOClass objPojo2 =RestAssured.given().get("http://localhost:3000/Worker/8")
	                        .as(WorkerPOJOClass.class);
	                
	                WorkerPOJOClass.ToString(objPojo2);
	                
	        

}
}