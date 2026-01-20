package javaPrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class GridRunBaseTest 
{
	 protected WebDriver driver;

	    @Parameters({"browser"})
	    @BeforeMethod
	    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {

	        URL gridUrl = new URL("http://localhost:4444/wd/hub");

	        if (browser.equalsIgnoreCase("chrome")) {
	            ChromeOptions options = new ChromeOptions();
	            driver = new RemoteWebDriver(gridUrl, options);
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            FirefoxOptions options = new FirefoxOptions();
	            driver = new RemoteWebDriver(gridUrl, options);
	        }

	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if(driver != null) {
	            driver.quit();
	        }
	    }
	

}
