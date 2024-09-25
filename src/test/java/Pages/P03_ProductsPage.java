package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;

public class P03_ProductsPage {

    SoftAssert softAssert;

    //Locators
    By productsButtonLocator = By.xpath("//a[@href='/products']");
    By allProductsWordLocator = By.xpath("//h2[text()='All Products']");
    By productDetailsButtonLocator = By.xpath("//a[text()='View Product']");
    By productCategoryLocator = By.xpath("//p[text()='Category: Women > Tops']");


    //Action
    public WebElement getProductsLocation(){
        return driver.findElement(productsButtonLocator);
    }

    public void clickOnProductsButton(){
        getProductsLocation().click();
    }

    public WebElement getAllProductsWordLocation(){
        return driver.findElement(allProductsWordLocator);
    }

    public String getTextOfAllProductsWord(){
        return getAllProductsWordLocation().getText();
    }

    public WebElement getProductDetailsButtonLocator(){
        return driver.findElement(productDetailsButtonLocator);
    }

    public void clickOnProductDetailsButton(){
        getProductDetailsButtonLocator().click();
    }

    public WebElement getproductCategory(){
        return driver.findElement(productCategoryLocator);
    }

    public String getTextOfCategory(){
        return getproductCategory().getText();
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
