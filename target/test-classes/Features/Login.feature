Feature:Login


@stage
  Scenario: Login to Gmail using correct value
    Given when a user has valid credentials like "correct" and "password"
    When the user tries to login
    Then the login should be succeesful

  @smoke
  Scenario: Login to Gmail using incorrect value
    Given when a user has valid credentials like "incorrect" and "password"
    When the user tries to login
    Then the login should be succeesful

    @prod
  Scenario Outline: Login to gmail with multiple values
    Given when a user has valid credentials like "<username>" and "<password>"
    When the user tries to login
    Then the login should be succeesful
    Examples:
      | username   | password   |
      | value1     | values2    |
      | value1 dfg | valuesdsf2 |
      | dsg        | fdg        |


