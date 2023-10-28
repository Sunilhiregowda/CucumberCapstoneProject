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
Feature: operations on home page
  

  @tag1
  Scenario: Testing on dresses  my store 
 Given opening chrome and mystore 
 When navigating to dresses my store
 And coming back to home page 
 Then verify the dresses my store
    
  @tag2
  Scenario Outline: Testing on Tshirts _mystore
    Given opening mystore&Tshirts my store <Tshirt>
    When navigating to T shirts my store 
    Then verifying T shirts <status>my store 
     And coming back to home page  

    Examples: 
      | Tshirt | | status |
      | Tshirt1| | pass |    
       @tag3
  Scenario Outline: Testing on women_mystore
    Given opening mystore&womenmy store <women>
    When navigating to  women shirts my store  
    Then verifying women  my store<status>
      And coming back to home page 

    Examples: 
      | women  || status |
      | women  || pass |
      @tag4
      Scenario Outline: Testing on search element 
    Given opening mystore& searching <search> in my store 
    When Entering text in search bar in  my store 
    Then verifying searched product in   my store <status>
      And coming back to home page 

    Examples: 
      | search  |   | status |
      | partyware|  | pass   |
         @tag5  
     Scenario Outline: Testing on news letter  element 
    Given opening mystore& searching  news letter<email> input in my store
    When Entering text in newsletter bar in  my store 
    Then verifying email for news letter in   my store <status>
      And coming back to home page 

    Examples: 
      | email |                   | status|
      | 302khasimvali@gmail.com|  | pass  |
      
      
