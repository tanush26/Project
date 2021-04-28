@result
Feature: User able to select filtered product

  Scenario: User will select filtered product and verifying the added product in trolley or not
    Given User is on Homepage
    When User selected "women"
    And User selected "Jewellery and watches" in category
    And User selected "£10 - £15" in price
    And User selected "Moon & Back" in brands
    And Add filtered Product to basket
    Then Verify the product in trolley



