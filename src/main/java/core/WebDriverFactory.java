package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private String os;
    private String browser;
    private WebDriver driver;

    public WebDriverFactory(String browser) {
        this.browser = browser;
        setOS();
        configureDriver();
    }

    public WebDriver getWebdriver() {
        return driver;
    }

    private void setOS() {
        //TODO: Create functionality to find out OS
        os = "windows";
    }

    private void configureDriver() {
        //TODO: Create functionality to behave differently, depending on browser
        // if os == windows, browser = chrome
        // set chrome driver property for chromedriver.exe
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
