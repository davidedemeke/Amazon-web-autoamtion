package Extensions;

import Utilities.commonOperations;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UiActions extends commonOperations {
    @Description("Click element ")
    public static void click(WebElement elem)
    {
        elem.click();
    }

    @Description("insert Text inside the field")
    public static void updateText(WebElement elem , String value)
    {
        elem.sendKeys(value);
    }

    @Description("update Drop Down")
    public static void updateDropDown(WebElement elem , String value)
    {
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }
}


