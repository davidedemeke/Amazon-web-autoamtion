package WorkFlows;

import Extensions.UiActions;
import Utilities.commonOperations;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;

public class webFlows extends commonOperations {
    @Step("Login Amazon  flow")
    public static void login(String user, String pass) {
        UiActions.click(amazonLogin.go_To_Login_Page_Btn);
        UiActions.updateText(amazonLogin.txt_userName, user);
        UiActions.click(amazonLogin.continue_to_Password_Btn);
        UiActions.updateText(amazonLogin.txt_password, pass);
        UiActions.click(amazonLogin.login_To_Account_btn);
    }



    public static void my_account_page() {
        UiActions.click(homePage.my_account_btn);
    }

//        @Step ("Create a new user")
//    @description ("Workflow to click on button and update text tnd click to create user")
//    public static void createUser(String name, String email, String user, String Password) {
//    UiActions.click(); navigate to create user page
//        UiActions.updateText(name);
//        UiActions.updateText(email);
//        UiActions.updateText(user);
//        UiActions.updateText(Password);
//        UiActions.click(); // click on create user button

//    @Step ("delete user")
//    @description ("Workflow to click deleteUser button")
//    public static void deleteUser() {
//    UiActions.click(); navigate to create user page
//    UiActions.click(); navigate to create user page


}














//
// try {
//         Thread.sleep(500);
//         } catch (InterruptedException e) {
//         e.printStackTrace();
//         }