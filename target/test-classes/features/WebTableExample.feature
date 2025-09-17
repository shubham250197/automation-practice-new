Feature: User validates web table class functionality
  @regression @webTable
  Scenario: Validates that print the course name having price is 25
    Given User on the practice home page
    When User get the course name with price "25"