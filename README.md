# kiMockPlatform
# Pre-requisites
Before you can start performing automation testing, you would need to:
1.	Install the latest Java development environment i.e. JDK 1.8 or higher. I recommend using the latest version.
2.	Download the latest and stable version of Selenium JAR from the selenium official website seleniumhq, I recommend to use version 3.5.2 
3.	Download Eclipse IDE : 2022-12 (4.26.0)  stable version from Eclipse official website and install Eclipse IDE on local machine. Once Eclipse installed it asks you to set up workspace path, give folder name from local machine where you want to store code locally.
4.	Install TestNG – Go to Eclipse marketplace and install TestNG from Eclipse marketplace.
5.	Install Maven which supports JUnit framework out of the box. Maven can be downloaded and installed following the steps from official Maven website. Maven can also be installed easily on Linux/MacOS using Homebrew package manager.

#  Clone or create a new repository
  Clone or create a new repository to local machine from remote Git repository.

  Remote Git repo path - https://github.com/Naz-Shaikh-GitRepo/kiMockPlatform.git

#  Framework overview

This framework I build on Page Object Model style. Each page has its separate class which contains objects locators and actions to be performed on those objects. 

Page classes can be identified as they contain name Page i.e. CreateANewQuotePage1.java 

In the src folder, two separate Test cases are available as below, which fetch methods and objects from respective page classes.
1.	SeeMyPendingQuotesTest – Verify pending quotes
2.	CreateANewQuoteTest – Verify create a new quote
 
#  Guide to execute test cases

Launch Eclipse IDE
Expand Project -> Src folder
Under Src folder two test cases are available, right click on a test case and Run As-> TestNG
SeeMyPendingQuotesTest – Verify pending quotes
CreateANewQuoteTest – Verify create a new quote
 
