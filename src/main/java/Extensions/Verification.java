package Extensions;

import Utilities.commonOperations;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class Verification extends commonOperations {
    public static void  testInElement(WebElement elem, String expectedValue){
       assertEquals(elem.getText(), expectedValue);
    }
}
