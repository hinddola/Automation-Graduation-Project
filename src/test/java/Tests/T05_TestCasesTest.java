package Tests;

import Pages.P05_TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T05_TestCasesTest {

    P05_TestCasesPage testCasesPage = new P05_TestCasesPage();

    @When("user clicks on test cases button")
    public void clickOnTestCasesButton(){
        testCasesPage.clickOnTestCaseButton();
    }

    @Then("user checks {string} is visible")
    public void userChecksIsVisible(String test) {
        String testCaseWord = testCasesPage.getTextOfTestCasesWord();
        testCasesPage.getSoftAssert();
        testCasesPage.assertion(testCaseWord , test);
        testCasesPage.assertAll();

    }
}
