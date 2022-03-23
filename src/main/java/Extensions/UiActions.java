package Extensions;

import Utilities.commonOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UiActions extends commonOptions {

    public static void click(WebElement elem)
    {
        elem.click();
    }


    public static void updateText(WebElement elem , String value)
    {
        elem.sendKeys(value);
    }

    public static void updateDropDown(WebElement elem , String value)
    {
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }
}
