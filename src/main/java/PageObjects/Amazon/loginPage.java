package PageObjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
    public WebElement go_To_Login_Page_Btn;

    @FindBy(how = How.ID, using = "ap_email")
    public WebElement txt_userName;


    @FindBy(how = How.ID, using = "continue")
    public WebElement continue_to_Password_Btn;


    @FindBy(how = How.ID, using = "ap_password")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "signInSubmit")
    public WebElement login_To_Account_btn;


   // @FindBy(how = How.CSS, using = "span[class='css-1mhnkuh']")
    //public WebElement btn_skip;


}
