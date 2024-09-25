@AddToCart
  Feature: User add items to cart

    Scenario:
      Given user opens the website
      When user clicks on products button on the top of page
      And user finds All products word
      And user clicks on add to cart button
      And user clicks on view cart button
      Then user can verify that item was added to cart