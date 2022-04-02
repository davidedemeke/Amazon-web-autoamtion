package Utilities;

import PageObjects.Amazon.*;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void init(){
        amazonLogin = PageFactory.initElements(driver, PageObjects.Amazon.loginPage.class);
        homePage = PageFactory.initElements(driver, PageObjects.Amazon.HomePage.class);
        TopMenuPage = PageFactory.initElements(driver, PageObjects.Amazon.TopMenuPage.class);
        myAccountMenu = PageFactory.initElements(driver, PageObjects.Amazon.MyAccountMenu.class);
        MyOrdersPage = PageFactory.initElements(driver, PageObjects.Amazon.MyOrdersPage.class);
    }



}
