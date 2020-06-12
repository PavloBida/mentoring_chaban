package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//img[@alt='Интернет магазин Rozetka.ua - №1']")
    private WebElement logo;

    @FindBy(xpath = "")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='header-topline']//a[@href='https://rozetka.com.ua/contacts/']")
    private WebElement contactsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void enterTextInSearchField(String text) {
        searchInput.sendKeys("text");
    }

    public ContactsPage clickContactsButton() {
        contactsButton.click();
        return PageFactory.initElements(driver, ContactsPage.class);
    }
}
