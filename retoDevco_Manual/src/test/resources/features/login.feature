Feature: Travelosity Login user option
  An user can Login user option in the page travelosity

  @manual @TestCase1
  Scenario: Login user TC1, Successful case
  Narrative: Successful Login

    Given User opens the page travelosity
    When User select the option Login user
    And User login with correct information in the login options
    And User complete the information for login user
    Then User verifies the successful login user in travelosity page

