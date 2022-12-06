package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DataReadingUsingJSONPath {
	
	@Test(enabled=true)
	public void Post(){
		

        RestAssured.baseURI = "http://localhost:3000";
        Response resp2 = RestAssured.get("http://localhost:3000/User");
        System.out.println(resp2.asString());
        
        JsonPath obj =new JsonPath(resp2.asString());
        int ArraySize=obj.getInt("Users.size()");
        System.out.println("Number of objects are:" +ArraySize);
        System.out.println(obj.getString("firstname"));
        System.out.println(obj.getString("firstname[2]"));
        
    }
	

}
