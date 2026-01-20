//------------------ROLES AND RESPONSIBILITIES--------------------------------------
/* My role begins as soon as we receive the requirement document from the BAs. I start by analyzing the 
requirements and identifying stable, high-priority test cases that are suitable for automation. I work on a Selenium–Java framework 
with TestNG, following the Page Object Model (POM) design pattern to ensure scalability and maintainability of our scripts.

While my primary focus is automation, I also collaborate with junior members on manual execution to balance workload. I also mentor them 
on best practices and conduct knowledge-sharing sessions on our framework, focusing on maintainability, 
reusability, and reliability of automation scripts.

Since we follow Agile methodology, I actively participate in sprint planning, daily stand-ups, and release validations to align 
testing with sprint goals and ensure smooth delivery.

*/

//------------------------------FRAMEWORK EXPLANATION--------------------------------------
/*
In our project, we use a Maven-based Hybrid Automation Framework built with Selenium, Java, TestNG, and Page Object Model (POM). 
The overall structure is divided into src/main/java for core components and src/test/java for test execution.

At the root level, we have the pom.xml file, which manages all project dependencies, and multiple testng.xml files for suite configuration,
grouping, and execution control.

-----------------------------src/main/java – which contains Core Logic & Components----------------------------

abstractcomponents package — base classes (e.g., AbstractComponent, BaseActions) that provide reusable Selenium/web-driver related methods 
(explicit waits, JS executor helpers, click/sendKeys wrappers, scroll). Page classes inherit these base classes.

2.pageobjects package
Each class represents a web page and follows the Page Object Model
These classes store element locators and Corresponding methods to interact with those elements

3. utilities package has Reusable helper classes like:(This is where file handling logic lives)
Holds reusable helper classes such as the Excel utility (for reading test data), property file reader (for config values), 

4.listeners package
TestNG listeners (ITestListener) to capture screenshots on failure, log events, and push results to ExtentReports.
Iretry analyzer to re run the test cases upon failure.

----------------------------src/test/java – Test Execution Layer-------------------------------
Contains the BaseTest.java class that reads configurations, initializes WebDriver, and sets up the browser 
(Chrome, Firefox, Headless, etc.) and provides common test utilities.

2. tests package which contains Actual test classes
Contains actual test classes (e.g., LoginTest.java, UserRegistrationTest.java) written with TestNG annotations like @Test and 
@DataProvider. These tests pull data from Excel or property files and Extends BaseTest to inherit driver setup and teardown logic

resources (on classpath)
Holds non-code files used at runtime: config.properties (browser, baseUrl, timeouts), testdata.xlsx, log4j2.xml, extent-config.xml. 
Maven automatically puts these on the classpath.

The entire project is Maven-based for dependency management, Gitand github for version control, and is Jenkins-integrated for continuous 
integration and scheduled test runs

For CI/CD, instead of manual Jenkins installation, we run Jenkins and Selenium Grid using Docker containers 
defined in a docker-compose.yaml file.

----------------------------------------------------------

Below answer can be given for these questions
Did you build the framework from scratch?
What challenges did you face while working on the framework?
Tell me about a time you improved something in your project or framework

-----------------------------------------------------

While I didn’t build the entire framework from scratch, I played a key role in transforming a basic setup into a more stable 
and scalable automation framework.
 
Situation:
When I joined, the automation framework was very basic and half-baked. It had hard-coded values, thread.sleeps, duplicate code, only 
TestNG default reports, and tests were still being run manually from Eclipse. This made scripts unreliable and not usable for CI/CD.

Task:
My responsibility was to make the framework scalable, maintainable, and CI-ready, so the regression effort could be reduced and results 
could be shared with stakeholders.

Action:
Replaced Thread.sleep with explicit waits for stability.
Implemented data-driven testing using Excel and TestNG DataProvider.
Applied inheritance and utilities to remove duplicate code.
Integrated with Jenkins + Maven in docker containers for nightly runs.
Enhanced reporting by adding Extent Reports along with screenshots for failures, making it easy for stakeholders to analyze results.

Result:
The framework became much more stable and maintainable. Regression effort reduced from 2 days of manual execution to ~4–5 hours of 
automation. Flaky failures dropped drastically, and the reporting was clear enough for both QA and non-technical stakeholders to review.
 */

//-------------------------

//----No need to answer until unless they specifically ask this(Have you worked in a product-based or service-based company?)----------
//In my previous company, I worked on an already well-structured framework.
//But in my current startup, I got the opportunity to redesign and restructure the framework end-to-end based on project needs,
//which gave me hands-on exposure to real-time framework-level decisions.

/*-----------------------Intro-------------------
I’m Momin Inthiyaz, a Software Test Engineer with 4 years of experience in both manual and automation testing.
My expertise is in Selenium WebDriver with Java, TestNG. I have worked on designing and maintaining scalable 
automation frameworks, executing functional and regression test suites, and ensuring quality delivery in Agile environments.

Currently, I work in the Web-based sports and event management domain, where our platform handles marathon and race event registrations, payment flows, 
and timing data, logistics. In my recent role, I transformed a basic UI automation setup into a Hybrid framework integrated with Maven and 
Jenkins, which improved script reusability and reduced manual regression effort.

*/
/*
In our framework, we use the Page Object Model (POM) design pattern to separate locators and actions for each page into dedicated classes. 
This makes the code more maintainable and reusable.
We also implemented the Singleton pattern to manage the WebDriver instance, ensuring that only one driver object is created per test execution.

Additionally, to support parallel execution, we combined Singleton with ThreadLocal. ThreadLocal helps assign a separate WebDriver 
instance to each thread, so multiple tests can run safely in parallel without interfering with each other.
*/

/*
“Maven has three life cycles — Clean, Default, and Site. Default is the most used, which covers phases from compile → test → package →
install. In automation, we mostly use the test phase to run TestNG/JUnit suites, often triggered from Jenkins.”

In our project, we run a smoke suite on every code commit for quick feedback, a nightly regression run on Jenkins to ensure 
stability, and a full regression either weekly or before a major release. We schedule these runs in Jenkins using cron expressions. 
While I have mostly worked with manual and scheduled triggers, I also understand automatic triggering via Git webhooks, 
and I’m eager to set up webhook-based automation when the opportunity arises.

*/