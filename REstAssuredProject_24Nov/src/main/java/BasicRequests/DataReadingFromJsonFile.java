package BasicRequests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataReadingFromJsonFile {
	
	@Test(enabled = true)
    public void POST() {

        RestAssured.baseURI = "http://localhost:3000";
        RestAssured.given().log().all().body(new File("./Data.json")).header("Content-Type", "application/json").when().post("/User");
        Response resp2 = RestAssured.get("http://localhost:3000/User");
        System.out.println(resp2.asString());
    }

}
