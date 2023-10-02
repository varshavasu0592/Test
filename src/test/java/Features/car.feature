Feature: Validation of car search page
  In order to validate as car search as buyer
  as a buyer
  I navigate http://carsguide.com.au

  Scenario: Searching new car
    Given I am on the HomePage "https://www.carsguide.com.au/" of carsguide website
    When i navigate to carsforsale menu
    Then i click on searchcars
    And i select Make as "BMW"
    And i select model as "1 Series"
    And i select location as "VIC - Melbourne"
    And i select price as "$10,000"
    And i click on Find My Next Car Button
    Then i should see list of searched cards and the page title should be "5 BMW"

