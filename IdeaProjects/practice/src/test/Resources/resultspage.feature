@filters
Feature: Filters
  As a end user
  I want filter the search results with sort by
  So that i can view refined products

@smoke
  Scenario: search for a product
    Given I am on HomePage
    When  I search  for a Product "tv"
    And  I move to "Sort By" Relevance
    Then I select the "SortByRelevance"
    Then I take the screenshot
