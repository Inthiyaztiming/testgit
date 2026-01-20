package PracticePackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import javaPrograms.GridRunBaseTest;

public class Gridrun extends GridRunBaseTest {

	@Test
	@Parameters("browser")
	public void testGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@Test
	public void testBing() {
		driver.get("https://www.bing.com");
		System.out.println("Bing Title: " + driver.getTitle());
	}

	@Test
	public void testYahoo() {
		driver.get("https://www.yahoo.com");
		System.out.println("Yahoo Title: " + driver.getTitle());
	}
	@Test
	public void testGpt() {
		driver.get("https://chatgpt.com");
		System.out.println("Yahoo Title: " + driver.getTitle());
	}
}
