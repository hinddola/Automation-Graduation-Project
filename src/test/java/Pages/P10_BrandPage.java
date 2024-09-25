package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;

public class P10_BrandPage {

    SoftAssert softAssert;

    //locators
    By brandWord = By.xpath("//h2[text() = 'Brands' ]");
    By poloBrandLink = By.xpath("//a[text()='/brand products/Polo']");
    By kookieKidsLink = By.xpath("//a[text()='/brand products/Kookie Kids']");
    By poloProductsWord = By.xpath("//h2[text()='Brand - Polo Products']");
    By kookieKidsProductsWord = By.xpath("//h2[text()='Brand - Kookie Kids Products']");

    //Actions
    public WebElement getBrandWordLocator(){
        return driver.findElement(brandWord);
    }

    public String getBrandWordText(){
        return getBrandWordLocator().getText();
    }

    public WebElement getPoloBrandLink(){
        return driver.findElement(poloBrandLink);
    }

    public void clickOnPoloLink(){
        getPoloBrandLink().click();
    }

    public WebElement getKookieKidsLink(){
        return driver.findElement(kookieKidsLink);
    }

    public void clickOnKookieKidsLink(){
        getKookieKidsLink().click();
    }

    public WebElement getPoloProducts(){
        return driver.findElement(poloProductsWord);
    }

    public void getPoloProductsText(){
        getPoloProducts().getText();
    }

     public WebElement getKooKieKidsProductsWord(){
        return driver.findElement(kookieKidsProductsWord );
     }

     public String getKookieKidsText(){
        return getKooKieKidsProductsWord().getText();
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
