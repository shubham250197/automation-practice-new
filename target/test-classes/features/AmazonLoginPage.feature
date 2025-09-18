Feature: Validate login functionality of Amazon website

  @Regression @Login
  Scenario: Validate user is on login page
    Given User on the Amazon website Login page
    When User enter the username "shubham@yopmail.com"
    When User enter the password "Welcome@123"
    Then User click on submit button
    And Validates user is on home page "My Account"