package WorkFlows;

import Extensions.UiActions;
import Utilities.commonOptions;

public class webFlows extends commonOptions {

    public static void login(String goToLoginPageBtn, String user , String pass ,String continue_to_Password_Btn, String txt_password) {
        UiActions.updateText(amazonLogin.go_To_Login_Page_Btn, goToLoginPageBtn);
        UiActions.updateText(amazonLogin.txt_userName, user);
        UiActions.updateText(amazonLogin.continue_to_Password_Btn, continue_to_Password_Btn);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
//        }

        UiActions.updateText(amazonLogin.txt_password, txt_password);
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        UiActions.click(amazonLogin.btn_login);
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        UiActions.click(amazonLogin.btn_skip);
    }

    }
}
