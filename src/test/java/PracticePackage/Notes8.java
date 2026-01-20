//--------------------------------OOP Concepts Used in My Automation Framework (Simplified Answer)-----------------------------
//Encapsulation-: Wrapping data (variables) and methods into a single class and controlling access using private/public/protected.
//Each web page in the project is represented by a separate class (using the Page Object Model).
//Each class contains private locators and public methods to interact with them.
//These classes contain locators and related methods to interact with elements like buttons or input fields.
//This hides the internal details of how the interaction is done, and only exposes what the test needs to use — that’s encapsulation.

//Abstraction:-Hiding internal implementation details, exposing only necessary methods.
//Base classes (e.g., BasePage, BaseTest) contain common methods like click(), type(), waitForElement()
//Test classes or pages don’t need to know implementation details — they just call the method.


//Inheritance
//Test classes extend BaseTest to reuse setup, teardown, and WebDriver initialization.
//Page classes can extend BasePage for common page-level methods.


//Polymorphism (Runtime Polymorphism)
//We declare the reference type as WebDriver(not a specific browser class).
//At runtime, based on the our choice, we assign it to different browsers ChromeDriver, FirefoxDriver, etc.
//This lets us use the same WebDriver methods regardless of the browser — that’s runtime polymorphism.

/*
Errors (human mistakes) in coding or design cause defects
Defects (flaws in the product/code), which then lead to bugs - Example:- A flaw or issue in the product/code (caused by an error).
Bugs- The issue  observed during testing or by users.
Failure is the bug observed when the system behaves incorrectly in production.


E-commerce Checkout Example:-
Error → Developer accidentally applies a discount = +10 instead of discount = -10.
Defect → Code logic now adds money instead of subtracting discount.
Bug → During testing, QA sees that a $100 item with 10% discount shows $110 instead of $90.
Failure → In production, customers start being charged extra, leading to complaints.
*/


//-------------------------------StaleElementReferenceException in Selenium-----------------------------
// Why does it happen?
//A StaleElementReferenceException occurs when the WebElement you previously found is no longer attached to the current DOM. 

//Common causes include:
//The page was reloaded or navigated away after locating the element but before interacting with it.
//The DOM was dynamically updated (e.g., the element was removed and re-added or replaced).

//How to handle it:
//Use a try-catch block to catch the exception and retry finding the element.
//Use ExpectedConditions.refreshed() to automatically re-fetch the element if it becomes stale during an explicit wait.
//Example: wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
//This combines waiting for visibility with automatic retry on staleness.

/*
----------ElementNotInteractableException--------------

This happens when the element is present in DOM but not ready for interaction.
Common Causes:

The element is hidden (e.g., display: none, or not yet rendered) or The element is disabled 
or The element becomes available only after a specific user action

Suppose there is a form with two radio buttons — Male and Female.

When the user selects Female, an additional section appears to upload supporting documents. This section stays hidden when Male is selected.
During automation, if I directly tried to interact with the document upload element after selecting Male, Selenium threw:
ElementNotInteractableException ,Because the element is:
Present in the DOM
But not visible or enabled for interaction

For example, if I try to send text into a disabled textbox or select a radio button that is disabled, Selenium will throw
ElementNotInteractableException. The fix is to wait until the element is enabled and visible before performing the action

How to Handle:

To avoid this exception, we can check the element’s state using the following WebElement methods:

isDisplayed() → checks if the element is visible

isEnabled() → checks if the element is enabled

isSelected() → checks if the element (like radio/checkbox) is selected
*/

