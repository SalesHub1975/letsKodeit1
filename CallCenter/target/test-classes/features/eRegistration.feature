Feature: Validation of eRegistration

  @happyPath
  Scenario: validating eregistration homepage
    Given User is on Homepage
    When User provides full name and date of birth
    And User provides zipcode
    Then verify select address field is displayed
    And User selects the last option from dropdown
    And User provides his full address
    And User clicks search button
    Then verify search result page is displayed
