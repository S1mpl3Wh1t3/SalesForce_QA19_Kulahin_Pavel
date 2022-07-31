package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LeadsPage;

public class LeadsTests extends BaseTest {
    private LeadsPage leadsPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
    }

    @Test
    public void createLeadTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        Thread.sleep(5000);
    }
}