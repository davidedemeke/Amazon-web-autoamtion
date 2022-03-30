package PageObjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.XPATH, using = "//span[@class='navFooterBackToTopText']")
    public WebElement txt_Amazon_logo;

//    @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
//    public WebElement element_number_2;
//
//    @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
//    public WebElement element_number_3;
//
//    @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
//    public WebElement element_number_4;





}
