Feature: Google search
  As a Google user
  I want to be able to search by phrase
  So that I can find web pages related to provided phrase

  @smoke
  Scenario Outline: Google search
    Given I'm on google.co.uk main page
    When I enter search phrase <searchPhrase>
    And I click search
    Then Link <link> should be displayed as first one

    Examples:
      | searchPhrase   | link                        |
      | "google co uk" | "https://www.google.co.uk/" |