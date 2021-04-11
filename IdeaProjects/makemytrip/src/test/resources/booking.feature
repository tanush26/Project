@booking
Feature:
  As an end user
  I want to select departure flight and return flight for 7days
  So that I can click on given flight options for round trip

  Scenario:
    Given I am on Homepage
    When I click on "flights" Link and I click on "roundTrip"
     And select from "Hyderabad, India"
     And select to "Mumbai, India"
    And select "todayDate" and "returnDate"
    And printing total number of departure flights and return flights
    And select stops "Non Stop" and "1 Stop"

