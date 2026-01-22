package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser 
{
	@Test
	public void testUpdateUser(ITestContext context) 
	{
		//int id=(int) context.getAttribute("user_id");// Accessible by only one test tag 
		int id=(int) context.getSuite().getAttribute("user_id");// Accessible by entire suite in xml file
		
		Faker faker= new Faker();
		JSONObject data= new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender","Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status","active");
		
		String bearerToken="";
		
	
		given()
		 .headers("Authorization","Bearer "+bearerToken)
		 .contentType("application/json")
		 .body(data.toString())
		 .pathParam("id", id)
		.when()
		 .put("https://gorest.co.in/public/v2/users/{id}")
		 
		.then()
		 .statusCode(200)
		 .log().all();
		
		
		
	}

}
