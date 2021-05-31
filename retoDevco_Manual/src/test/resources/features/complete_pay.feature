Feature: Travelosity Complete pay options
  An user can complete pay in the options Stays, Flights, Cars, Packages, and Cruises

  @manual @TestCase1
  Scenario: Complete pay TC1, Successful case
  Narrative: Successful Complete pay

    Given User opens the page travelosity
    When User select the option Stays or Flights or Cars or Packages or Cruises
    And User complete the information up to the part of the payment
    And User check the billing information
    And User Add a payment method
    And User user clicks on pay
    Then User verifies the successful pay in the page

