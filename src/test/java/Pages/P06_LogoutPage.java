package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Tests.Hooks.driver;

public class P06_LogoutPage {

    //Locators
    By logOutButtonLocator = By.xpath("//a[@href = '/logout']");

    //Actions
    public WebElement getLogOutButtonLocation(){
        return  driver.findElement(logOutButtonLocator);
    }

    public void clickOnLogOutbutton(){
        getLogOutButtonLocation().click();
    }
}
