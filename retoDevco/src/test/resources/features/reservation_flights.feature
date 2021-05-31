@Travelocity

Feature: Reservation Flights
  A user will be able to search for a Flights reservation on the travelosity page.

  Scenario Outline: Search for a Flights when the information provided is correct
  Narrative: Search for a Flights by providing destination information,
  arrival and departure dates

    Given Juan wants to enter the page
    When Enter the information for the reservation flights
      | origin   | destination   | dayOfExit   | dayOfArrival   |
      | <origin> | <destination> | <dayOfExit> | <dayOfArrival> |
    Then I verify the available flights in the page

    Examples:
      | origin   | destination | dayOfExit | dayOfArrival |
      | Medellin | Bogota      | 10        | 4            |



