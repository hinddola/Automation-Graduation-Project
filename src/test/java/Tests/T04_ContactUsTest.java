package Tests;

import Pages.P04_ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T04_ContactUsTest {
    
    P04_ContactUsPage contactUsPage = new P04_ContactUsPage();

    @When("user clicks on contact us button")
    public void clicksOnContactUsButton(){
        contactUsPage.clickOnContactUsButton();
    }

//
//    @And("user verify {string} appears")
//    public void userVerifyThatThePageOpenedSuccesfully(String getInTouch) {
//        String actualWord = contactUsPage.getInTouchWordText();
//        contactUsPage.getSoftAssert();
//        contactUsPage.assertion(actualWord, getInTouch);
//        contactUsPage.assertAll();
//    }

    @And("user verify {string} appears")
    public void userVerifyThatThePageOpenedSuccesfully() {
        System.out.println(" The word issssssss ====== " + contactUsPage.getInTouchWordText());

    }

    @And("user enters his name {string}")
    public void userEntersHisName(String name) {
        contactUsPage.sendDataToName();
    }

    @And("user enters his email {string}")
    public void userEntersHisEmail(String email) {
        contactUsPage.sendDataToEmail();
    }

    @And("user enters subject {string}")
    public void userEntersSubject(String subject) {
        contactUsPage.sendDataToSubject();
    }

    @And("user enters the message {string}")
    public void userEntersTheMessage(String message) {
        contactUsPage.sendDataToMessage();
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        contactUsPage.clickOnSubmitButton();
    }

    @And("user switch to alert")
    public void userSwitchToAlert() {
        contactUsPage.switchToAlert();
    }

    @And("user clicks on ok button on opened alert")
    public void userClicksOnOkButtonOnOpenedAlert() {
        contactUsPage.clickOk();
    }


    @Then("user can see the submition successfully message {string}")
    public void userCanSeeTheSubmitionSuccessfullyMessage(String successMessage) {
        System.out.println("The message isss " + contactUsPage.getTextOfSuccessMessage());
    }
}
