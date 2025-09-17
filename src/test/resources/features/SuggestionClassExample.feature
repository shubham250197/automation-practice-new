Feature: User validates suggestion class functionality
  @regression @sugesstion
  Scenario: Validates that india is selected from suggestion list
    Given User on the practice home page
    When User search with "ind" and select "India" in suggestion list
    When User enter the input in search field "Arg"
    And User select the india from sugesstion list "Argentina"