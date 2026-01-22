package restAPIS;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class Createuser 
{
	
	
	@Test
	public void testCreateUser(ITestContext context) 
	{
		Faker faker= new Faker();
		JSONObject data= new JSONObject();
		data.put("name", faker.name().fullName());
		data.put("gender","Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status","inactive");
		
		String bearerToken="";
	
	int id= given()
		 .headers("Authorization","Bearer "+bearerToken)
		 .contentType(ContentType.JSON)
		 .body(data.toString())
		 
		.when()
		 .post("https://gorest.co.in/public/v2/users")
		 .jsonPath().getInt("id");
		 
		context.setAttribute("user_id", id);// Accessible by only one test tag 
		context.getSuite().setAttribute("user_id", id);// Accessible by entire suite in xml file means all the tags and classes
}
	



}