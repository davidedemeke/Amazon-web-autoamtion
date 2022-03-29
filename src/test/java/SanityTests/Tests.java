package SanityTests;

import Utilities.commonOperations;
import WorkFlows.webFlows;
import org.testng.annotations.Test;


public class Tests extends commonOperations {

    @Test(description ="Login to my account ")
    public void test_01_login()  {
        webFlows.login("davidemeke@gmail.com", "Td7519505");
    }

}

