package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void init(){
        amazonLogin = PageFactory.initElements(driver,PageObjects.Amazon.loginPage.class);

    }



}
