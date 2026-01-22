package restAPIS;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Authentications 
{
	@Test(description="This is the basic authentication which takes username and password and logs in")
	public void testBasicAuthentication() 
	{
		given()
		 .auth().basic("postman", "password")//Credentials sent as Base64-encoded string and Less secure
		 
		.when()
		 .get("https://postman-echo.com/basic-auth")
		 
		.then()
		 .statusCode(200)
		 .body("authenticated", equalTo("true"))
		 .log().all();
		
		
	}
	
	@Test(description="This is the digest authentication which takes username and password and logs in")
	public void testDigestAuthentication() 
	{
		given()
		 .auth().digest("postman", "password")//Credentials aren’t sent directly.Instead, a hash is created using the username, password
		 
		.when()
		 .get("https://postman-echo.com/basic-auth")
		 
		.then()
		 .statusCode(200)
		 .body("authenticated", equalTo("true"))
		 .log().all();
		
		
	}
	
	
	@Test(description="This is the preemptive authentication which takes username and password and logs in")
	public void testPreemptiveAuthentication() 
	{
		given()
		 .auth().preemptive().basic("postman", "password")//Credentials sent as Base64-encoded string and Less secure,Same as Basic
		 
		.when()
		 .get("https://postman-echo.com/basic-auth")
		 
		.then()
		 .statusCode(200)
		 .body("authenticated", equalTo("true"))
		 .log().all();
	}

	@Test(description="bearer token we pass with headers in given() method not in auth")
	public void testBearerTokenAuthentication() 
	{
		String bearerToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";  //dummy token taken from gpt
		
		given()
		  .headers("Authorization", "Bearer " + bearerToken) //refer headers section in postman in which we can see a field of authorization when we select bearer token in authorization section
		 
		.when()
		 .get("https://api.github.com/users/repos")
		 
		.then()
		 .statusCode(200)
		 .log().all();
	}
	
	@Test(description="OAuth1 uses multiple credentials which are mentioned below	")
	public void testOauth1Authentication() 
	{
		
		given()
		   .auth().oauth("consumerkey", "consumersecret", "accesstoken", "tokensecret")
		 
		.when()
		 .get("")
		 
		.then()
		 .statusCode(200)
		 .log().all();
	}
	
	
	@Test(description="OAuth2 uses single bearer token")
	public void testOauth2Authentication() 
	{
		
		given()
		   .auth().oauth2("accesstoken")
		 
		.when()
		 .get("")
		 
		.then()
		 .statusCode(200)
		 .log().all();
	}
	@Test
	public void testApiKeyAuthentication() 
	{
		
		given()
		   .queryParam("apikey", "keyvalue")
		 
		.when()
		 .get("")
		 
		.then()
		 .statusCode(200)
		 .log().all();
	}	
	
}
