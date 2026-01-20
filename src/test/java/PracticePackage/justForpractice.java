package PracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class justForpractice 
{
	WebDriver driver;
	@Test
	public void test() {
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void test1() 
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");	
		driver.quit();
	
	
	}


}
