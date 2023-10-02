Feature:Prod


  @prod
  Scenario: Login to Gmail using correct value on production
    Given when a user has valid credentials like "correct" and "password"
    When the user tries to login
    And user validates capcha
    Then the login should be succeesful

    @smoke
  Scenario: Login to Gmail using incorrect value on production
    Given when a user has valid credentials like "incorrect" and "password"
    When the user tries to login
    Then the login should be succeesful
@smoke
  Scenario Outline: Login to gmail with multiple values on production
    Given when a user has valid credentials like "<username>" and "<password>"
    When the user tries to login
    Then the login should be succeesful
    Examples:
      | username   | password   |
      | value1     | values2    |
      | value1 dfg | valuesdsf2 |
      | dsg        | fdg        |


