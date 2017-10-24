Feature: Plan Journey

  As a Customer
  I want to plan my journey
  So that I know what time I will Depart and Arrive and how much the journey will cost

  @smoke
  Scenario: Plan journey - list times and prices
    Given I'm on trainline.com main page
    When I enter origin "Brighton" and destination "London"
    And I click Get times and tickets
    Then a list of options are displayed