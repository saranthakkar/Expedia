Feature:

  Scenario: user wants to search flight from and to with selected dates
    Given user is on homepage of Expedia for flight search
    When user selects flying from option
    And user selects flying to option
    And user selects departing date
    And user selects returning date
    And user clicks on search button
    Then user should be able to see result page