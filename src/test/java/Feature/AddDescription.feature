Feature: AddDescription

  A short summary of the feature

  @tag1
  Scenario: Add Description to my profile
    Given I launch and log into MarsQA portal successfully
    When I add a new description
    Then Then the new description should be added succesfully

  Scenario Outline: Edit description
    Given I launch and log into MarsQA portal successfully
    When I updated my '<description>'
    Then Then '<description>' should be updated successfully

    Examples:
      | description |
      | bulja       |
      | again       |