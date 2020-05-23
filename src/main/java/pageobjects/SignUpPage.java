package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCode;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement continueBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement confirmPassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement register;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement confirmationMessage;

    


    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a")
    private WebElement hereLink;

    String newEmail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();

    String newPassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")).getText();



    public void sendKeysNewEmail (){
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")).sendKeys(newEmail);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }

    public void sendKeysZipCodeField(String a){
        zipCode.sendKeys(a);
    }

    public void sendKeysFirstNameField(String a){
        firstName.sendKeys(a);
    }

    public void sendKeysLastNameField(String a){
        lastName.sendKeys(a);
    }

    public void sendKeysEmailField(String a){
        email.sendKeys(a);
    }

    public void sendKeysPasswordField(String a){
        password.sendKeys(a);
    }

    public void sendKeysConfirmPasswordField(String a){
        confirmPassword.sendKeys(a);
    }

    public void clickRegisterBtn(){
        register.click();
    }

    public void clickHereLink(){
        hereLink.click();
    }

    public String getTextConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public void sendKeysNewEmailField (){
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")).sendKeys(newEmail);
    }

    public void sendKeysNewPasswordField () {
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")).clear();
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")).sendKeys(newPassword);
    }

}
