package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//img[@alt='Интернет-супермаркет ROZETKA']")
    private WebElement logo;

    @FindBy(xpath = "//input[@placeholder='Я ищу...']")

    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//li[@class='header-topline__links-item']//a[@href='https://rozetka.com.ua/contacts/']")
    private WebElement contactsButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void enterTextInSearchField(String text) {
        searchInput.sendKeys(text);
    }

    public SearchPage clickSearchButton() {

        searchButton.click();
        return PageFactory.initElements(driver, SearchPage.class);
    }

    public ContactsPage clickContactsButton() {
        contactsButton.click();
        return PageFactory.initElements(driver, ContactsPage.class);
    }
}
