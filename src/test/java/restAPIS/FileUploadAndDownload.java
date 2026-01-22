package restAPIS;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class FileUploadAndDownload 
{
	@Test(description="For single file upload we use form-data in body section in postman and here multipart method refers form data ")
	public void singleFileUpload() 
	{
		File file= new File("location of the file in our system");
		
		given()
		
		 .multiPart("file",file)// we use file as key for single file upload
		 .contentType("multipart/form-data")
		 
		.when()
		.post("")
		
		
		.then()
		.statusCode(201)
		.body("fieldname", equalTo("Test.txt"));
	}

	@Test
	public void multipleFilesUpload() 
	{
		File file1= new File("location of the file in our system");
		File file2= new File("location of the file in our system");
		
		given()
		
		 .multiPart("files",file1)// we use files as key for multiple files
		 .multiPart("files", file2)
		 .contentType("multipart/form-data")// for file upload this will be the content type
		 
		.when()
		.post("")
		
		
		.then()
		.statusCode(201)
		.body("[0].filename", equalTo("Test1.txt"))
		.body("[1].filename",equalTo("Test2.txt"));
	}
	
	@Test(description="when we upload a file using above method we will get a url in response, when we hit that url and got status code as"
			+ " 200 then we can say that file is downloaded successfully")
	public void fileDownload() 
	{
		given()
		
		.when()
		 .get("url of file which is there in response we get after hitting file upload api")
		 
		 
		.then()
		.statusCode(200)
		.log().body();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
