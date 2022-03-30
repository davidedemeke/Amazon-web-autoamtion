package Extensions;

import Utilities.commonOperations;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UiActions extends commonOperations {
    @Description("Click element ")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));//wait until element is Clickable
        elem.click();
    }

    @Description("insert Text inside the field")
    public static void updateText(WebElement elem , String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));//wait until element is visible
        elem.sendKeys(value);
    }

    @Description("update Drop Down")
    public static void updateDropDown(WebElement elem , String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));//wait until element is visible
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }
    @Description("mouseover")
    public static void mouseOver(WebElement elem1, WebElement elem2){
        actions.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

}


