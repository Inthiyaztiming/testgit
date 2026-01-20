//---------------------Platform independence in java------------------------

// A .java file(java source file) contains the raw source code written by the programmer. 
// When you run the javac (Java compiler) command, it compiles this source code and converts it into a .class file, which contains bytecode. 
// Bytecode is a platform-independent, intermediate code that is not tied to any specific hardware or operating system, making it portable across platforms. 
// This bytecode is then loaded into the Java Virtual Machine (JVM) at runtime, 
// where the JVM interprets it into machine-specific code for execution on the current platform, 
// allowing the same Java program to run on different systems without modification. 
// This concept is known as "write once, run anywhere" and sets Java apart from languages like C/C++, 
// which compile directly to platform-specific machine code. 
// Think of Java bytecode as a universal script written in a language that every JVM understands, 
// allowing it to run on any platform that has a JVM installed.


//-----------------Managing password-----------------------------
//we use a config.properties file placed under src/test/resources, where we store app.url, browser, credentials
//To avoid accidentally pushing sensitive data, we add this file to .gitignore, so Git doesn’t track it.
//In CI/CD or production-like environments- we can use Jenkins Credentials Plugin if we want to


//-----------------------------------POM-----------------------------------
//POM (Page Object Model) is a design pattern — Its a way to organize our automation code by creating separate page classes with locators 
//and methods representing each web page.
//It improves code maintainability, readability, and reusability.

//PageFactory is a Selenium-provided class that helps us implement POM more efficiently by initializing elements annotated with @FindBy
//It supports lazy loading, reducing boilerplate code and improving efficiency((no need to write driver.findElement() repeatedly).

//So, PageFactory is a tool to implement POM more cleanly and easily, but POM itself is the architectural pattern.

//if we use @FindBy annotations to declare WebElements inplace of driver.findelement, it is mandatory to call 
//PageFactory.initElements() to initialize those elements in the constructor (or before using elements).
//The @FindBy annotation only declares how to find the element.
//PageFactory.initElements() actually locates and initializes those elements
//Without this call, the WebElement fields remain null — so if you try to interact with them, you get a NullPointerException.

/*
In PageFactory, lazy initialization means elements are not located when the page object is created, but only when we first use them. 
This improves performance and avoids unnecessary lookups. However, if the DOM changes later, it can cause StaleElementReferenceException, 
so we often combine it with waits to make it more reliable.
mean we store locator first above, create a method for action and only call that when we need that method
*/


// ------------------------ Manual and Automation Testers: Role & Collaboration in SDLC and STLC ------------------------

// Collaboration between Dev, QA, and Product teams happens right from the early phases of the SDLC.
// Manual and automation testers begin working together from the requirement analysis stage itself.

// Manual testers focus on functional coverage, edge cases, exploratory testing, and usability validation.
// Automation testers identify stable, repetitive, and high-priority test cases for automation.

// This early testing approach is known as Shift Left Testing, where the testing team is involved from the initial stages
// of SDLC to catch defects early, reduce rework, and ensure faster feedback.


// In Shift Right Testing, both manual and automation testers contribute to ensuring post-release product quality.
// Manual testers perform exploratory testing based on real user behavior and production issues,
// while automation testers build production-ready scripts, synthetic monitoring, performance tests,
// and integrate alerting tools to monitor live systems.

// Together, Shift Left and Shift Right testing ensure that quality is maintained from development to deployment and beyond.

//------------------------CI/CD Integration-------------------------
//We develop and test our Selenium automation framework locally in Eclipse using Maven and TestNG. 
//Once the code is stable, we push it to GitHub.
//In Jenkins, we configure jobs to pull the latest code directly from the GitHub repository, 
//so Jenkins is linked to the Git repo, not the IDE.
//We specify Maven commands in Jenkins to build and run the tests.
//These Jenkins jobs can be triggered manually or scheduled using cron expressions for nightly or periodic runs.





