@ContactUs
Feature: Contact Us

  Background:
    Given user opens the website

    @ContactUs_TC1
    Scenario: user successfully contact us
      When user clicks on contact us button
      And user verify "Contact " appears
      And user enters his name "Hind"
      And user enters his email "hinddola42@gmail.com"
      And user enters subject "Hello"
      And user enters the message "I need someOne from support team to contact with me soon"
      And user clicks on submit button
      And user switch to alert
      And user clicks on ok button on opened alert
      Then user can see the submition successfully message "Success! Your details have been submitted successfully."
