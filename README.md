# HomeTaskSignIn

Automation test sign in the function for the page https://cp.qc.coccoc.com/sign-in

Tester can see test case on the feature file: [signIn.feature](https://github.com/Shinbe94/HomeTaskSignIn/blob/master/src/test/java/features/signIn.feature)

It's write by [Gherkin](https://cucumber.io/docs/gherkin/reference/) language

### Language/framework
1. Java
2. Cucumber
3. Gherkin
4. Selenium
5. ChromeDriver
6. Maven

### Structure of the project
/src/java/test
- Base
  - Common.java
- Page
  - SignInPage.java
- feature
  - signIn.feature
- stepDefinition
  - SignInStep.java
  - Hook.java
  
 ## Configure run on the Jenkins
 1. Install Jenkins on local
 2. Access http://localhost:8080
 3. Creat new job
 4. Configure project
    - `Repository URL` is git project URL
    - Setup `Root POM` to pom.xml in your project
5. Click `Build now` to clone project form git and build project

