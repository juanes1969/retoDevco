Feature: Cruises
  A user will be able to select the cruises option on the travel page.

  Scenario Outline: Search for cruises when the information provided is correct
  Narrative: Search for a cruises by providing destination ,
  travelers and depature dates.

    Given Juan wants to enter the page
    When Enter the information for the cruises option
      | origin   | dayOfExit   | dayOfArrival   | addAdults   | addChildrens   |
      | <origin> | <dayOfExit> | <dayOfArrival> | <addAdults> | <addChildrens> |
    Then I verify the available cruises in the page

    Examples:
      | origin    | dayOfExit | dayOfArrival | addAdults | addChildrens |
      | Caribbean | 31        | 7            | 0         | 1            |
