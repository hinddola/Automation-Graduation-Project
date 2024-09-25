@Search
  Feature: Search about product

    Scenario:
      Given user opens the website
      When user clicks on products button on the top of page
      And user finds All products word
      And user enter "Kids" the name of product on search field
      And user clicks on search button
      Then a product with description "Frozen Tops For Kids" will appear