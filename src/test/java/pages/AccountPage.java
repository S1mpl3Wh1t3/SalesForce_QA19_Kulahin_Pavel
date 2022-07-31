package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AccountPage extends BasePage {

    private final static By ACCOUNT_LOCATOR = By.cssSelector(".slds-var-p-right_x-small");
    private final static By NEW_BUTTON = By.cssSelector("div[title='New']");
    private final static By ACCOUNT_INPUT = By.xpath("//label/span[text() = 'Account Name']/../following-sibling::div/div/div/div/input");
    private final static By SAVE_BUTTON = By.cssSelector("button[title='Save']");

    public AccountPage(WebDriver driver) {
        super(driver);

    }

    public void waitNewAccountPopUpLoaded() {
        waitForElementDisplayed(ACCOUNT_INPUT);
    }


    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void clickSaveButton(){
        driver.findElement(SAVE_BUTTON).click();
    }

    @Override
    public void waitForPageLoaded() {

    }

    public void setAccountName(String accountName) {
        driver.findElement(ACCOUNT_INPUT).sendKeys(accountName);

    }

}
