Feature: User validates the drop down functionality
  @regression @dropdown2
  Scenario: Validates second drop down is selected
    Given User on the practice home page
    When User select the section option value of drop down "Option2"
  @regression @dropdown1
    Scenario: Validates First drop down is selected
      Given User on the practice home page
      When User select the first option value of drop down "Option1"
