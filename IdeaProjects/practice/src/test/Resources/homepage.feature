@search
Feature: search
  As an end user
  I want to search for a Product
  So that I can see refined product

  @sre
  Scenario: search for a product
    Given I am on Homepage
    When  I search  for a product "tv"
    Then I select the filtered product
