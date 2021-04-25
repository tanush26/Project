@basket
Feature: add to basket
  As a end user
  I want to add a product to basket
  So that I can see product in trolley

@bask
  Scenario: add to trolley
    Given I am on home page
    When I search  for  product "tv"
    And I select the filtered item
    And I add product to basket
    Then I can see the product in trolley

