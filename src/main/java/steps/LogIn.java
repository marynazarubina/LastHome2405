package steps;

import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SignUpPage;


public class LogIn extends BaseTest {

    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());



    public void enterNewEmail() {
        signUpPage.sendKeysNewEmailField();
    }

    public void enterNewPassword() {
        signUpPage.sendKeysNewPasswordField();
    }

    public void clickLogin() {
        mainPage.clickLoginBtn();
    }

}
