package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.Hooks.driver;

public class P11_AddToCartPage {

    //Locators
    By addToCartButton = By.xpath("//a[text()='Add to cart']");
    By viewCartButton = By.xpath("//a[text()='View Cart']");
    By blueTopWord = By.xpath("//a[text()='Blue Top']");

    //Actions
    public WebElement getAddToCartButtonLocator(){
        return  driver.findElement(addToCartButton);
    }

    public void clickOnAddToCartButton(){
        getAddToCartButtonLocator().click();
    }

    public WebElement getViewCartButtonLocator(){
        return driver.findElement(viewCartButton);
    }

    public void clickOnViewCartButton(){
        getViewCartButtonLocator().click();
    }

    public WebElement getBlueTopWordLocator(){
        return driver.findElement(blueTopWord);
    }

    public String getTextOfBlueTopWord(){
        return getBlueTopWordLocator().getText();
    }

}
