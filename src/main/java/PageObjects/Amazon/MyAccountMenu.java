package PageObjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountMenu {
    @FindBy(how = How.XPATH, using = "//a[@id='nav_prefetch_yourorders']")
    public WebElement my_orders_btn;
}
