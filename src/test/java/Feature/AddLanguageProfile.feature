Feature: AddLanguageProfile

  As a site user I would like to sign in,create ,edit the profile so
  that seller would able to see profile deitals on the page.

  @tag1
  Scenario: 1Add language on my profile
    Given I launch and log into MarsQA portal successfully
    When I add a new Language
    Then Then new language should be added successfully

  Scenario: 2Edit language on my profile
    Given I launch and log into MarsQA portal successfully
    When I edited a new language
    Then Then a new language should be edited successfully

  Scenario: 3Delete language on my profile
    Given I launch and log into MarsQA portal successfully
    When I deleted a language
    Then Then language should be deleted
