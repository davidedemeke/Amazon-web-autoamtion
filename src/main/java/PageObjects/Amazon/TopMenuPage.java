package PageObjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopMenuPage  {
        @FindBy(how = How.XPATH, using = "//span[@class='nav-line-2 ']")
        public WebElement my_account_btn;
}
