Feature: Validate practice page functionality

  @getwindowhandle
  Scenario: Validate title of new window
    Given User on the practice home page
    When user clicks on open window button
    Then User validates new window title "QAClick Academy - A Testing Academy to Learn, Earn and Shine"
