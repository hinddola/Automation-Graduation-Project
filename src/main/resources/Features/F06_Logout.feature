@Logout
  Feature: Logout

    Scenario: user logout successfully
      Given user opens the website
      And user clicks on signup-login on the top of page
      When user enters valid email "hinddola42@gmail.com"
      And user enters valid password "123456789"
      And user clicks on login button
      Then the home page will be opened and see his name next to the word logged in as
      And logout button will appear and user clicks on it and navigate to login page

