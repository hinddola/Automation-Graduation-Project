@TestCases
  Feature: Test Cases

    @TestCases_TC1
    Scenario: user checks the test cases on the website
      Given user opens the website
      When user clicks on test cases button
      Then user checks "Test" is visible
