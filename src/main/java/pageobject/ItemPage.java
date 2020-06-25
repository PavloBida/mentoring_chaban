package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ItemPage {
    private WebDriver driver;

    @FindBy(xpath = "//p[@class='product-prices__big product-prices__big_color_red']")
    private WebElement productPrice;

    public ItemPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getProductPrice() {

        return productPrice;
    }

    public String getProductPriceValue() {

        return productPrice.getText();
    }

}
