package login;

import core.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageobject.HomePage;
import pageobject.ItemPage;
import pageobject.SearchPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static final String BASE_URL = "https://rozetka.com.ua/";
    protected WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    @Parameters("browser")
    public void setup(String browser) {
        driver = new WebDriverFactory(browser).getWebdriver();
        driver.get(BASE_URL);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
