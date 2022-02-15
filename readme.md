Selenium - TestNG project will be used to automate web application. Project has Page Object model as its design pattern.

Pre-requisites:

Java8 or higher should be installed.
Set JAVA_HOME
Install maven and set MAVEN_HOME
Add JAVA_HOME and MAVEN_HOME in your Path variable
Install TestNg plugin from marketplace

Framework structure:
Project is a maven project.

src/main/java      --> com.qa.pages --> Has the page objects

LandingPage        --> Has the objects for the landing page of the web portal

LoginPage          --> Has the objects for the Login screen of the web portal

RedemptionPage     --> Has the objects for the Redemption screen of the web portal

EarlyRedemption    --> Has the objects for the EarlyRedemption screen of the web portal

src/main/java      --> com.qa.resources --> Has the config properties

src/test/java      --> com.qa.testsuites.automationexcercises --> Has the tests


Some of the issues Faced:

TestNG was not available in MarketPlace/Install New software --> changed the TestNg version in pom.xml 

Archetypes not loading --> Updated the ini file , modified the heap memory

FileNotFoundException --> Incorrect config path


