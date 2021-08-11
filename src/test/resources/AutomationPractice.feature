@smoke
Feature: The user is able login and navigate

  Scenario: I open the application and I login
    Given The user opens firefox browser
    And navigates to the application http://automationpractice.com/index.php
    And The user clicks on Sign In button
    Then The user creates account with email emailFortest@test.com and clicks on Submit button
    Then The user completes form with data with:
      | ioana | iacob | password123 | 17 | 10 | 1993 | Ioana | Iacob | Iasi | Iasi | Alabama | 00000 | United States | 0785555 | random alias |
    Then the user submits the form
    And the user account was created
    Then The user closes the browser