package WorkFlows;

import Extensions.UiActions;
import Extensions.Verification;
import Utilities.commonOperations;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class webFlows extends commonOperations {
    @Step("Login Amazon  flow")
    @Description ("description :login to my amazon account")
    public static void login() {
        UiActions.click(loginPage.go_To_Login_Page_Btn);
        UiActions.updateText(loginPage.txt_userName, "davidemeke@gmail.com");
        UiActions.click(loginPage.continue_to_Password_Btn);
        UiActions.updateText(loginPage.txt_password, "Td7519505");
        UiActions.click(loginPage.login_To_Account_btn);
    }



    public static void my_account_page() {
        UiActions.click(homePage.my_account_btn);
    }



    public static void textsInUsernamePage(){
        UiActions.click(loginPage.go_To_Login_Page_Btn);
        Verification.textInElement(loginPage.InputUsernamePageTitleText,"כניסה" );
        Verification.textInElement(loginPage.InputUsernamePageSubTitleText,"דוא\"ל או מספר טלפון נייד" );
        Verification.textInElement(loginPage.InputUsernamePageContinueBtnText,"המשך" );
        Verification.textInElement(loginPage.BelowContinueBtnText, "אם תמשיך, אתה מסכים בכך לתנאי השימוש ולהודעת הפרטיות של Amazon.");
        Verification.textInElement(loginPage.NeedHelpBtnText,"זקוק לעזרה?");
        Verification.textInElement(loginPage.NeWInAmazonBtnText,"הנך חדש ב Amazon?");
        Verification.textInElement(loginPage.createAccountBtnText,"צור את חשבון Amazon שלך" );


}
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

















//
// try {
//         Thread.sleep(500);
//         } catch (InterruptedException e) {
//         e.printStackTrace();
//         }