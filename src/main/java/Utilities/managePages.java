package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base{

    public static void init(){
        grafanaLogin = PageFactory.initElements(driver,PageObjects.Grafana.loginPage.class);

    }



}
