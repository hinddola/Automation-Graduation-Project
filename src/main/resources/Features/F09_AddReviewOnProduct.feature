@AddReview
Feature: Add review on product

  @AddReview_TC1
  Scenario:
    Given user opens the website
    When user clicks on products button on the top of page
    And user finds All products word
    And user clicks on view product button of first product
    And user can find "WRITE YOUR REVIEW"
    And user enter "Hind" on name field
    And user enter "hinddola42@gmail.com" on email field
    And user enter "My Review" on review field
    And user click on submit button
    Then user see success message contains "Thank you for your review."
