package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;

public class P04_ContactUsPage {

    SoftAssert softAssert;
    Alert alert;

    //Locators
    By contactUsLocator = By.xpath("//a[text()=' Contact us']");
    By getInTouchWordLocator = By.xpath("//h2[contains(text() , 'Contact ')]");
    By nameLocator = By.xpath("//input[ @data-qa = 'name' ]");
    By emailLocator = By.name("email");
    By subjectLocator = By.name("subject");
    By messageLocator = By.name("message");
    By submitButtonLocator = By.name("submit");
    By successContactMessage = By.xpath("//div[text() = 'Success! Your details have been submitted successfully.']");

    //Actions
    public WebElement getContactUsButtonLocation(){
        return driver.findElement(contactUsLocator);
    }

    public void clickOnContactUsButton(){
        getContactUsButtonLocation().click();
    }

    public WebElement getInTouchWordLocation(){
        return driver.findElement(getInTouchWordLocator);
    }

    public String getInTouchWordText(){
        return getInTouchWordLocation().getText();
    }

    public WebElement getNameLocation(){
        return driver.findElement(nameLocator);
    }

    public void sendDataToName(){
        getNameLocation().sendKeys();
    }

    public WebElement getEmailLocation(){
        return driver.findElement(emailLocator);
    }

    public void sendDataToEmail(){
        getEmailLocation().sendKeys();
    }

    public WebElement getSubjectLocation(){
        return driver.findElement(subjectLocator);
    }

    public void sendDataToSubject(){
        getSubjectLocation().sendKeys();
    }

    public WebElement getMessageLocation(){
        return driver.findElement(messageLocator);
    }

    public void sendDataToMessage(){
        getMessageLocation().sendKeys();
    }

    public WebElement getSubmitButtonLocation(){
        return driver.findElement(submitButtonLocator);
    }

    public void clickOnSubmitButton(){
        getSubmitButtonLocation().click();
    }

    public void switchToAlert(){
        alert = driver.switchTo().alert();
    }

    public void clickOk(){
        alert.accept();
    }

    public WebElement getSuccessMessageLocation(){
        return driver.findElement(successContactMessage);
    }

    public String getTextOfSuccessMessage(){
       return getSuccessMessageLocation().getText();
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
