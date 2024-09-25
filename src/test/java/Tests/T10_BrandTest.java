package Tests;

import Pages.P10_BrandPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class T10_BrandTest {
    P10_BrandPage brandPage = new P10_BrandPage();

    @And("user can see {string} on the left side of page")
    public void getBrandWord(String brandsWord){
        brandPage.getSoftAssert();
        brandPage.assertion(brandPage.getBrandWordText() , "BRANDS");
        brandPage.assertAll();
    }


    @And("user clicks on any brand name")
    public void userClicksOnAnyBrandName() throws InterruptedException {
        brandPage.clickOnPoloLink();
    }


    @Then("user navigate to the clicked brand page")
    public void userNavigateToTheClickedBrandPage() {
        brandPage.getPoloProductsText();
    }
}
