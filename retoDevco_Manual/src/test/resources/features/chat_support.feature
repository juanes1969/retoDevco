Feature: Travelosity chat with support option
  An user can chat with support option in the page travelosity

  @manual @TestCase1
  Scenario: Chat support TC1, Successful case
  Narrative: Successful Chat support

    Given User opens the page travelosity
    When User select the option Support
    And User Select the option chat now and verify questions initials
    And User type and send message a support chatbot
    Then User verifies the successful answer with respect to your question

