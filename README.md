# Final-Project
Sparta Global Academy Final Week Project

## How to execute a test
* Run TestRunner class with annotations:
*  @RunWith(Cucumber.class)
*  @CucumberOptions(features = "src/test/resources/<<featureFileName>>.feature")
where featureFileName is the feature file that is being tested

# Read Me

## File Structure

* All pages must be within *src/test/java/com.sparta.eng50.pages*
* Stepdefs and TestRunner must be within *src/test/java*
* .feature files should be within *src/test/resources*
* All drivers are within *Project file*

## Feature Format

* Features must be descriptive
* Given/When/Then statements must be written in **first person**
* Write the page/button names referred to **exactly** as they are on the website
* **Do not** comment Gherkin code (in .feature files)

### Format Example
Feature: Going to the WOMEN page from the HomePage

&nbsp; Scenario: Clicking on the Women Button
 
&nbsp; &nbsp; Given I am on the homepage
  
&nbsp; &nbsp; When I click on the WOMEN button on the navigation bar
  
&nbsp; &nbsp; Then I will be on the Women page

## Abstract Class
### Guide to using the *AbstractPage*
* All newly created page models should extend AbstractPage and provide it with the webdriver in the constructor
  * Use other classes for constructor examples
* WebDriver in AbstractPage is protected, so only one webdriver can be used per test

## Classes
### Guide to creating a class
* Method names should be descriptive verbs
* Navigate-to methods should return a PageObjectModel

## Testing
### Test Log-in Details
Details to use for logging in during tests
* Email = fedf@fd.com
* Password = Password1

## Factory Pattern
### Guide to using *Web Driver* Factory Pattern

Example creation of web driver using factory pattern.
> FactoryPatternObject factoryPatternObject = new FactoryPatternObject();

> WebDriver webDriver = new FactoryPatternObject.getWebDriver("chrome");

The above code creates a Chrome Web Driver.
Tested browsers include:

* Chrome - version 80.0.3987.16
> WebDriver webDriver = new FactoryPatternObject.getWebDriver("chrome");
* Edge - version 82.0.361.54
> WebDriver webDriver = new FactoryPatternObject.getWebDriver("edge");
* Firefox - version v0.26.0
> WebDriver webDriver = new FactoryPatternObject.getWebDriver("firefox");

