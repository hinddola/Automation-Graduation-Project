package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static Tests.Hooks.driver;

public class P09_AddReviewOnProduct {

    SoftAssert softAssert;

    //Locators
    By addReviewWord = By.xpath("//a[@href='#reviews']");
    By nameField = By.xpath("//input[@type = 'text']");
    By emailField = By.xpath("//input[@type = 'email']");
    By reviewField = By.xpath("//textarea[@id = 'review']");
    By submitButton = By.xpath("//button[@id ='button-review']");
    By successMessageLocator = By.xpath("//span[text() = 'Thank you for your review.']");

    //Actions
    public WebElement getAddReviewWordLocation(){
        return driver.findElement(addReviewWord);
    }

    public String getAddReviewText(){
        return getAddReviewWordLocation().getText();
    }

    public WebElement getNameFieldLocator(){
        return driver.findElement(nameField);
    }

    public void sendDataToNameField(){
        getNameFieldLocator().sendKeys();
    }

    public WebElement getEmailFieldLocator(){
        return driver.findElement(emailField);
    }

    public void sendDataToEmail(){
        getEmailFieldLocator().sendKeys();
    }

    public WebElement getReviewLocator(){
        return driver.findElement(reviewField);
    }

    public void sendDataToReview(){
        getReviewLocator().sendKeys();
    }

    public WebElement getSubmitButtonlocator(){
        return driver.findElement(submitButton);
    }

    public void clickOnSubmitButton(){
        getSubmitButtonlocator().click();
    }

    public WebElement getSuccessMessageLocator(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(successMessageLocator);
    }

    public String successMessageText(){
        return getSuccessMessageLocator().getText();
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
