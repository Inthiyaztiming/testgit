package restAPIS;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
/*

Whatever the approach we have used for json response validation, it will be almost same for xml also with few different methods.

 */
public class ParsingvalidatingxmlResponse
{
	@Test(description="This is the approach one for validating the response body in which we directly validate responses using rest assured methods without storing response")
	public void testingxmlResponse() 
	{
		given()
		
		.when()
		 .get("http://restapi.adequateshop.com/api/Traveler?page=1")
		 
		 .then()
		  .statusCode(200)
		  .body("TravelerinformationResponse.page", equalTo("1"));//We are traversing from parent to child with dot(.)
	}
	
	
	
	@Test(description="In this approach, we store the entire response in a single variable and then perform validations on that variable using"
			+ " TestNG assertions. This method offers enhanced support for validating complex responses effectively.")
	public void testingxmlResponsevariable() 
	{
		Response res= given()
		 
		 .when() 
		  .get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), "200");
		String pageNo= res.xmlPath().get("TravelerinformationResponse.page").toString();
		Assert.assertEquals(pageNo, "1");
		  
		//String name = res.xmlPath().getString("user.name");alternate for line 47
	}
	
	
	@Test(description="finding total number of travellers")
	public void travellerNoxmlResponse() 
	{
		Response res= given()
				.when()
				.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlobj= new XmlPath(res.asString());
		List<String> travellers= xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		Assert.assertEquals(travellers.size(), 10);
			
			
	}
	
	@Test(description="Verifying traveller name is present in response or not")
	public void travellerSearchxmlResponse() 
	{
		Response res= given()
				.when()
				.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlobj= new XmlPath(res.asString());
		List<String> travellers= xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		boolean status=false;
		for(String traveller:travellers) 
		{
			if(traveller.equals("Vijay"));
			status=true;
			break;
		}
		Assert.assertEquals(status, true);
	}

	
	
	
	
	
	

}
