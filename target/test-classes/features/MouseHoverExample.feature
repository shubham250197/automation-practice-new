Feature: Validates mouse hover functionality

  @regression @mouseHoverExample
  Scenario: Validates user move to top of page
    Given User on the practice home page
    When User hover over on button
    Then Validates user move to top of page