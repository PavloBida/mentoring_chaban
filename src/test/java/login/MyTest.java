package login;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobject.ItemPage;
import pageobject.SearchPage;


public class MyTest extends BaseTest {

    @Test
    public void test123() {

        //TODO: Create test
        //Open category
        //Click on some product
        //Assert price is correct


        homePage.enterTextInSearchField("samsung galaxy s10");
        Reporter.log("Text is entered into search field.", true);

        SearchPage searchPage = homePage.clickSearchButton();
        Reporter.log("Search button is clicked. Search Result page is opened.", true);

        ItemPage itemPage = searchPage.clickFirstTile();
        Reporter.log("Item's tile is clicked.", true);

        System.out.println(itemPage.getProductPriceValue());
        Assert.assertEquals(itemPage.getProductPriceValue(), "19 999₴", "Price had changed!");
        Reporter.log("Price is compared.", true);
    }

}