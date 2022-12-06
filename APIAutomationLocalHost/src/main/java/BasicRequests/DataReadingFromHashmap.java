package BasicRequests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataReadingFromHashmap {

	@Test(enabled = true)
    public void POST() {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("name", "Fourteen");
        hm.put("Designation", "CEO2");
        hm.put("id", "14");
        RestAssured.baseURI = "http://localhost:3000";
        RestAssured.given().log().all().body(hm)
                // Giving header details are important
                .header("Content-Type", "application/json").when().post("/Worker");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker/14");
        System.out.println(resp2.asString());
    }

}
