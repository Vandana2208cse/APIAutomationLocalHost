package BasicRequests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.RestAssured;

public class DataReadingFromPOJOClassDeserialization {
	
	@Test(enabled = true)
    public void POST() throws JsonProcessingException {
        RestAssured.baseURI = "http://localhost:3000";
 
      
        UserPOJOClass objPojo2 =RestAssured.given().get("http://localhost:3000/User/8").as(UserPOJOClass.class);
                
                UserPOJOClass.ToString(objPojo2);

}
}
