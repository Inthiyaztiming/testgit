package PracticePackage;

import java.util.NoSuchElementException;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG2 
{
	@Test(invocationCount = 3)
    public void retryTestMultipleTimes() {
        System.out.println("Running same test 3 times using invocationCount");
    }

    @Test(enabled = false)
    public void skippedTestExample() {
        System.out.println("This test will be skipped using enabled=false");
    }

    @Test(timeOut = 2000)
    public void testTimeoutExample() throws InterruptedException {
        Thread.sleep(1500); // Passes because < 2000ms//timeout exception if fails
    }

    
    @Test(expectedExceptions = NoSuchElementException.class)
    public void conditionalSkip() {
        boolean condition = true;
        if (condition) {
            throw new SkipException("Skipping dynamically using SkipException");
        }
    }

    @Test
    public void softAssertExample() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(1, 2, "Soft assertion failed but test continues");//Event this fails next step will be executed 
        soft.assertEquals(2, 2, "This will pass");
        soft.assertAll();//All the failures will be collected by this method if this is not called failures are ignored without any error or failure.
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"admin", "admin123"},
            {"user1", "wrongPass"},
            {"test", "1234"}
        };
    }

   @Test(dataProvider = "loginData")//we can also pass partial data to the test using "indices" attribute
    public void dataProviderWithIndices(String username, String password) {
        System.out.println("Running only selected rows using indices: " + username + "/" + password);
  }
}


