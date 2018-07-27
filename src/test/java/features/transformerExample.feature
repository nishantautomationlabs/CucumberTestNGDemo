Feature: Demonstrate usage of Transformer using the Register Flow example

  @TagA
  Scenario: Test Register Flow with values transformed using transformer
    Given User open the website and navigate to login page
    When User enters a random email address starting with "randomemail"
    And User enters a random password of length 8
    And User enters the date of birth as "27-Aug-1985"
    Then User should be redirected to myaccount page
    And User should see logout button
