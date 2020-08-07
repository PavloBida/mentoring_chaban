package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobject.ContactsPage;

public class ContactsTest extends BaseTest {

    @Test
    public void test123() {

        ContactsPage contactsPage = homePage.clickContactsButton();
        Reporter.log("Contacts lik is clicked.", true);
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");
        Reporter.log("Logo presence is checked.", true);
    }

}
