package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static Tests.Hooks.driver;

public class P01_RegisterPage {

    SoftAssert softAssert;

    //Locators
    By signUp_LoginLocator = By.xpath("//a[@href='/login']");
    By nameLocator = By.name("name");
    By emailLocator = By.xpath("//input[@data-qa = 'signup-email']");
    By signUpButtonLocator = By.xpath("//button[@data-qa='signup-button']");
    By hintMessageLocator = By.xpath("//input[@type='hidden']");
    By hintTextLocator = By.tagName("p");
    By informationAccountTextLocator = By.tagName("h2");
    By MRsradioButtonLocator = By.id("id_gender2");
    By passwordLocator = By.name("password");
    By daysLocator = By.xpath("//select[@id = 'days']");
    By monthsLocator = By.xpath("//select[@id = 'months']");
    By yearsLocator = By.xpath("//select[@id = 'years']");
    By firstName = By.xpath("//input[@data-qa='first_name']");
    By lastName = By.xpath("//input[@data-qa='last_name']");
    By addressLocator = By.xpath("//input[@data-qa='address']");
    By countryLocator = By.xpath("//select[@name='country']");
    By stateLocator = By.xpath("//input[@data-qa = 'state']");
    By cityLocator = By.xpath("//input[@data-qa = 'city']");
    By zipcodeLocator = By.xpath("//input[@data-qa = 'zipcode']");
    By mobileNumberLocator = By.xpath("//input[@data-qa = 'mobile_number']");
    By createAccountButtonLocator = By.xpath("//button[@data-qa = 'create-account']");
    //By accountCreatedTextLocator = By.tagName("p");
    By continueButton = By.xpath("//a[@href='/']");


    //Actions
    public WebElement getSignUpAndLoginLocator(){
        return driver.findElement(signUp_LoginLocator);
    }

    public void clickOnSignUp(){
        getSignUpAndLoginLocator().click();
    }

    public WebElement getName(){

        return driver.findElement(nameLocator);
    }

    public WebElement getEmail(){
        return driver.findElement(emailLocator);
    }

    public void sendDataToEmail(String data){
        getEmail().sendKeys(data);
    }

    public WebElement getSignUpButton(){
        return driver.findElement(signUpButtonLocator);
    }

    public void clickOnSignUpButton(){
        getSignUpButton().click();
    }

    public String getHintMessageText(){
        return driver.findElement(hintMessageLocator).getText();
    }

    public WebElement getHintTextLocator(){
       return driver.findElement(hintTextLocator);
    }

    public String getHintText(){
       return getHintTextLocator().getText();
    }

    public WebElement getAccountInformation(){
        return  driver.findElement(informationAccountTextLocator);
    }

    public String getAccountInformationText(){
      return  getAccountInformation().getText();
    }

    public WebElement getMRsRadioButtonLocator(){
        return  driver.findElement(MRsradioButtonLocator);
    }

    public void clickOnMRsRadioButton(){
        getMRsRadioButtonLocator().click();
    }

    public WebElement getPasswordLocator(){
        return driver.findElement(passwordLocator);
    }

    public void sendDataToPassword(String password){
        getPasswordLocator().sendKeys(password);
    }

    public WebElement getDaysLocator(){
        return driver.findElement(daysLocator);
    }

    public void selectDay(){
        Select daySelect = new Select(getDaysLocator());
        daySelect.selectByIndex(0);
    }

    public WebElement getMonthsLocator(){
        return driver.findElement(monthsLocator);
    }

    public void selectMonth(){
        Select daySelect = new Select(getMonthsLocator());
        daySelect.selectByIndex(7);

    }

    public WebElement getYearsLocator(){
        return driver.findElement(yearsLocator);
    }

    public void selectYear(){
        Select daySelect = new Select(getYearsLocator());
        daySelect.selectByValue("1998");
    }

    public WebElement getFirstNameLocator(){
        return driver.findElement(firstName);
    }

    public void sendDataToFirstName(String firstName){
        getFirstNameLocator().sendKeys(firstName);
    }

    public WebElement getLastNameLocator(){
        return driver.findElement(lastName);
    }

    public void sendDataToLastName(String lastName){
        getFirstNameLocator().sendKeys(lastName);
    }

    public WebElement getAddressLocator(){
        return driver.findElement(addressLocator);
    }

    public void sendDatatoAddress(String address){
        getAddressLocator().sendKeys(address);
    }

    public WebElement getCountryLocator(){
        return driver.findElement(countryLocator);
    }

    public void selectCountry(){
        Select daySelect = new Select(getCountryLocator());
        daySelect.selectByValue("Canada");
    }

    public WebElement getStateLocator(){
        return driver.findElement(stateLocator);
    }

    public void sendDataToState(String state){
        getStateLocator().sendKeys(state);
    }

    public WebElement getCityLocator(){
        return driver.findElement(cityLocator);
    }

    public void sendDataToCity(String city){
        getCityLocator().sendKeys(city);
    }

    public WebElement getZipcodeLocator(){
        return driver.findElement(zipcodeLocator);
    }

    public void sendDataToZipcode(String zipcode){
        getZipcodeLocator().sendKeys(zipcode);
    }

    public WebElement getMobileNumberLocator(){
        return driver.findElement(mobileNumberLocator);
    }

    public void sendDataToMobileNumber(String mobileNum){
        getMobileNumberLocator().sendKeys(mobileNum);
    }

    public WebElement getCreateAccountButtonLocator(){
        return driver.findElement(createAccountButtonLocator);
    }

    public void clickOnCreateAccountButton(){
        getCreateAccountButtonLocator().click();
    }

    public  WebElement getContinueButtonLocator(){
        return driver.findElement(continueButton);
    }

    public void clickOnonContinueButton(){
         getContinueButtonLocator().click();
    }

//    public WebElement getCreateAccountLocator(){
//        return driver.findElement(accountCreatedTextLocator);
//    }
//
//    public String getTextOfCreatedAccount(){
//       return getCreateAccountLocator().getText();
//    }




    public void getSoftAssert(){
        softAssert = new SoftAssert();
    }


    public void assertion(String Actual , String Expected){
        softAssert.assertEquals(Actual , Expected);
    }

    public void assertAll(){
        softAssert.assertAll();
    }








}
