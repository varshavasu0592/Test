@dataTable
Feature:Datatable


  Scenario: Login to Gmail using correct list
    Given when a user has valid credentials like "correct" and "password"
    When the user tries to login
    And user enters firstname and lastname
      | rahul | varsaha |
      | john  | nasbfjh |
    Then the login should be succeesful

  Scenario: Login to Gmail using correct map
    Given when a user has valid credentials like "correct" and "password"
    When the user tries to login
    And user enters firstname and middlename
      | firstname | middlename |
      | john  | abraham |
      | john  | aishwarya |
      | frake  | gillaims |
    Then the login should be succeesful





