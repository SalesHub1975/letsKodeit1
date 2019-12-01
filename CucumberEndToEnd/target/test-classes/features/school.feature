Feature: Cybertek training feature

  @addingStudent
  Scenario: Adding new student to school
    Given User is on School Homepage
    When User goes Students module and click Add Student button
    And User provides his personal information and clicks submit button
    Then User verifies information of new added student on UI page with database

