import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageobjects.BaseTest;
import steps.LogIn;
import steps.SignUp;

public class SignUpTest extends BaseTest {

    SignUp singUp = new SignUp();
    LogIn logIn = new LogIn();

    @Test
    public void signUp() throws Exception{
        singUp.navigateToSignUpForm();
        singUp.enterZipCode();
        singUp.enterMainData();
        singUp.clickHere();
    }


    public void logIn() throws Exception{

        logIn.enterNewEmail();
        logIn.enterNewPassword();
        logIn.clickLogin();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span")).getText().contains("Hello"));
    }

}
