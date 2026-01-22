package restAPIS;

import com.github.javafaker.Faker;

public class FakerLibrary 
{
	public void generateDummyData() 
	{
		Faker dummyData=new Faker();
		dummyData.name().firstName();
		dummyData.name().lastName();
		dummyData.name().fullName();
		dummyData.address();
		dummyData.country();
		dummyData.name().username();
		dummyData.internet().safeEmailAddress();
		dummyData.phoneNumber().cellPhone();
		
	}

}
