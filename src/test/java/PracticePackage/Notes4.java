//Toplevel classes in normal class- package-private (default) if no access modifier is mentioned
//Allowed-->public, default ,final, abstract
//Not allowed-->private, protected , static 

//Members(variables and methods) in normal class- default if no access modifier is mentioned
//Allowed-->public, default ,final, private, protected, static, abstract(No body)
//Not allowed--> Mostly all common modifiers allowed

//Toplevel classes in abstract class- default if no access modifier is mentioned
//Allowed-->public, default ,abstract
//Not allowed-->private, final, protected, static

//Members(variables and methods) in abstract class-  default if no access modifier is mentioned
//Allowed-->Same as normal class members
//Not allowed--> Almost all standard modifiers allowed

//Toplevel interface- If no access modifier specified, interface is package-private (default), NOT public!
//Allowed-->public, default (package-private)
//Not allowed-->private, final, protected, static

//Members(variables and methods) in interface- Methods are public abstract by default if no body
//Allowed-->public, default(methods with body only), private(methods with body only), static(methods with body only), abstract(methods with body only)
//Not allowed--> final,protected

//Constructors in Normal Classes- default if no access modifier is mentioned
//Allowed-->public, protected,default (package-private),private
//Not allowed--> static,final,abstract

//Constructors in Abstract Classes-same as normal class

//Constructors in Interfaces-Interfaces do not have constructors.(cannot be instantiated)


//------------------------------------SDLC----------------------------------------
//SDLC is a structured framework that defines the stages and steps involved in software development from the initial planning phase to the 
//final release. The purpose of SDLC is to ensure the quality and correctness of the software product, and it provides a systematic approach 
//to software development.
//Key Phases in SDLC:

//Requirement Gathering & Analysis:
//The first phase involves gathering and analyzing the requirements of the software to be developed.
//This is usually done through meetings with stakeholders, clients, and business analysts.
//The requirements are documented, and the project scope is defined.

//System Design:
//Based on the requirements, the system's architecture is designed.
//This phase includes high-level design (HLD) and low-level design (LLD).
//The design phase ensures that the system’s components, databases, interfaces, and architecture are well-structured.

//Implementation (Coding/Development):
//This is where actual coding of the application happens.
//Developers write the code based on the design specifications.
//The code is written in programming languages such as Java, Python, C#, etc.

//Testing:
//Once the development phase is completed, the software moves to the testing phase.
//This is where the QA (Quality Assurance) team, including automation testers, comes in to ensure that the software works as intended and 
//meets the requirements.
//In your case, automation tests will be executed to ensure the functionality and performance of the software.
//This phase ensures that defects or bugs are identified and resolved before release.

//Deployment:
//After successful testing, the software is deployed to a production environment.
//Deployment can happen in stages (like Beta release) or directly to the end-users.

//Maintenance:
//After deployment, the software will be maintained with updates, bug fixes, and enhancements.
//Maintenance ensures that the software remains functional and updated as per user feedback or market changes.


//----------------------------STLC-------------------------
//STLC is a subset of SDLC, and it focuses on the various phases involved in the testing process to ensure the quality of the software. 
//STLC is the lifecycle of testing activities that help deliver quality software.

//Requirement Analysis:
//In this phase, the testing team reviews the requirements document and identifies the testable aspects of the software.
//They may involve test analysts, business analysts, and automation testers to define what needs to be tested and how.
//For automation, you may start identifying which test cases can be automated based on the requirements.

//Test Planning:
//This phase involves defining the test strategy and test objectives for the software.
//Automation testers help in creating a detailed test plan that specifies:
//Which tests will be automated
//What tools will be used for automation (e.g., Selenium, JUnit, TestNG, etc.)
//The environment and hardware/software configurations needed for automation
//Test execution schedules
//Resource allocation (e.g., who will write the automation scripts, who will execute the tests)

//Test Design:
//In this phase, test cases are created based on the requirements.
//Automation Testers create automated scripts for the test cases identified in the planning phase.
//The scripts are created to automate the functionality tests, regression tests, and other relevant test cases.

//Test Environment Setup:
//This phase involves setting up the environment where the tests will run.
//It involves configuring hardware, software, and network setups, ensuring that the environment matches the one where the software will be deployed.
//Automation testers may help in setting up test servers, databases, and other dependencies for automated testing.

//Test Execution:
//In this phase, the test cases (including automated ones) are executed.
//Automation testers execute their automation scripts and generate reports for the test results.
//If automated tests fail, bugs are logged in the defect-tracking system.

//Defect Reporting and Tracking:
//If defects are found during test execution, they are reported and tracked.
//The development team works on fixing the defects, and once they are resolved, the test cases are re-executed to ensure the issues are fixed.

//Test Closure:
//This phase is where the testing process is concluded.
//A final test report is generated, which includes the details of all executed test cases (both manual and automated) and their results.



