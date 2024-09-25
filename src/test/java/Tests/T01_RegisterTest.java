package Tests;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Tests.Hooks.driver;

public class T01_RegisterTest {

    P01_RegisterPage registerPage = new P01_RegisterPage();

    @Given("user opens the website")
    public void userOpensTheWebsite() {
        driver.get("https://automationexercise.com");
    }


    @And("user clicks on signup-login on the top of page")
    public void userClicksOnSignupLoginOnTheTopOfPage() {
        registerPage.clickOnSignUp();
    }


    @When("user enters valid name")
    public void enterValidName() {
        registerPage.getName().sendKeys("Hind");
    }

    @And("user enters valid e-mail")
    public void enterValidEmail() {
        registerPage.sendDataToEmail("hinddola42+1@gmail.com");
    }

    @And("user enters invalid {string} in email field")
    public void enterInvalidEmail(String data) {
        registerPage.sendDataToEmail(data);
    }

    @And("user clicks on sign-up button")
    public void clickOnSignUpButton() {
        registerPage.clickOnSignUpButton();
    }


    @Then("the next complete account information page will be opened")
    public void nextPageOpened() {

    }

    @Then("a hint message contains {string} appears")
    public void hintMessageAppears(String s) {
        System.out.println("The Hint Message == " + registerPage.getHintMessageText());
    }

    @When("user enters an existing email {string}")
    public void enterExistingEmail(String email) {
        registerPage.sendDataToEmail(email);

    }
//
//    @Then("a text will appear contains that email already exist")
//    public void getHintText(){
//        System.out.println(registerPage.getHintText());
//    }

    @Then("a signup button still appear")
    public void checkSignUpButtonStillAppear() {
        System.out.println("text on sign up button = " + registerPage.getSignUpButton().getText());
        ;
    }


    @When("user sign up")
    public void userSignUp() {
        enterValidName();
        enterValidEmail();
        clickOnSignUpButton();
    }

    @And("user check if next information page opened")
    public void userCheckIfNextInformationPageOpened() {
        System.out.println(" The Text is ==== " + registerPage.getAccountInformationText());
    }

    @And("user click on MRs radio button")
    public void userClickOnMRsRadioButton() {
        registerPage.clickOnMRsRadioButton();
    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String password) {
        registerPage.sendDataToPassword(password);
    }

    @And("user select day of birth")
    public void userSelectDayOfBirth() {
        registerPage.selectDay();
    }

    @And("user select month of birth")
    public void userSelectMonthOfBirth() {
        registerPage.selectMonth();
    }

    @And("user select year of birth")
    public void userSelectYearOfBirth() {
        registerPage.selectYear();
    }

    @And("user enters first name {string}")
    public void userEntersFirstName(String firstName) {
        registerPage.sendDataToFirstName(firstName);

    }

    @And("user enters last name {string}")
    public void userEntersLastName(String lastName) {
        registerPage.sendDataToLastName(lastName);
    }


    @And("user enters address {string}")
    public void userEntersAddress(String address) {
        registerPage.sendDatatoAddress(address);
    }

    @And("user choose country")
    public void userChooseCountry() {
        registerPage.selectCountry();
    }

    @And("user enters a state {string}")
    public void userEntersAState(String state) {
        registerPage.sendDataToState(state);
    }

    @And("user enters a city {string}")
    public void userEntersACity(String city) {
        registerPage.sendDataToCity(city);
    }

    @And("user enters a zipcode {string}")
    public void userEntersAZipcode(String zipcode) {
        registerPage.sendDataToZipcode(zipcode);
    }

    @And("user enters a mobile number {string}")
    public void userEntersAMobileNumber(String mobileNum) {
        registerPage.sendDataToMobileNumber(mobileNum);
    }

    @And("user clicks on create account button")
    public void userClicksOnCreateAccountButton() {
        registerPage.clickOnCreateAccountButton();

    }

//    @Then("user will see a green text containes the account created")
//    public void userWillSeeAGreenTextContainesTheAccountCreated() {
//        String createdAcc = registerPage.getTextOfCreatedAccount();
//        System.out.println("The Created Account ==" + createdAcc);
//    }

    @Then("user will find continue button and click on it")
    public void userWillFindContinueButtonAndClickOnIt() {
        registerPage.clickOnonContinueButton();
    }


}
