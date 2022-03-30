package Utilities;

import PageObjects.Amazon.HomePage;
import PageObjects.Amazon.MyAccountMenu;
import PageObjects.Amazon.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions ;



    public static loginPage amazonLogin;
    public static HomePage homePage;
    public static PageObjects.Amazon.TopMenuPage TopMenuPage;
    public static MyAccountMenu myAccountMenu;

}
