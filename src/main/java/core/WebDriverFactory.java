package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        String os = System.getProperty("os.name").toLowerCase();

    }

    private void configureDriver() {
        //TODO: Create functionality to behave differently, depending on browser
        // if os == windows, browser = chrome
        // set chrome driver property for chromedriver.exe

        String os = System.getProperty("os.name").toLowerCase();

        if (os.indexOf("win") >= 0 & browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers.windows/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (os.indexOf("win") >= 0 & browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers.windows/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (os.indexOf("mac") >= 0 & browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/macos/chromedriver");
            driver = new ChromeDriver();

        } else if (os.indexOf("mac") >= 0 & browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/macos/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

}
