package SanityTests;

import Utilities.commonOptions;
import WorkFlows.webFlows;
import org.testng.annotations.Test;


public class grafanaWeb extends commonOptions {
    @Test
    public void test_01_login()  {
        webFlows.login("admin","admin");
    }


}
