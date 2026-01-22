package restAPIS;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Practice 
{
	String id;
	@Test
	public void sample() 
	{
		Map<String,String> data= new HashMap<>();
		data.put("name", "test");
		Response res = given()
		.body(data)
		.contentType(ContentType.JSON)
		
		.when()
		.get("https://reqres.in/api/users?page=2");
		 Assert.assertEquals(res.getStatusCode(), "200");
	
	}
	
	public void sample1() 
	{
		
		given()
		.auth().oauth2("aaaa")
		.when()
		
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.log().all();
	
	}
	
	
}	
