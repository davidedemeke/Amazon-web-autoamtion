package SanityTests;

import Utilities.commonOperations;
import WorkFlows.ui_webFlow;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Ui_Tests extends commonOperations {
    @Test(description = "headerTextsTest after login")
    @Description("description :headerTextsTest after login")
    public void test_ui_01() {
        webFlows.login();
        ui_webFlow.textsOnUHeader();
    }

    @Test(description = "test for texts inside userName page ")
    @Description("Test Description : go to mmy account page")
    public void test_ui_02() {
        ui_webFlow.textsOnUsernamePage();
    }

    @Test(description = "test for texts inside password page ") // TODO: 20/04/2022  
    @Description("Test Description : test for texts inside password page")
    public void test_ui_03() {
        ui_webFlow.textsOnPasswordPage();
    }
}


