package steps;

import pageobjects.BasePage;
import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SignUpPage;

public class SignUp extends BaseTest {

    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm() {
        mainPage.clickSigUpLink();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("378512");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstNameField("Mari");
        signUpPage.sendKeysLastNameField("Bin");
        signUpPage.sendKeysEmailField("maribin@au.com");
        signUpPage.sendKeysPasswordField("1123581321");
        signUpPage.sendKeysConfirmPasswordField("1123581321");
        signUpPage.clickRegisterBtn();
        signUpPage.getText();
        signUpPage.getTextT();

    }

    public String checkThatConfirmationMessageAppears() {
        return signUpPage.getTextConfirmationMessage();
    }


    public void clickHere() {
        signUpPage.clickHereLink();
    }
}
