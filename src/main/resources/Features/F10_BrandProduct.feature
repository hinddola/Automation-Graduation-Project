@BrandProduct
  Feature: User can see all Brands

    Scenario:
      Given user opens the website
      When user clicks on products button on the top of page
      And user can see "BRANDS" on the left side of page
      And user clicks on any brand name
      Then user navigate to the clicked brand page
