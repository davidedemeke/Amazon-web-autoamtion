package WorkFlows;

import Extensions.UiActions;
import Utilities.commonOptions;

public class webFlows extends commonOptions {

    public static void login(String user , String pass) {
        UiActions.updateText(grafanaLogin.txt_userName, user);
        UiActions.updateText(grafanaLogin.txt_password, pass);
        UiActions.click(grafanaLogin.btn_login);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UiActions.click(grafanaLogin.btn_skip);
    }


}
