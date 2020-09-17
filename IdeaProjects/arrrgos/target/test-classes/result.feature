@result

Feature:
  As a customer
  I want to select a product
  So that i can view filtered product

  Scenario:
    Given I am on Homepage
    When I select "women"
    And I select "Clothing" category
    And I select "Shirts and Tops" categoryFilters
    And I select filters "Tu"
    And I select filters "£5 - £10"
    And I select randomProduct " "
    And I select size "8"
    Then I add refined product to basket