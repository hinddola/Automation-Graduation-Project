Feature: Home Page Subscription
  Scenario:
    Given user opens the website
    When user verify "Subscription" word is visible
    And user enter his email on email field
    And user clicks on arrow button
    Then message contains "You have been successfully subscribed!" appear