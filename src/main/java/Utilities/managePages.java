package Utilities;

import PageObjects.Amazon.HomePage;
import PageObjects.Amazon.MyAccountMenu;
import PageObjects.Amazon.TopMenuPage;
import PageObjects.Amazon.loginPage;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void init(){
        amazonLogin = PageFactory.initElements(driver, loginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        TopMenuPage = PageFactory.initElements(driver, TopMenuPage.class);
        myAccountMenu = PageFactory.initElements(driver, MyAccountMenu.class);
    }



}
