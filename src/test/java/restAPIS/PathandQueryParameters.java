package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class PathandQueryParameters 
{

	//https://reqres.in/api/users?page=2&id=5
	//We always define the path and query parameters in given() method not in url(when() method) directly because they will be different for every request
	
	public void testPathandQueryParameters() 
	{
		given()
		.pathParam("mypath","users")//path parameter(Users) we are saving it in a variable mypath and passing using curly braces in URL in when() method
		.queryParam("page", 2)
		.queryParam("id", 5)
		
		.when()
		.get("https://reqres.in/api/{mypath}")//query parameters(page&id)we define in given method as prerequisit so no need to write again in URL
		
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
}
