package Tests;

import Pages.P02_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import static Tests.Hooks.driver;

public class T02_LoginTest {
    P02_LoginPage loginPage = new P02_LoginPage();

    @When("user enters valid email {string}")
    public void enterValidEmail(String email){
        loginPage.sendDataToEmail(email);
    }

    @And("user enters valid password {string}")
    public void enterValidPassword(String password){
        loginPage.sendDataToPassword(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("the home page will be opened and see his name next to the word logged in as")
    public void theHomePageWillBeOpenedAndSeeTheWordLoggedIn() {
        loginPage.getLoggedInAsWordLocator();
        System.out.println("The user logged in AS "+loginPage.getLoggedInAsWordLocator().getText());
    }


    @When("user enters incorrect email {string}")
    public void userEntersIncorrectEmail(String email) {
        loginPage.sendDataToEmail(email);
    }

    @Then("a hint message will appear")
    public void aHintMessageWillAppear() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("The Hint Message is == " +  loginPage.getTextOfHintMessage());
        loginPage.getSoftAssert();
        loginPage.assertion(loginPage.getTextOfHintMessage(),"Your email or password is incorrect!");
        loginPage.assertAll();
    }


}
