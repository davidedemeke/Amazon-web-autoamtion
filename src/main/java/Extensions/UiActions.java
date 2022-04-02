package Extensions;

import Utilities.commonOperations;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UiActions extends commonOperations {
    @Step("Click element ")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));//wait until element is Clickable
        elem.click();
    }
    @Step("insert Text inside the field")
    public static void updateText(WebElement elem , String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));//wait until element is visible
        elem.sendKeys(value);
    }

    @Step("update updateDropDown field")
    public static void updateDropDown(WebElement elem , String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));//wait until element is visible
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }
    @Step("mouseover to element")
    public static void mouseOver(WebElement elem1, WebElement elem2){
        actions.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

}


