package SanityTests;

import Extensions.UiActions;
import Extensions.Verification;
import PageObjects.Amazon.MyAccountMenu;
import Utilities.commonOperations;
import WorkFlows.webFlows;
import org.testng.annotations.Test;


public class Tests extends commonOperations {

    @Test(description ="Login to my account ")
    public void test_01()  {
        webFlows.login("davidemeke@gmail.com", "Td7519505");
        Verification.testInElement(homePage.txt_Amazon_logo, "לראש הדף"); //compare test on page
    }


    @Test
    public void test_02() {
        UiActions.mouseOver(TopMenuPage.my_account_btn,);

    }

}

