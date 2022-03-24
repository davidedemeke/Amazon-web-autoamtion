package SanityTests;

import Utilities.commonOptions;
import WorkFlows.webFlows;
import org.testng.annotations.Test;


public class AmazonWeb extends commonOptions {
    @Test
    public void test_01_login()  {
        webFlows.login("", "davidemeke@gmail.com",
                "Td7519505","dsds","sdsds");
//        webFlows.login("davidemeke@gmail.com","Td7519505");
    }


}
