@search
Feature: Customer want to buy the filtered product

  Scenario:
    Given User is on Homepage
    When  User select "women"
    Then  User must able to see filtered product

  Scenario:
    Given User is on Homepage
    When User hover selected product "Men"
    And User  able to click "Tops"



