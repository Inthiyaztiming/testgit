//------------------------------ CSS SELECTOR syntax-----------------------------

// class name-> tagname.classname or .classname
// id-> tagname#id or #id
// if we dont have any class name or id we have seperate syntax for writing css
// tagname[attribute='value']
// tagname[attribute*='value'] - regular css if somepart of the css is dynamically changing
// writing CSS using tags without any attribute(parent child concept)
// parenttagname<space>childtagname


// -------------------------XPATH SYNTAX---------------------------------

// tagname[@attribute='value']- using attribute
// tagname[@attribute='value'][1]-using index
// tagname[contains(@attribute,'value']- regular xpath if somepart of the xpath is dynamically changing
// parenttagname/childtagname- (parent child concept)
// parenttag/childtag[index number]- if we have multiple child paths


// --------------------Scroll down using JavascriptExecutor-------------------------

// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0, 500)");----Scroll down 500px
//js.executeScript("window.scrollBy(0, -300)");--- Scroll up 300px
//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");---bottom of the page
//js.executeScript("window.scrollTo(0, 0)");-----top of the page
//js.executeScript("arguments[0].scrollIntoView(true);", element);----element into view
//js.executeScript("window.print();");---- for opening print dialog
// js.executeScript("document.body.style.zoom='0.8'"); ----- Adjust zoom level- 1.5 for 150 %, 0.8 for 80% and so on


// --------------------------------------Handling alerts------------------
// driver.switchTo.alert.dismiss(); or accept;
// driver.switchTo.alert.getText();
// Alert usernamealert= driver.switchTo().alert();
// usernamealert.sendKeys("username");
// usernamealert.accept();
// In alert interface we have only four methods which are used above.



// cntrl+shift+F-> To format the alignment of the code


// ----------------------Options class------------------------

// ChromeOptions options= new ChromeOptions();
// options.setAcceptInsecureCerts(true);- handling ssl certifications
//options.addArguments("--incognito");
//ChromeDriver driver = new ChromeDriver(options);
// Location,camera, microphone permission handling alerts can be handled using chromeoptions class

// ----------------------Relative locators---------------------------------

//Introduced in Selenium 4 that helps to locate web elements based on their position relative to other elements.
// driver.findElement(RelativeLocator.with(By.tagName("button")).above(WebElement));
// driver.findElement(RelativeLocator.with(By.tagName("button")).below(WebElement));
// driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(WebElement));
// driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(WebElement));
//near()- Element close to another element (within ~50px)

//----------------------------Switching windows or tabs--------------------------

//Step 1: Store the main or parent window handle
//String pw=driver.getWindowHandle();-----Returns the handle of the current window, Return Type- String,Primarily used for storing the handle of the parent window.

// Step 2: Click on a link that opens a new tab/window
//driver.findElement(By.linkText("Open New Tab")).click();

// Step 3: Get all window handles
//	Set<String>tw= driver.getWindowHandles();- Returns the handles of all open windows, Return Type- Set<String>, Used when dealing with multiple windows (e.g., child windows, tabs).

// Step 4: Loop through handles and switch to the new one
//	for(String cw:tw) 
//	{
//		if(!cw.equals(pw)) 
//		{
//			driver.switchTo().window(cw);
//			break;
//		}
//	}
// Step 5: Perform actions in the new or child window
//		driver.findElement(By.id("")).click();

// Step 6: Close the new window and switch back to main
//driver.close();
//driver.switchTo().window(pw);

// -------------------Why does Selenium use String as return type for window handle method?-----------------------
//Selenium gives each tab or window a unique ID (called a window handle).
//This ID is a String (not an int), like:"CDwindow-6789ADEF56BD90"
//It's not a number, it’s more like a hash/token.

//---------------2. Why Set<String> for getWindowHandles()?--------------------
//Set<String> is used because:
//No duplicates (each handle is unique).
//You don’t care about order, just want to loop through them.
	

//----------------To fetch any name from autosuggesive dropdown using streams-------------

//options.stream().filter(s->s.getText().equalsIgnoreCase("Anurag Daru")).findFirst().ifPresent(WebElement::click);


/*------------------------------------Capturing Screenshot--------------------------------

TakesScreenshot ts= (TakesScreenshot) driver;
File src=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("./screenshot/" + System.currentTimeMillis() + ".png"));
Use webelement.getss method inplace of driver.getss method for capturing particular webelement ss
*/

//-----------------To capture height and width of webelement-------------------------

//System.out.println(webelement.getRect().getDimension().getHeight());
//System.out.println(webelement.getRect().getDimension().getWidth());


//----------------------------------Assertions-------------------------------

//Assert.assertEquals(driver.findElement(By.xpath("")).getText()-->Actual,"These credentials do not match our records.--> Expected");
//Hard Assertions- immediately stop the execution of the test method if the assertion fails.
//Soft Assertions -do not stop the test method when an assertion fails, they continue executing the rest of the test.
//You must call assertAll() at the end to collect the failures.
//If you forget to call softAssert.assertAll(), all soft assertion failures will be ignored.

//When to Use Which?
//Hard Assertions: Use when the test cannot proceed if the condition fails.
//Soft Assertions: Use when you want to check multiple conditions in a single test and report all failures together.


//-----------------------------Selecting value from dropdown using select class----------------------------------

//Select dropdown = new Select(driver.findElement(By.xpath("")));
//dropdown.selectByVisibleText("text visisble in the dropdown");
//subactivity.selectByValue("value attribute value from dom");-> like value='1234'
//component.selectByIndex(index number);-> Index starts from 0
//List<WebElement> we= se.getOptions();- for getting all the dropdown values


//----------------------------Actions class for mouse interactions---------------------------

//Actions actions = new Actions(driver);

//For drag and drop we use actions class like below

//actions.dragAndDrop(from,to).build().perform(); 
//                or
//actions.clickAndHold(sourceElement).moveToElement(targetElement).release(targetElement).build().perform();

//for scrolling we can also use actions class not only javascript
//act.scrollToElement(ele).perform();

//el.sendKeys(Keys.ENTER); To perform enter

//keyDown(Keys.CONTROL): For pressing the Control key
//sendKeys("a"): typing the letter a for selecting all content or c for copy or v for paste
//keyUp(Keys.CONTROL):  For releasing the Control key

	
// To print the links count in the page

//System.out.println(driver.findElements(By.tagName("a")).size());


//To upload file sendkeys method is used and filepath should be used as per the below format

//WebElement upload = driver.findElement(By.cssSelector("input[name='bca_data_csv']"));
//upload.sendKeys(C:\Users\TTIPL\Downloads\filenamer.filetype);


//TestNG Annotation Attributes->description, dependsOnMethods, priority ,enabled, groups, timeOut,

//The "description" attribute provides information about the test.
//public void testcase4(description="This is testcase1")


//@Test(dependsOnMethods = { "testcase4", "testcase5"})
// testcase4,testcase5 will be executed first before executing this test method


// For prioritizing execution of test cases
//@Test(priority = 0)


//To skip the particular testcase
//@Test(enabled = false)

//NoSuchElementException- Selenium never found the element in the first place
//StaleElementReferenceException- Selenium found the element before, but it later became detached

//groups attributes needs to be configured in xml file and can be suite level and test level
//@Test(groups = { "Tagname like sanity, smoke etc" })
//<groups>
//<run>
//<include name="sanity"></include>
//</run>
//</groups>


//@Test(timeOut=200)
//timeOUT attribute with the value 200 means that the testcase will be failed after 200 milliseconds(wait for 200 milliseconds)


//DataProviders
//@DataProvider(name = "testdata")
//
//	public String[][] dataprovider() {
//		 return new String[][] 
//				 {
//			 { "row1col1", "row1col2" },  // First row of data
//	            { "row2col1", "row2col2" }
//				 };
//




//In all types of waits in Selenium, once the condition is satisfied (element found or condition met), 
//the WebDriver proceeds immediately without waiting for the full duration.

//----------------------------------handling authentication alerts-----------------------------------

//To handle authentication alerts (also known as basic authentication dialogs) in Selenium when accessing a URL, 
//you can include the credentials in the URL itself.
//http://username:password@www.example.com(siteurl)

//If we want to access the method which is in the same class we can directly use them by this keyword like "this.methodname()"; if that method is not marked static , no need to create an object also
// If that method is marked static we can access that method by "classname.methodname();" no need to create obj also

//If we want to access the method which is in the other class we can use them using "super" keyword if that method is not static(super.methodname();), no need to create obj also after inheriting
//We can use that method directly like methodname(); if that method is  marked as static as we have used extends keyword

//Git is the tool for version control, while GitHub is a platform that hosts Git repositories or uses Git for collaboration and project management.


//git and jira connection
//build and release difference
//things will do on coming to office on first half as lead
//platform used to test mobiles if we dont have devices
//if we dont find any response in api how to find whats the error
//basic security test cases for one website
//what is apk
//what is authentication and authorisation
//payment gateways types and how to work on them from testing perspective
//any questions for me -> if interviewer asks this question at the end of interview how to answer this



//Scan the entire names or data present from table and extract a particular name and compare the extracted name expected or not
//waits used for timeouts
//testng 
//bdd framework
//override and overload difference
//oops concept
//extent reports
//types of locators which is mostly used and why
//bug encountered which is difficult to reproduce how to solve this
//how to decide priority and severity of the bug
//drawback of manual testing
//challenge faced in entire testing experience
//any innovation work u did for which you got the appreciation from management
//Need to focus on framework and java related topics

