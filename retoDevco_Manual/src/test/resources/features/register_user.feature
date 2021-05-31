Feature: Travelosity captcah register user option
  An user can register user option in the page travelosity

  @manual @TestCase1
  Scenario: Register user TC1, Successful case
  Narrative: Successful register user

    Given User opens the page travelosity
    When User select the option resgiter user
    And User select correct information in the captcha
    And User complete the information for register user
    Then User verifies the successful register user in travelosity page

