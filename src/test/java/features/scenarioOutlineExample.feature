Feature: Demonstrate usage of Scenario Outline using the Login Flow example

  @TagA
  Scenario Outline: Test Login Flow with values passed using Examples
    Given User open the website and navigate to login page
    When User enters valid username as "<username>" and password as "<password>" using examples
    Then User should be redirected to myaccount page
    And User should see logout button
    Examples:
      | username                | password |
      | testemailid01@gmail.com | test123! |
      | testemailid02@gmail.com | test123! |
      | testemailid03@gmail.com | test123! |
