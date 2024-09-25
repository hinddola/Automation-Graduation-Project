@Login
Feature: Login

  Background:
    Given user opens the website
    And user clicks on signup-login on the top of page

  @Login_TC1
  Scenario: login with valid name and valid email
    When user enters valid email "hinddola42@gmail.com"
    And user enters valid password "123456789"
    And user clicks on login button
    Then the home page will be opened and see his name next to the word logged in as

  @Login_TC2
  Scenario: login with incorrect email
    When user enters incorrect email "hind@gmail.com"
    And user enters valid password "123456789"
    And user clicks on login button
    Then a hint message will appear