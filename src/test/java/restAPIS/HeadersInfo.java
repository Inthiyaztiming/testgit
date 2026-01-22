package restAPIS;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeadersInfo
{
	@Test(description="validating response headers in then() method")
	public void testHeaders() 
	{
		when()
		.get("https://www.google.com/")
		
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.header("Content-Encoding", "gzip")
		.header("server", "gms");
	}
	
	@Test(description="Getting single header information in get() method, no need of then() method here because we are not validating anything just extracting cookie value")
	public void getSingleHeaderInfo() 
	{
		Response res= given()
		
		
		.when()
		.get("https://www.google.com/");
		String headerValue= res.getHeader("Content-Type");
		System.out.println(headerValue);
		
	}
	
	
	
	
	@Test(description="here return type of getheaders is Headers and remaing code is similar to cookies concept")
	public void getMultipleHeadersInfo() 
	{
		Response res= given()
		
				
				.when()
				.get("https://www.google.com/");
		
	 	Headers myHeaders= res.getHeaders();
		for(Header hd:myHeaders) 
		{
			System.out.println(hd.getName()+hd.getValue());
		}
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
