package BasicRequests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataProviderMethod {

    @Test(enabled = true, dataProvider = "DP1")
    public void PATCHUsingDataProvider(String ID) {

        String Body = "    {\r\n" + 
        		"        \"firstname\": \"vandana"+ID+"\"\r\n" + 
        		"    }";
        
        
        Response resp = RestAssured.given().header("Content-Type", "application/json").body(Body).when()
                .patch("http://localhost:3000/User/" + ID);
        
        System.out.println("********************************************************************");
        System.out.println("The status Code is :" + resp.statusCode());
        System.out.println("The status response line s :" + resp.statusLine());
        System.out.println("********************************************************************");
        Response resp2 = RestAssured.get("http://localhost:3000/User/" + ID);
        System.out.println(resp2.asString());
    }
	
	
	
	// Data provider method
    @DataProvider(name = "DP1")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "1" }, { "3" }, { "4" } };
    }

}
