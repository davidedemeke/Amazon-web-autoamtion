package Utilities;

import PageObjects.Amazon.PersonalArea;
import PageObjects.Amazon.loginPage;
import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void init(){
        amazonLogin = PageFactory.initElements(driver, loginPage.class);
// try for personal area class
// PersonalArea = PageFactory.initElements(driver, personalAreaPage.class);
    }



}
