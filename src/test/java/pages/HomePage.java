package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.cssSelector(".slds-avatar_profile-image-small");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");
    private final static By ACCOUNTS_TAB_LOCATOR = By.xpath("//*[@title='Accounts']");
    private final static By HOME_LOCATOR = By.cssSelector("span[title='Quarterly Performance']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(HOME_LOCATOR);

    }

    public void waitForUserIconDisplayed() {
        waitForElementDisplayed(USER_ICON_LOCATOR);
    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }

    public void openAccountsPage() {
        jsClick(driver.findElement(ACCOUNTS_TAB_LOCATOR));


    }
}