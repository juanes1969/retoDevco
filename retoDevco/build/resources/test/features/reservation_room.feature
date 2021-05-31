@Travelocity

Feature: Reservation room
  A user will be able to search for a room reservation on the travelosity page.

  Scenario Outline: Search for a room when the information provided is correct
  Narrative: Search for a room by providing destination information,
             arrival and departure dates and number of people

    Given Juan wants to enter the page
    When Enter the information for the reservation
      | destination   | dayOfExit   | dayOfArrival   | addAdults   |  addChildrens   |
      | <destination> | <dayOfExit> | <dayOfArrival> | <addAdults> |  <addChildrens> |
    Then I verify the available rooms

    Examples:
    | destination | dayOfExit | dayOfArrival |addAdults| addChildrens|
    | Bogota      | 10        | 4            | 1       | 2           |



