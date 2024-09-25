package Tests;

import Pages.P06_LogoutPage;
import io.cucumber.java.en.And;

public class T06_LogoutTest {

    P06_LogoutPage logoutPage = new P06_LogoutPage();

    @And("logout button will appear and user clicks on it and navigate to login page")
    public void logOut(){
        logoutPage.clickOnLogOutbutton();
    }
}
