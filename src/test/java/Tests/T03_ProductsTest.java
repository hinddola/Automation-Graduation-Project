package Tests;

import Pages.P03_ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T03_ProductsTest {


    P03_ProductsPage productsPage = new P03_ProductsPage();

    @When("user clicks on products button on the top of page")
    public void userClicksOnProductsButton(){
        productsPage.clickOnProductsButton();
    }

    @And("user finds All products word")
    public void userFindsAllProductsWord() {
        System.out.println("The Word is == " + productsPage.getTextOfAllProductsWord());

    }

    @And("user clicks on view product button of first product")
    public void userClicksOnViewProductButtonOfFirstProduct() {
        productsPage.clickOnProductDetailsButton();
    }

    @Then("user can check the details of chosen product like its category")
    public void userCanCheckTheDetailsOfChosenProductLikeItsCategory() {
        productsPage.getSoftAssert();
        productsPage.assertion( productsPage.getTextOfCategory() , "Category: Women > Tops");
        productsPage.assertAll();
    }
}
