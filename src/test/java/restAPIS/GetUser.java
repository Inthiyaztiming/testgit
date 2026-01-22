package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUser 
{
	@Test
	public void testGetUser(ITestContext context) 
	{
		//int id=(int) context.getAttribute("user_id");// Accessible by only one test tag 
		int id=(int) context.getSuite().getAttribute("user_id");// Accessible by entire suite in xml file
		
		
		String bearerToken="";
		
		given()
		 .headers("Authorization", "Bearer "+bearerToken)
		 .pathParam("id", id)
		.when()
		  .get("https://gorest.co.in/public/v2/users/{id}")
		  
		.then()
		 .statusCode(200)
		 .log().all();
		
		
	}

}
