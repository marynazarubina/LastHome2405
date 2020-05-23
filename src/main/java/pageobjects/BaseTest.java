package pageobjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    // перед таем как будут запускаться наши тесты
    @BeforeClass
    public static void setUP() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
    }

    // то, что дедается, когда тест закончен
    @AfterClass
    public static void tearDown() throws Exception{
        driver.quit();
    }

    // это метод, который будет возвращать наш проинициализированный драйвер
    public static WebDriver getDriver(){
        return driver;
    }

}
