package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class WaystoCreatePostrequestBody 
{
	
	@Test(description="Approach 1 ->Sending request body for post method using hashmap")
	public void testPostusingHashmap() 
	{
		
		HashMap<String, Object> data = new HashMap<>();
		data.put("name", "inthiyaz");
		data.put("location", "india");
		data.put("mobile", "9999999999");

		String courseArray[] = { "Selenium", "TestNG" };
		data.put("courses", courseArray);//As we can store only one value per key we created an array of courses and stored into courses key because we have multiple courses
		
		
		given()
		.contentType(ContentType.JSON)
		.body(data)
		
		.when()
		.post("")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("inthiyaz"))
		.body("location",equalTo("india"))
		.body("mobile", equalTo("9999999999"))
		.body("courses[0]",equalTo("Selenium"))
		.body("courses[1]", equalTo("TestNG"))
		.header("ContentType","application/json; charset=utf-8")
		.log().all();
	}
	
	@Test(description="Approach 2 ->Sending request body for post method using JsonObject Class, for this we need org.json dependency as prerequisit in pom.xml")
	public void testPostusingJsonObject() 
	{
		JSONObject data = new JSONObject();
		data.put("name", "inthiyaz");
		data.put("location", "india");
		data.put("mobile", "9999999999");

		String courseArray[] = { "Selenium", "TestNG" };
		data.put("courses", courseArray);
		
		given()
		.contentType(ContentType.JSON)
		.body(data.toString())// Unlike hashmap we cant directly pass data we need to convert into string if we are using json object
		
		.when()
		.post("")// any sample api
		
		.then()
		.statusCode(201)
		.body("name", equalTo("inthiyaz"))
		.body("location",equalTo("india"))
		.body("mobile", equalTo("9999999999"))
		.body("courses[0]",equalTo("Selenium"))
		.body("courses[1]", equalTo("TestNG"))
		.header("ContentType","application/json; charset=utf-8")
		.log().all();
	}
	
	@Test(description="Approach 3 ->Sending request body for post method using pojo class")
	public void testPostusingPojoClass() 
	{
		Pojo_Postrequest data = new Pojo_Postrequest();
		data.setName("inthiyaz");
		data.setLocation("India");
		data.setMobile("9999999999");
		
		String courseArray[]= {"Selenium", "TestNG"};
		data.setCourses(courseArray);
		
		given()
		.contentType(ContentType.JSON)
		.body(data.toString())// Unlike hashmap we cant directly pass data we need to convert into string if we are using json object
		
		.when()
		.post("")// any sample api
		
		.then()
		.statusCode(201)
		.body("name", equalTo("inthiyaz"))
		.body("location",equalTo("india"))
		.body("mobile", equalTo("9999999999"))
		.body("courses[0]",equalTo("Selenium"))
		.body("courses[1]", equalTo("TestNG"))
		.header("ContentType","application/json; charset=utf-8")
		.log().all();
	}
	
	@Test(description="Approach 4 ->Sending request body for post method using external json file")
	public void testPostusingJsonFile() throws FileNotFoundException 
	{
		File file= new File(".\\body.json"); // for opening file
		FileReader fr= new FileReader(file);// for reading file
		
		JSONTokener jt= new JSONTokener(fr);
		JSONObject data= new JSONObject(jt);
		
		
		given()
		.contentType(ContentType.JSON)
		.body(data.toString())// Unlike hashmap we cant directly pass data we need to convert into string if we are using json object
		
		.when()
		.post("")// any sample api
		
		.then()
		.statusCode(201)
		.body("name", equalTo("inthiyaz"))
		.body("location",equalTo("india"))
		.body("mobile", equalTo("9999999999"))
		.body("courses[0]",equalTo("Selenium"))
		.body("courses[1]", equalTo("TestNG"))
		.header("ContentType","application/json; charset=utf-8")
		.log().all();
	}
	
	
	
	

}
