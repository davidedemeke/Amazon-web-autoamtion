package SanityTests;

import Extensions.UiActions;
import Extensions.Verification;
import Utilities.commonOperations;
import WorkFlows.ui_webFlow;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class Sanity_Tests extends commonOperations {

    @Test(description ="Login to my account ")
    @Description("Test Description : Login to Amazon account")
    public void test_01()  {
        webFlows.login();
        Verification.CompareTextInElement(homePage.txt_Amazon_logo, "לראש הדף"); //compare test on page
    }


    @Test (description= "go t0 my orders page and find orders")
    @Description("Test Description : mouse over to my orders page")
    public void test_02(){
        UiActions.mouseOver(header.my_account_btn, myAccountMenu.my_orders_btn);
//        Verification.numberOfElement(MyOrdersPage.my_order_list,10 );  How manny list exist on the page
    }

    @Test(description = "go to mmy account page")  // TODO: 16/04/2022  
    @Description( "Test Description : go to mmy account page")
    public void test_03(){
        webFlows.my_account_page();
    }




    }


