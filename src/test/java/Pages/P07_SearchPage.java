package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.net.Socket;

import static Tests.Hooks.driver;

public class P07_SearchPage {

    SoftAssert softAssert;

    //locators
//    By searchFieldLocator = By.id("search_product");
    By searchFieldLocator = By.xpath("//input[@placeholder = 'Search Product']");
    By searchButtonLocator = By.id("submit_search");
    By searchedItemLocator = By.xpath("//p[text() = 'Frozen Tops For Kids']");

    //Actions
    public WebElement getsearchFieldLocation(){
        return driver.findElement(searchFieldLocator);
    }

    public void sendDataToSearchField(){
        getsearchFieldLocation().sendKeys();
    }

    public WebElement getSearchButtonLocation(){
        return driver.findElement(searchButtonLocator);
    }

    public void clickOnSearchButton(){
        getSearchButtonLocation().click();
    }

    public WebElement getSearchedItemLocation(){
        return driver.findElement(searchedItemLocator);
    }

    public String getTextOfSearchedIten(){
        return getSearchedItemLocation().getText();
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
