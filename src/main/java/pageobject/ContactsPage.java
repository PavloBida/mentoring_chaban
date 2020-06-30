package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage {
    //Webdriver instance
    // Constructor
    // @FindBy elements
    // methods to operate with elements
    private WebDriver driver;

    @FindBy(xpath = "//img[@alt='Интернет-супермаркет ROZETKA']")
    private WebElement logo;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

}
