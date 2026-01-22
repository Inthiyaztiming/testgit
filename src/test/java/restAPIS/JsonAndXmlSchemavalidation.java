package restAPIS;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class JsonAndXmlSchemavalidation 
{
	@Test(description="We save our schema in one json file under src/test/resources folder and compare whatever the response we get its"
			+ " same as that file schema or not")
	public void jsonSchemavalidaton() 
	{
		given()
		.when()
		 .get("")
		 
		.then()
		 .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storeJsonSchema.json"));//Refer this json file for complete understanding
		}
	
	
	@Test(description="We save our schema in one xml file under src/test/resources folder and compare whatever the response we get its"
			+ " same as that file schema or not")
	public void  xmlSchemavalidaton() 
	{
		given()
		
		.when()
		 .get("http://restapi.adequateshop.com/api/Traveler?page=1")
		 
		.then()
		 .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("storexmlSchema.xsd"));//Refer this xml file for complete understanding
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
