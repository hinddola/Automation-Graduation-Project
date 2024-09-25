@Register
Feature: Register using name and email

  Background:
    Given user opens the website
    And user clicks on signup-login on the top of page

  @Register_TC1
  Scenario: Register using valid name and valid e-mail
    When user enters valid name
    And user enters valid e-mail
    And user clicks on sign-up button
    Then the next complete account information page will be opened

  @Register_TC2
  Scenario Outline:
    When user enters valid name
    And user enters invalid "<Email>" in email field
    And user clicks on sign-up button
    Then a hint message contains "<Message>" appears

    Examples:
      | Email | Message |
      |   hinddola42gmail.com    |     Please include an '@' in the email address. 'hinddola42gmail.com ' is missing an '@' |
      |     @gmail.com           |     Please enter a part followed by '@'. '@gmail.com' is incomplete  |

  @Register_TC3
  Scenario: User enters valid name and existing email
    When user enters valid name
    And user enters an existing email "hinddola42@gmail.com"
    And user clicks on sign-up button
#    Then a text will appear contains that email already exist
    Then a signup button still appear


  @Register_TC4
  Scenario: user completes the information
      When user sign up
      And user check if next information page opened
      And user click on MRs radio button
      And user enter valid password "123456789"
      And user select day of birth
      And user select month of birth
      And user select year of birth
      And user enters first name "Hind"
      And user enters last name "Sherif"
      And user enters address "Mansoura"
      And user choose country
      And user enters a state "Touriel"
      And user enters a city "Mansoura"
      And user enters a zipcode "050"
      And user enters a mobile number "01068672644"
      And user clicks on create account button
      Then user will find continue button and click on it

