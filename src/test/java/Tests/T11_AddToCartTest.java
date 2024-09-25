package Tests;

import Pages.P11_AddToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class T11_AddToCartTest {

    P11_AddToCartPage addToCartPage = new P11_AddToCartPage();

    @And("user clicks on add to cart button")
    public void clickOnAddToCartButton(){
        addToCartPage.clickOnAddToCartButton();
    }


    @And("user clicks on view cart button")
    public void userClicksOnViewCartButton() {
        addToCartPage.clickOnViewCartButton();
    }


    @Then("user can verify that item was added to cart")
    public void userCanVerifyThatItemWasAddedToCart() {
        System.out.println("The word issss " +  addToCartPage.getTextOfBlueTopWord());;
    }
}
