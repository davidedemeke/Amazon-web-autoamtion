package PageObjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MyOrdersPage {

    @FindBy(how = How.CSS, using = "//div[@class='a-box-inner']]")
    public List <WebElement>  my_order_list; //find list of this element
}

