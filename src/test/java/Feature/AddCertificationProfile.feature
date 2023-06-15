Feature: AddCertificationProfile

  As a site user I would like to sign in,create ,edit the profile so
  that seller would able to see profile deitals on the page. short summary of the feature

  @tag1
  Scenario: 1Add certification on my profile
    Given I launch and log into MarsQA portal successfully
    When I add a new certification
    Then Then the new certification should be added succesfully

  Scenario: 2Edit certification on my profile
    Given I launch and log into MarsQA portal successfully
    When I edited a new certification
    Then Then a new certification should be edited

  Scenario: 3Delete certification on my profile
    Given I launch and log into MarsQA portal successfully
    When I deleted certification
    Then Then certification should be deleted
