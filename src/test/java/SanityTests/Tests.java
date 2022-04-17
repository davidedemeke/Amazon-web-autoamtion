package SanityTests;

import Extensions.UiActions;
import Extensions.Verification;
import PageObjects.Amazon.MyAccountMenu;
import PageObjects.Amazon.MyOrdersPage;
import PageObjects.Amazon.TopMenuPage;
import Utilities.commonOperations;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class Tests extends commonOperations {

    @Test(description ="Login to my account ")
    @Description("Test Description : Login to Amazon account")
    public void test_01()  {
        webFlows.login();
        Verification.textInElement(homePage.txt_Amazon_logo, "לראש הדף"); //compare test on page
    }


    @Test (description= "go t0 my orders page and find orders")
    @Description("Test Description : mouse over to my orders page")
    public void test_02(){
        UiActions.mouseOver(TopMenuPage.my_account_btn, myAccountMenu.my_orders_btn);
//        Verification.numberOfElement(MyOrdersPage.my_order_list,10 );  How manny list exist on the page
    }
    @Test(description = "go to mmy account page")  // TODO: 16/04/2022  
    @Description( "Test Description : go to mmy account page")
    public void test_03(){
        webFlows.my_account_page();
    }
       @Test(description = "test for texts inside userName page ")
        @Description( "Test Description : go to mmy account page") public void test_04(){
        webFlows.textsInUsernamePage();
    }
}

