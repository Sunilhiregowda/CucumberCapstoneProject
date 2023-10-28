#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test scenarios for login page 
  

  @tag1
  Scenario: logining into my account 
    Given logging into my store & not giving any credentials
    And  clicking on sign in button
    When clicking on entering button in login  my store
    And  not giving any credentials 
    And  clicking enter buttuon
    Then verifing the credentials given or not
    
    
   @tag2
  Scenario Outline: Giving valid mail & not giving password
    Given Entering only E-mail&checking credentials<email>
    When entering only mail id<password>
    And not entered any password 
    And clicking signin button
    Then checking id registered mail <status>

    Examples: 
      | email  |                  password | status  |
      | 302khasimvali@gmail.com |          | success |
      
      
        
   @tag3
  Scenario Outline: Giving valid mail & giving wrong  password
    Given Entering only E-mail& wrong password <email>
    When entering mailid  and wrong password <password>
    And giving wrong password 
    And clicking on signin button
    Then checking id registered mail&password<status>

    Examples: 
      | email  |                  password | status  |
      | 302khasimvali@gmail.com |     XYZ  | success |
      @tag3
  Scenario Outline: Giving registred wrong  password & not entering mail
    Given Entering password& not entering mail 
    When entering password cheking for mail 
    And clicking signin button
    Then verifying for password & asking to enter mail
      Examples: 
      | email  | password | status  |
      |        |     XYZ  | success |

  
      Scenario Outline: Giving password & not entering mail
    Given Entering registred mail & password <email>
    When giving correct credentials<password>
    And clicking signin button
    And coming back to home page 
    Then verifying my account <status>

    Examples: 
      | email                 | password            | status  |
      |302khasimvali@gmail.com|     Khasimvali@9381 | success |
      

  
