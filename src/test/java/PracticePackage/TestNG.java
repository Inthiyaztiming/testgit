package PracticePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= {"sanity"})//we can write groups class level also not only method level
public class TestNG {
	@Test(priority = 1, groups = { "Smoke", "Regression" })
	public void validLoginTest() {
		//Assert.assertEquals(loginPage.getHomeMessage(), "Welcome Home");-->If this fails we get Assertion Error
	}

	@Test(priority = 2, groups = { "Regression" }, dependsOnMethods = { "validLoginTest" })
	public void invalidLoginTest() {

		//Assert.assertEquals(loginPage.getHomeMessage(), "Invalid Credentials");
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "admin", "admin123", "Welcome Home" }, { "user1", "pass123", "Invalid Credentials" },
				{ "test", "wrong", "Invalid Credentials" } };
	}

	@Test(dataProvider = "loginData", groups = { "DataDriven" })
	public void dataDrivenLoginTest(String username, String password, String expectedMsg) {
		// loginPage.enterUsername(username);
		// loginPage.enterPassword(password);
		// loginPage.clickLogin();
	}
	

}
