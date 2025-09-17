Feature: Radio button functionality

  @regression @radioButton2
  Scenario: Validated radio button is selected for for radio2 radio button
    Given User on the practice home page
    When User click on second radiobutton
    Then Validates second radio button is selected

  @regression @radioButton1
  Scenario: Validated radio button is selected for for radio1 radio button
    Given User on the practice home page
    When User click on first radiobutton
    Then Validates first radio button is selected

  @regression @radioButton3
  Scenario: Validated radio button is selected for for radio3 radio button
    Given User on the practice home page
    When User click on third radiobutton
    Then Validates third radio button is selected



