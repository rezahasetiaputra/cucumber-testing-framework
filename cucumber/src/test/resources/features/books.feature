Feature: Books

  Scenario: User Will See No Rows Found When Using Invalid Keyword
    Given User go to "https://demoqa.com/books"
    When User in "Book Store" page
    And User search book "qa engineer"
    Then User see "No rows found"

  Scenario: User Is Able To Search Books When Using Valid Keyword
    Given User go to "https://demoqa.com/books"
    When User in "Book Store" page
    And User search book "Git Pocket Guide"
    And User click book "Git Pocket Guide"
    Then User see "Git Pocket Guide"