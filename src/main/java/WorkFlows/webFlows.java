package WorkFlows;

import Extensions.UiActions;
import Utilities.commonOperations;
import org.testng.annotations.AfterClass;

public class webFlows extends commonOperations {

    public static void login(String user, String pass) {
        UiActions.click(amazonLogin.go_To_Login_Page_Btn);
        UiActions.updateText(amazonLogin.txt_userName, user);
        UiActions.click(amazonLogin.continue_to_Password_Btn);
        UiActions.updateText(amazonLogin.txt_password, pass);
        UiActions.click(amazonLogin.login_To_Account_btn);
    }


}

//
// try {
//         Thread.sleep(500);
//         } catch (InterruptedException e) {
//         e.printStackTrace();
//         }