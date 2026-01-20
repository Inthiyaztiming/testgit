A feature file is a plain text file used in Cucumber to define application behavior using Gherkin syntax.
It acts as both documentation and a test specification.
The file describes one or more scenarios in a human-readable format, using keywords like 
Feature, Scenario, Given, When, Then, And, and But.
Each line in a feature file maps to code logic inside step definition class in Java
		
Feature- High-level functionality or module name (e.g., Login, Registration, Age Criteria)
Scenario- A specific test case under that feature (e.g., Login with valid credentials) or Validate  age criteria for Male
Given- Precondition — where the scenario starts
When- Action the user performs
Then- Expected result or outcome
And/But- Combine multiple steps logically

--------------------------------------Structure of a feature file-------------------------

Feature: Age Criteria 
This feature validates the age criteria for different genders during registration.

Scenario: Validate minimum age requirement for Male candidates
  Given the user is on the login page
  And the registration  form is displayed
  When the user enters age as 17 years
  But the user forgets to check "Remember Me" option
  And the user clicks on the signup button
  Then the system should show an alert message
 And an age-related error should be displayed

-----------------------------Points to remember---------------------------------
1. A feature file may have multiple scenarios
2.and for commenting in java class we use // but in cucumber we use #
3.For every line we write in feature file we need to write some code automation logic inside step definition 
file .java class
4.In one scenario we must have atleast one given one when one then which are mandatory and for every line we 
write in feature file we need to match that line with some code logic in step definition file
5.And but are optional in feature file but if we are writing them in feature file we have to mandatorily write 
some code logic in step definition class
6. And but we write will be considered as combined with previous step for example in the above scenario
 Given the user is on the login page
  And the registration  form is displayed- here and is combined with given(which is previous step)
  
  When the user enters age as 17 years
  But the user forgets to check "Remember Me" option- Here but is combined with when(which is previous step)
  
7. If a step or line in the feature file doesn’t have a matching step definition, Cucumber will mark the test 
as failed 
and suggest you the code to implement.(doesnt throw any compile time exception)











