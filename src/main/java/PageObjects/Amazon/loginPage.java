package PageObjects.Amazon;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    @FindBy(how = How.CSS, using = "a[class='nav-a nav-a-2   nav-progressive-attribute']")
    public WebElement go_To_Login_Page_Btn;

    @FindBy(how = How.ID, using = "ap_email")
    public WebElement txt_userName;


    @FindBy(how = How.ID, using = "continue")
    public WebElement continue_to_Password_Btn;


    @FindBy(how = How.ID, using = "ap_password")
    public WebElement txt_password;

    @FindBy(how = How.CLASS_NAME, using = "a-button-input")
    public WebElement login_To_Account_btn;


}
