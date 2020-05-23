package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    // пользуемся конструктором BasePage
    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUp;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement login;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private WebElement searchBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span")
    private WebElement HelloYourName;

    public void clickSigUpLink() {
        signUp.click();
    }

    public void clickLoginBtn() {
        login.click();
    }

    public void clickShoppingCartLink() {
        shoppingCart.click();
    }

    public void clickEmailBtn() {
        searchField.click();
    }

    public void clickSearchBtn() { searchBtn.click(); }

    public void sendKeySearchField(String a) { searchField.sendKeys(a); }

    public void sendKeyEmail(String a) { email.sendKeys(a); }

    public void sendKeyPassword(String a) { password.sendKeys(a); }

    }



