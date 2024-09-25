package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;


public class P05_TestCasesPage {

    SoftAssert softAssert;
    //Locators
    By testCasesButtonLocator = By.xpath("//a[text() = ' Test Cases']");
    By testCasesWordLocator = By.xpath("//span[contains(text() , 'Test')]");

    //Actions
    public WebElement getTestCasesButtonLocation(){
        return driver.findElement(testCasesButtonLocator);
    }

    public void clickOnTestCaseButton(){
        getTestCasesButtonLocation().click();
    }

    public WebElement getTestCasesWordLocation(){
        return driver.findElement(testCasesWordLocator);
    }

    public String getTextOfTestCasesWord(){
       return getTestCasesWordLocation().getText();
    }

    //Assertion
    public void getSoftAssert(){
        softAssert = new SoftAssert();
    }

    public void assertion(String actual , String expected){
        softAssert.assertEquals(actual , expected);
    }

    public void assertAll(){
        softAssert.assertAll();
    }

}
