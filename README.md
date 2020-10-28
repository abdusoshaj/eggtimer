#Automated UI Tests

##Requirements
------------
1. Java >= 10+
2. Maven >= 3.5+

##How to run:
  - Open command prompt in the project directory
  - Execute mvn clean test

##Improvements:
 - To have utilities within framework (main/java) like all driver actions and commands can be completely made abstract from Test
 - To make test more scalable overload the starttimer method with inputs holding seconds minutes and hours
 - Alert after timer is done to be handled in an efficient way
 - Locally I was getting a delay in getting text of countdown progress so it was returning in 2-3 secs delay
 - Chosen testframework TestNG - would have done with cucumber