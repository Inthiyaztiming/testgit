package restAPIS;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/*
given() -> we define everything thats needed before sending a request such as, 
Base URL / Base URI, Headers, Query Parameters, Path Parameters,Request Body,Cookies,Authentication,content type.. etc

When()-> we define the  http methods here
get, post,put,patch,delete,options,head etc


then() -> we validate or assert the response. This is where we check if the response meets the expectations you set.
status code, Response Body,Response Time,Headers,Cookies


given() – Preconditions: Setup request parameters like headers, body, authentication, etc.

when() – Action: Perform the HTTP request (GET, POST, etc.).

then() – Assertions: Validate the response's status, body, headers, etc.

In Rest Assured, methods like given(), when(), and then() need to be imported statically from the RestAssured class. These static imports
aren't automatically added by most IDEs by hovering which usually happens, so you must manually include them from rest assured website 
which we added above.

given is optional and if we dont have any prerequisit we can either remove given method or can keep empty method both are allowed.
 */

public class ApiChaining {
	int id;

	@Test
	public void getUSers() {
		given()

				.when().get("https://reqres.in/api/users?page=2")

				.then().statusCode(200).body("page", equalTo(2)).log().all();
	}

	@Test(description = "when() is returning id below and that id we are capturing in given() and we need to use this id in other methods also we "
			+ "have declared a global variable with same name which automatically maps to local id ")
	public void createUser() {

		HashMap<String, String> data = new HashMap<>();
		data.put("name", "morpheus");
		data.put("job", "leader");

		id = given().contentType(ContentType.JSON).body(data)

				.when().post("https://reqres.in/api/users").jsonPath().getInt("id");
	}

	@Test(dependsOnMethods = { "createUser" }, description = "id we are using here is from create User method")
	public void updateUser() {
		HashMap<String, String> data = new HashMap<>();
		data.put("name", "inthiyaz");
		data.put("job", "Automation Tester");

		given().contentType(ContentType.JSON).body(data)

				.when().put("https://reqres.in/api/users/" + id)

				.then().statusCode(200).log().all();

	}

	@Test(dependsOnMethods = { "createUser" }, description = "id we are using here is from createUser method")
	public void deleteUser() {
		when().delete("https://reqres.in/api/users/" + id)

				.then().statusCode(204).log().all();
	}

}
