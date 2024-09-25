package Pages;

import org.openqa.selenium.By;

public class P08_HomePageSubscription {

    //Locators
    By subscriptionWordLocator = By.xpath("//h2[text() = 'Subscription']");
    By emailFieldLocator = By.xpath("//input[@id = 'susbscribe_email']");
    By arrowButtonLocator = By.xpath("//button[@id='subscribe']");


}
