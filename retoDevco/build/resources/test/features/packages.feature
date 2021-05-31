Feature: Packages
  A user will be able to select the package option on the travel page.

  Scenario Outline: Search for packages when the information provided is correct
  Narrative: Search for a package by providing destination ,
  origin, departure dates and times

    Given Juan wants to enter the page
    When Enter the information for the package option
      | origin   | destiny   | dayOfExit   | dayOfArrival   |
      | <origin> | <destiny> | <dayOfExit> | <dayOfArrival> |
    Then I verify the available package in the page

    Examples:
      | origin   | destiny | dayOfExit | dayOfArrival |
      | Medellin | Bogota  | 10        | 4            |
