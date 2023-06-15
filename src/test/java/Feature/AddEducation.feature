Feature: AddEducation

  A short summary of the feature

  @tag1
  Scenario Outline: I Add Education on my profile
    Given I launch and log into MarsQA portal successfully
    When I add my education including '<Country>','<University>','<Title>','<Degree>','<Graduation>'
    Then I am able to see my education details including '<Country>','<University>','<Title>','<Degree>','<Graduation>'

    Examples:
      | Country     | University | Title | Degree   | Graduation |
      | Croatia     | SEduNet    | M.B.A | Bachalor | 2012       |
      | New Zealand | EduNet     | M.A   | Diploma  | 2023       |
