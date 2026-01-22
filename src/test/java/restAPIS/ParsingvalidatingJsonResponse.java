package restAPIS;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingvalidatingJsonResponse
{
	@Test(description="This is the approach one for validating the response body in which we directly validate responses using rest assured methods without storing response")
	public void testingJsonResponse() 
	{
		given()
		 .contentType(ContentType.JSON)
		.when()
		 .get("https://reqres.in/api/users?page=2")
		 
		 .then()
		  .statusCode(200)
		  .body("x.mobile", equalTo("9999999999"));//In body.json file we are validating the mobile number field, in json path finder 
		// website we copy the json path of that particular field which we want to validate and compare with value
	}
	
	
	
	@Test(description="In this approach, we store the entire response in a single variable and then perform validations on that variable using"
			+ " TestNG assertions. This method offers enhanced support for validating complex responses effectively.")
	public void testingjsonResponsevariable() 
	{
		Response res= given()
		 .contentType(ContentType.JSON)
		 
		 .when() 
		  .get("https://reqres.in/api/users?page=2");//As we are storing entire response in one variable and performing validations on that 
		      //variable so we dont need then method here,we can directly validate in get method 
		 Assert.assertEquals(res.getStatusCode(), "200");
		 String mobileNumber= res.jsonPath().get("x.mobile").toString();//get method returns object type data so we need to convert that into string
		 Assert.assertEquals(mobileNumber, "9999999999");
		  
		 //String name = res.jsonPath().getString("mobile");alternate of line 42
	}
	
	
	@Test(description="We use this approach if we want to get any element like titles present in json response")
	public void testingJsonResponse3() 
	{
		Response res=given()
		
		.when()
		 .get("");
		 
		 //Here we are fetching all title fields from book array objects using JSONObject class
		 
		 JSONObject jo= new JSONObject(res.toString());// converting Response Type data into json object type
		 for(int i=0;i<jo.getJSONArray("book").length();i++) 
		 {
			String bookTitles= jo.getJSONArray("book").getJSONObject(i).get("title").toString();
		 }
	}
	
	@Test(description="if we need to search or validate for one particular element present in json response or not we use this approach")
	public void titleSearchJsonResponse() 
	{
		Response res= given()
				.when()
				.get("");
		
		 JSONObject jo= new JSONObject(res.toString());
		 
		 boolean status= false;
		 for(int i=0;i<jo.getJSONArray("book").length();i++) 
		 {
			String bookTitle= jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			
			if(bookTitle.equals("The Lord of Rings")) 
			{
				status=true;
				break;
			}
		 }
				
	}
	
	@Test(description="Using this approach we get any integer type fields like prices, add them and compare with expected value")
	public void priceAddJsonResponse() 
	{
		Response res= given()
				.when()
				.get("");
		
		 JSONObject jo= new JSONObject(res.toString());
		 
		 double  totalPrice= 0;
		 
		 for(int i=0;i<jo.getJSONArray("book").length();i++) 
		 {
			String price= jo.getJSONArray("book").getJSONObject(i).get("price").toString();
			totalPrice=totalPrice+ Double.parseDouble(price);
			
		 }
				
	}
	
	
	
	
	
	
	

}
