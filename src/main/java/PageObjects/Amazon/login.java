package PageObjects.Amazon;

import Utilities.commonOperations;
import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {
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

    //Enter Username page
    @Description("Texts inside Input username page  ")
    @FindBy(how = How.XPATH, using = "//div[@class='a-box-inner a-padding-extra-large'] /h1")
    public WebElement InputUsernamePageTitleText;


    @FindBy(how = How.XPATH, using = "//label[@class='a-form-label']")
    public WebElement InputUsernamePageSubTitleText;


    @FindBy(how = How.XPATH, using = "//span[@class='a-button-text']")
    public WebElement InputUsernamePageContinueBtnText;

    @FindBy(how = How.XPATH, using = "//div[@class='a-row a-spacing-top-medium a-size-small']")
    public WebElement BelowContinueBtnText;

    @FindBy(how = How.XPATH, using = "//span[@class='a-expander-prompt']")
    public WebElement NeedHelpBtnText;

    @FindBy(how = How.XPATH, using = "//div[@class='a-divider a-divider-break']/h5")
    public WebElement NeWInAmazonBtnText;

    @FindBy(how = How.XPATH, using = "//a[@id='createAccountSubmit']")
    public WebElement createAccountBtnText;



//
//
//
//    @FindBy(how = How.XPATH, using = "//div[@class='a-box-inner a-padding-extra-large'] /h1]")
//    public WebElement usernamePageMainText;



    @FindBy(how = How.XPATH, using = "//div[@class='a-box-inner a-padding-extra-large'] /h1]")
    public WebElement usernamePageMainText;


    }


