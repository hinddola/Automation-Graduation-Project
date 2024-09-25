@Products
  Feature: Products page

    Background:
      Given user opens the website

    @Products_TC1
    Scenario:
      When user clicks on products button on the top of page
      And user finds All products word
      And user clicks on view product button of first product
      Then user can check the details of chosen product like its category