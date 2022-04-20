package Utilities;

import PageObjects.Amazon.Header;
import PageObjects.Amazon.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions ;



    public static login loginPage;
    public static PageObjects.Amazon.HomePage homePage;
    public static Header header;
    public static PageObjects.Amazon.MyAccountMenu myAccountMenu;
    public static PageObjects.Amazon.MyOrdersPage MyOrdersPage;

}
