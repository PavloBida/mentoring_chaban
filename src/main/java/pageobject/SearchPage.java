package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage {
    private WebDriver driver;

    WebDriverWait wait;

    @FindBy(xpath = "//a[@title='Мобильный телефон Samsung Galaxy S10 Lite 6/128GB Blue (SM-G770FZBGSEK) ']")
    private WebElement firstTile;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
    }
    public void retryingFindClick() {

        int attempts = 0;
        while(attempts < 2) {
            try {
                firstTile.click();
                break;
            } catch(org.openqa.selenium.StaleElementReferenceException ignored) {
            }
            attempts++;
        }
    }
    public ItemPage clickFirstTile() {
          retryingFindClick();
//        wait.until(ExpectedConditions.elementToBeClickable(firstTile));
//        firstTile.click();

        return PageFactory.initElements(driver, ItemPage.class);
    }

    public WebElement getFirstTile() {
        return firstTile;
    }

}