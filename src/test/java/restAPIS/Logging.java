package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Logging 
{
	@Test
	public void testLog() 
	{
		given()
		
		.when()
		   .get("https://www.google.com/")
		.then()
		    .log().all()//this will print entire response body, cookies, headers,status code in console 
		.log().body()//this will print only response body in console
		.log().headers()//Print only headers in console-> alternative single line approach for getMultipleHeadersInfo() method code no need of that 
		//complicated approach as we can print entire headers using log method in single line
		
		.log().cookies();//Print only cookies in console-> alternative single line approach for getMultipleCookiesInfo() method code no need of that 
		//complicated approach as we can print entire cookies using log method in single line
	}

}
