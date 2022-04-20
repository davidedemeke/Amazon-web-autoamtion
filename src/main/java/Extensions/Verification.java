package Extensions;

import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verification extends commonOperations {
    @Step("Verify text in element")
    public static void CompareTextInElement(WebElement elem, String expectedValue) {
        assertEquals(elem.getText(), expectedValue);
    }

    @Step("Verify number Of Element")
    public static void numberOfElement(List<WebElement> elems, int expectedValue) {
       wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expectedValue);
    }
}
