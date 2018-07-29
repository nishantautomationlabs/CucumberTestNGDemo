Feature: Demonstrate features of Cucumber using the Login Flow example

  Background:
    Given User open the website and navigate to login page

  @TagA
  Scenario: Test Login Flow with values hard coded in step definition
    When User enters valid username and password
    Then User should be redirected to myaccount page
    And User should see logout button
    But User should not see login button

  @TagA
  Scenario: Test Login Flow with values passed as parameter
    When User enters valid username "testemail01@gmail.com" and password "test123!"
    Then User should be redirected to myaccount page
    And User should see logout button

  @TagA @TagB
  Scenario: Test Login Flow with values passed as data table and converted to List of List of String
    When User enters valid username and password passed as data table
      | testemail01@gmail.com | test123! |
    Then User should be redirected to myaccount page
    And User should see logout button

  @TagB
  Scenario: Test Login Flow with values passed as data table and converted to List of Object
    When User enters valid username and password passed as data table using List
      | username              | password |
      | testemail01@gmail.com | test123! |
    Then User should be redirected to myaccount page
    And User should see logout button


  @TagB
  Scenario: Test Login Flow with values passed as data table and converted to Map
    When User enters valid username and password passed as data table using map
      | username              | password |
      | testemail01@gmail.com | test123! |
      | testemail02@gmail.com | test123! |
    Then User should be redirected to myaccount page
    And User should see logout button




