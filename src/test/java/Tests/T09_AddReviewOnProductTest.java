package Tests;

import Pages.P09_AddReviewOnProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class T09_AddReviewOnProductTest {

    P09_AddReviewOnProduct addReviewOnProduct = new P09_AddReviewOnProduct();

    @And("user can find {string}")
    public void getAddReviewWord(String word){
        addReviewOnProduct.getSoftAssert();
        addReviewOnProduct.assertion(addReviewOnProduct.getAddReviewText() , "WRITE YOUR REVIEW");
        addReviewOnProduct.assertAll();
    }


    @And("user enter {string} on name field")
    public void userEnterHisNameOnNameField(String name) {
        addReviewOnProduct.sendDataToNameField();
    }

    @And("user enter {string} on email field")
    public void userEnterOnEmailField(String email) {
        addReviewOnProduct.sendDataToEmail();
    }


    @And("user enter {string} on review field")
    public void userEnterOnReviewField(String review) {
        addReviewOnProduct.sendDataToReview();
    }


    @And("user click on submit button")
    public void userClickOnSubmitButton() {
        addReviewOnProduct.clickOnSubmitButton();
    }


    @Then("user see success message contains {string}")
    public void userSeeSuccessMessageContains(String successMessage) {
        addReviewOnProduct.getSoftAssert();
        addReviewOnProduct.assertion(addReviewOnProduct.successMessageText(),"Thank you for your review.");
        addReviewOnProduct.assertAll();
    }
}
