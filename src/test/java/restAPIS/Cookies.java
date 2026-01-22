package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import io.restassured.response.Response;

public class Cookies 
{
	@Test(description="Here we are validating cookies with its values which dynamically changes everytime so this test should fail")
	public void testCookies() 
	{
		when()
		.get("https://www.google.com/")
		
		.then()// we are directly validating response without storing response in any variable so we use then method here
		.cookie("AEC","cookie value")
		.cookie("ACE", "cookie value")
		.log().all();
	}
	
	
	
	@Test(description="For Getting single cookie value-> We use getcookie method which return type is string,"
			+ "			+ \"and we do this in get() method, no need of then() method here because we are not validating anything just extracting cookie value")
	public void getSingleCookieInfo() 
	{
		Response res= given()	
				
		.when()
		.get("https://www.google.com/");//The res variable contains the complete response returned by the GET request. Since it holds the 
		//entire response, we can perform validations directly on this variable.
	
		String cookie_value=res.getCookie("AEC");
		System.out.println(cookie_value);
	}
	
	
	
	
	
		@Test(description="For getting all the cookie values we use getcookies method which return type is map"
				+ " we first extract all keys using keyset method which is cookie name and then we"
				+ "	need to extract cookie value using its key by loop ")
		public void getMultipleCookiesInfo() 
		{
			Response res=given()
					
			.when()
			.get("https://www.google.com/");
			//As we are storing entire response in one variable and performing validations on that variable so we dont need then() method here,
			//we can directly validate in get method 
			
			
			Map<String, String>cookies_values=res.getCookies();
			
			for(String key:cookies_values.keySet()) 
			{
				String cookie_value=res.getCookie(key);
				System.out.println(cookie_value);
			}
		}
}