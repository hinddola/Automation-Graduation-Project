package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;

public class P02_LoginPage {

    SoftAssert softAssert ;

    //Locators
    By signUp_LoginLocator = By.xpath("//a[@href = '/login']");
    By emailLocator = By.xpath("//input[@type = 'email']");
    By passwordLocator = By.xpath("//input[@type = 'password']");
    By loginButtonLocator = By.xpath("//button[@data-qa='login-button']");
    By hintMessageLocator = By.xpath("//p[text()='Your email or password is incorrect!']");
//    By loggedInAsLocator = By.xpath("//p[@style='color: red;']");
    By loggedInAsLocator = By.xpath("//a[text()=' Logged in as ']");

    // Actions
    public WebElement getSignUpAndLoginLocator(){
        return driver.findElement(signUp_LoginLocator);
    }

    public void clickOnSignUp(){
        getSignUpAndLoginLocator().click();
    }

    public WebElement getEmailLocator(){
        return driver.findElement(emailLocator);
    }

    public void  sendDataToEmail(String email){
        getEmailLocator().sendKeys(email);
    }

    public WebElement getPasswordLocator(){
        return driver.findElement(passwordLocator);
    }

    public void sendDataToPassword(String password){
        getPasswordLocator().sendKeys(password);
    }

    public WebElement getLoginButtonLocator(){
        return driver.findElement(loginButtonLocator);
    }

    public void clickOnLoginButton(){
        getLoginButtonLocator().click();
    }

    public WebElement getHintMessageLocator(){
        return driver.findElement(hintMessageLocator);
    }

    public String getTextOfHintMessage(){
        return getHintMessageLocator().getText();
    }

    public WebElement getLoggedInAsWordLocator(){
        return driver.findElement(loggedInAsLocator);
    }

    //Assertion

    public void getSoftAssert(){
        softAssert = new SoftAssert();
    }

    public void assertion(String actualResult , String expectedResult){
        softAssert.assertEquals(actualResult , expectedResult);
    }

    public void assertAll(){
        softAssert.assertAll();
    }
}
