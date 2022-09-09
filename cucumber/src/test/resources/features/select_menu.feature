Feature: Select Menu

  Scenario: User Is Able To Select All Menu
    Given User go to "https://demoqa.com/select-menu"
    When User in "Select Menu" page
    And User choose select value "Another root option"
    And User choose select one "Other"
    And User choose old style select menu "Aqua"
    And User choose multi select drop down "All Color"
    Then User success input all select menu