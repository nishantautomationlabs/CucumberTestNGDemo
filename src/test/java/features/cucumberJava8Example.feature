Feature: Demonstrate usage of Step Definition in Java8 using the Login Flow example

  Scenario: Test Login Flow with steps definition written using Java8
    Given User open the website and navigates to login page
    When User enters the email address as "test01@gmail.com"
    And User enters his password as "test123!"
    Then User should be redirected to the myaccount page
    And User should see the logout button
