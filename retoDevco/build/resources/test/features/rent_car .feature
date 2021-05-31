Feature: Rent car
  A user will be able to rent car in the travelosity page.

  Scenario Outline: Search for a cars when the information provided is correct
  Narrative: Search for a cars by providing destination ,
  origin, departure dates and times

    Given Juan wants to enter the page
    When Enter the information for the reservation a cars
      | origin   | destiny   | dayOfExit   | dayOfArrival   |
      | <origin> | <destiny> | <dayOfExit> | <dayOfArrival> |
    Then I verify the available cars in the page

    Examples:
      | origin   | destiny | dayOfExit | dayOfArrival |
      | Medellin | Bogota  | 10        | 4            |
