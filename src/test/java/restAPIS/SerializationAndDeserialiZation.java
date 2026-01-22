package restAPIS;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationAndDeserialiZation 
{
	@Test(description="Using databind package and object mapper class we are converting pojo object into json which is called serialization")
	public void convertPojo2Json() throws JsonProcessingException 
	{
		Pojo_Postrequest stuPojo= new Pojo_Postrequest();
		stuPojo.setName("Inthiyaz");
		stuPojo.setMobile("9999999999");
		stuPojo.setLocation("India");
		String courseArray[]= {"Selenium", "TestNG"};
		stuPojo.setCourses(courseArray);
		
		
		
		ObjectMapper objmapper= new ObjectMapper();
		String jsonData= objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(stuPojo);//Using these methods in object wrapper class we converted pojo object data into json
		System.out.println(jsonData);
		
	}
	
	
	@Test(description="Using databind package and object mapper class we are converting json into pojo which is called deserialization")
	public void convertJson2Pojo() throws JsonProcessingException 
	{
		String jsonData="{\r\n"
				+ "    \"name\": \"Inthiyaz\",\r\n"
				+ "    \"location\": \"India\"\r\n"
				+ "    \"mobile\" :\"9999999999\"\r\n"
				+ "    \"courses\" :[\"Selenium\", \"TestNG\"]\r\n"
				+ "}";
		
		
		
		ObjectMapper objmapper= new ObjectMapper();
		
		//Here return type is pojo class which is pojo_postrequest not a string
		Pojo_Postrequest stuPojo= objmapper.readValue(jsonData, Pojo_Postrequest.class);//Using these methods in object wrapper class we converted json into pojo
		System.out.println(stuPojo.getName());
		System.out.println(stuPojo.getLocation());
		System.out.println(stuPojo.getMobile());
		System.out.println(stuPojo.getCourses());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
