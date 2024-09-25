package Tests;

import Pages.P07_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class T07_SearchTest {

    P07_SearchPage searchPage = new P07_SearchPage();

    @And("user enter {string} the name of product on search field")
    public void enterSearchedWord(String word){
        searchPage.sendDataToSearchField();
    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        searchPage.clickOnSearchButton();
    }


    @Then("a product with description {string} will appear")
    public void aProductWithDescriptionWillAppear(String searchedItem) {
        String item = searchPage.getTextOfSearchedIten();
        searchPage.getSoftAssert();
        searchPage.assertion(item , searchedItem);
        searchPage.assertAll();
    }
}
