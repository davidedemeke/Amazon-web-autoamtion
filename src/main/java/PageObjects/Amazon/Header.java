package PageObjects.Amazon;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header {
        @FindBy(how = How.XPATH, using = "//span[@class='nav-line-2 ']")
        public WebElement my_account_btn;

        @Description("text of  button 'all' - > at the right side of search box field")
        @FindBy(how = How.ID, using = "nav-search-label-id")
        public WebElement AllBtnText;

        @Description("text of  SendToFirstNameText")
        @FindBy(how = How.ID, using = "glow-ingress-line1")
        public WebElement SendToFirstNameText;

        @Description("text of  AddressText")
        @FindBy(how = How.ID, using = "glow-ingress-line2")
        public WebElement AddressText;

        @Description("text of HelloFirstNameText")
        @FindBy(how = How.ID, using = "nav-link-accountList-nav-line-1")
        public WebElement HelloFirstNameText;

        @Description("text of ListAndAccountText")
        @FindBy(how = How.XPATH, using = "//span[@class='nav-line-2 ']")
        public WebElement ListAndAccountText;


        @Description("text of BackOfText - back item to seller text")
        @FindBy(how = How.XPATH, using = "//span[@class='nav-line-1' and text()= 'החזרות']")
        public WebElement BackOfText;


        @Description("text of OrdersText ")
        @FindBy(how = How.XPATH, using = "//span[@class='nav-line-2' and text()= 'והזמנות']")
        public WebElement OrdersText;


        @Description("text of CartText")
        @FindBy(how = How.XPATH, using = " (//span[@class='nav-line-2'] )[last()]")
        public WebElement CartText;






}
