Feature: Travelosity Change of language
  An user can Change of language in the page travelosity

  @manual @TestCase1
  Scenario: Change of language TC1, Successful case
  Narrative: Successful Change of language

    Given User opens the page travelosity
    When User select the Spanish option
    Then User verifies the successful change of language

