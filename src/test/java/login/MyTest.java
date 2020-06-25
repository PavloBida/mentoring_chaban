package login;


import org.testng.Assert;
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

        SearchPage searchPage = homePage.clickSearchButton();

        ItemPage itemPage = searchPage.clickFirstTile();

        System.out.println(itemPage.getProductPriceValue());
        Assert.assertEquals(itemPage.getProductPriceValue(), "14 999₴", "Price had changed!");
    }

}