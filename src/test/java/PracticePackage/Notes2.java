//----------------------------Test Cases for Automation-------------
/*
Stable Functionality: If the functionality is  stable and won't change frequently, it is a good candidate for automation.
Regression and Sanity Testing: If you need to run the test case repeatedly, especially with every new build or release, automation will save time.
Future Reusability: If the test case can be reused across different projects, releases, or configurations, it’s a good candidate for automation.
If we need to test with multiple sets of data can do with excel or dataprovider etc - best for automation
 Scenarios Requiring Cross-Browser Testing
High-Risk and Critical Functionality-automated tests can quickly detect issues in crucial functionality, reducing the chances of a major failure in production.

--------------------------Test Cases not for Automation----------------------

Exploratory Testing: Manual testing is best for uncovering unexpected issues or evaluating a feature’s usability, as humans can think creatively.
Short-Term or One-Time Tests: For features that are developed and only tested once (such as a one-off change), the investment in automation may not be worth the effort.
High-Degree of Uncertainty: If the functionality is rapidly changing or unstable, automation scripts will need constant updates, making manual testing a better choice.
Visual/UI Testing: Automated tools can struggle with visual differences that require human judgment, so UI testing often needs manual intervention.
New Features: In the early stages of development, where requirements and functionality are constantly changing, manual testing is more flexible. You can then automate once the feature stabilizes.

----------------------------------psvm--------------------------------

1. Yes, the main method must have a specific signature for the JVM to recognize it as the starting point of a Java application.
2. public: So the JVM can access it from outside the class.
3. static: So it can be called without creating an object.
4. void: It returns nothing.
5. main: The name must be exactly main.
6. String[] args: String[] args is a way for Java to take input when the program starts. 
No matter what you pass, Java stores it as a string in the array.

//------------------------what can be changed in psvm--------------------------

//String[] args → String[] input- No issue. The parameter name is just a variable name.
//String... args- No issue. String... is valid syntax and equivalent to String[].

//If the signature misses which is provided by JVM, will compile just fine but it will throw runTimeError, in eclipse it doesnt even shown run as java application.

//------------------------SYSOUT----------------------
//System.out.println() is a Java statement that prints output to the console using the standard output stream, and adds a newline automatically.

//System – A final class from the java.lang package that provides access to system-level resources like input, output, and error streams.

//out – A public static final field in the System class, which is a reference to PrintStream.It represents the console.

//println() – A method of the PrintStream class that prints the passed argument and adds a newline at the end. It can handle different data types (e.g., strings, numbers, objects).

----------------Selenium WebDriver hierarchy ----------------

RemoteWebDriver implements interfaces like WebDriver,TakesScreenshot, JavascriptExecutor others
ChromeDriver extends ChromiumDriver extends RemoteWebDriver
FirefoxDriver extends  RemoteWebDriver directly
EdgeDriver extends ChromiumDriver extends RemoteWebDriver
SafariDriver extends RemoteWebDriver directly

-------------------Selenium WebDriver architecture----------------------

1. We write test scripts using Selenium client libraries (in Java, Python, etc.), where we call WebDriver commands like click() or getText().
2. The client library translates these commands into W3C WebDriver protocol requests.
3. These requests are then sent to a specific browser driver executable (like chromedriver.exe or geckodriver.exe), 
which acts as a bridge between Selenium and the browser.
4. The browser driver converts the WebDriver requests into the browser’s native automation commands.
5. The browser then performs the requested actions (e.g., navigating, clicking, retrieving text) and sends its response back to the driver
6. Finally, the driver translates this native browser response back into a W3C-compliant HTTP format, 
which the Selenium client library understands and delivers as the result.

Selenium client → sends WebDriver commands → browser driver → converts to native browser actions → 
browser executes → driver returns results to client.

W3C Protocol:-
This protocol acts as a standard communication method between the Selenium client and browser drivers, making the interaction more 
consistent and reliable across all modern browsers. Since most browsers now natively support the W3C WebDriver protocol, it ensures 
that automation commands behave the same way in Chrome, Firefox, Edge, and others.

--------------------------Selenium waits hiearchy-------------------------
/*
Wait (Interface) Top-level interface
FluentWait (Class) –  Implements Wait
WebDriverWait (Class) extends FluentWait
Implicit Wait – Not part of Wait hierarchy ,It's a built-in timeout mechanism configured via WebDriver directly.

-------------------------Differences Between Abstract Class and Interface---------------
/*
Abstract Class: Can have both abstract methods (without body) and concrete methods (with implementation).
Interface: Before Java 8, all methods were abstract (no body). 
Since Java 8, interfaces can have default and static methods with implementation and private also after java 9.

Abstract Class: Java allows extending only one abstract class (single inheritance).
Interface: A class can implement multiple interfaces (multiple inheritance of type).

Abstract Class: Can have constructors.
Interface: Cannot have constructors.

Abstract Class: Cannot be instantiated directly.(We can create instances for subclasses which extends abstract classes)
Interface: Cannot be instantiated directly.

Abstract Class:Can declare instance variables, static variables, final variables, etc.
Interface: Only supports public static final variables (constants).

Abstract classes are best when you need a common base with partial implementation, 
while interfaces are best when you need to define a contract or capability that multiple unrelated classes can share.

In normal classes, we cannot have abstract methods. If any class has even one abstract method, that class must be 
declared abstract. The main goal of an abstract class is to provide a common base that a subclass can fully 
or partially implement, while also ensuring that no objects of the abstract class can be created directly.
 
 

/*
Interfaces define a contract — they declare what methods a class must have, but not how those methods work. Classes provide the actual implementation
or logic, defining how those methods behave. Since Java 8, interfaces can have default and static methods with implementation, 
but they still cannot have instance variables or constructors, so their ability to hold logic is limited. The idea is to keep interfaces focused on 
defining contracts, while classes handle most of the logic and state.
*/

/*
Constructors are not inherited, so they cannot be overridden(Because overriding happens through inheritance + runtime polymorphism, and constructors are not inherited.). 
However, a subclass can call a parent’s constructor using super().
Within the same class, constructors can be overloaded (multiple constructors with different parameters).
*/
