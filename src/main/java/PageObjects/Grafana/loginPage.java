package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    @FindBy(how = How.NAME, using = "user")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[aria-label='Login button']")
    public WebElement btn_login;


    @FindBy(how = How.CSS, using = "span[class='css-1mhnkuh']")
    public WebElement btn_skip;


}
