Feature: PossibleTestCases

  A short summary of the feature

  @tag1

  Scenario: ADD Availability type on my profile
    Given  I launch and log into MarsQA portal successfully
    When I select availability type
    Then Then availability type should be displayed sucessfully

  Scenario: ADD working hours range on my profile
    Given  I launch and log into MarsQA portal successfully
    When I select the number of working hours
    Then Then working hours should be displayes succesfully

  Scenario: ADD Earn target on my profile
    Given  I launch and log into MarsQA portal successfully
    When I select earning target range
    Then Then earning target should be displayed successfully

  Scenario: ADD description on my profile
    Given I launch and log into MarsQA portal successfully
    When I add a new description details
    Then The new description details should be added successfully