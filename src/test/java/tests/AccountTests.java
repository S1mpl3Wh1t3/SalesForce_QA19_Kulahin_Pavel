package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTests extends BaseTest {

    @Test
    public void newAccountTest() {
        String ACCOUNT_NAME = "Bob Smith";
        By bobSmith = By.xpath("//lightning-formatted-text[text() = 'Bob Smith']");
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsPage();
        accountPage.clickNewButton();
        accountPage.waitNewAccountPopUpLoaded();
        accountPage.setAccountName(ACCOUNT_NAME);
        accountPage.clickSaveButton();
        Assert.assertTrue(accountPage.isElementPresent(bobSmith));


    }

}
