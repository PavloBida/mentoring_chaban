package login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.ContactsPage;

public class ContactsTest extends BaseTest {

    @Test
    public void test123() {

        ContactsPage contactsPage = homePage.clickContactsButton();

        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");
    }

}
