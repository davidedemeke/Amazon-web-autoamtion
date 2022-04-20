package WorkFlows;

import Extensions.UiActions;
import Extensions.Verification;
import PageObjects.Amazon.login;
import Utilities.commonOperations;
import io.qameta.allure.Description;

public class ui_webFlow extends commonOperations {

    @Description("description :headerTextsTest after login")
    public static void textsOnUHeader() {
        Verification.CompareTextInElement(header.AllBtnText, "הכול");
        Verification.CompareTextInElement(header.SendToFirstNameText, "שלח אל Tibebu");
        Verification.CompareTextInElement(header.AddressText, "Rishon Le... 75");
        Verification.CompareTextInElement(header.HelloFirstNameText, "שלום, David");
        Verification.CompareTextInElement(header.ListAndAccountText, "חשבון ורשימות");
        Verification.CompareTextInElement(header.BackOfText, "החזרות");
        Verification.CompareTextInElement(header.OrdersText, "והזמנות");
        Verification.CompareTextInElement(header.CartText, "עגלה");
        System.out.println("Good work ");
    }


    public static void textsOnUsernamePage() {
        UiActions.click(loginPage.go_To_Login_Page_Btn);
        Verification.CompareTextInElement(loginPage.InputUsernamePageTitleText, "כניסה");
        Verification.CompareTextInElement(loginPage.InputUsernamePageSubTitleText, "דוא\"ל או מספר טלפון נייד");
        Verification.CompareTextInElement(loginPage.InputUsernamePageContinueBtnText, "המשך");
        Verification.CompareTextInElement(loginPage.BelowContinueBtnText, "אם תמשיך, אתה מסכים בכך לתנאי השימוש ולהודעת הפרטיות של Amazon.");
        Verification.CompareTextInElement(loginPage.NeedHelpBtnText, "זקוק לעזרה?");
        Verification.CompareTextInElement(loginPage.NeWInAmazonBtnText, "הנך חדש ב Amazon?");
        Verification.CompareTextInElement(loginPage.createAccountBtnText, "צור את חשבון Amazon שלך");
    }

    public static void textsOnPasswordPage() {
        UiActions.click(loginPage.go_To_Login_Page_Btn);
        UiActions.updateText(loginPage.txt_userName, "davidemeke@gmail.com");
        UiActions.click(loginPage.continue_to_Password_Btn);
        Verification.CompareTextInElement(loginPage.InputPswPageTitleText, "כניסה");
        Verification.CompareTextInElement(loginPage.InputPswPageUserMailAdd, "davidemeke@gmail.com");
        Verification.CompareTextInElement(loginPage.InputPswPageChangeMailBtnText, "שינוי");
        Verification.CompareTextInElement(loginPage.InputPswPageForgotPswText, "שכחת את הסיסמה שלך?");
        Verification.CompareTextInElement(loginPage.InputPswPageLoginTitleText, "סיסמה");
        Verification.CompareTextInElement(loginPage.InputPswPageSubmitBtnText, "כניסה");
        Verification.CompareTextInElement(loginPage.InputPswPageRememberMeText, "השאירו אותי מחובר.");
        Verification.CompareTextInElement(loginPage.InputPswPageForDetailsBtnText, "השאירו אותי מחובר.");
        Verification.CompareTextInElement(loginPage.InputPswPageForDetailsBtnText, "פרטים");
    }
}