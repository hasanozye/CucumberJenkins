package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage extends BaseTest {

    public OrangeHRMPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;
    @FindBy(xpath = "//ul[contains(@class,'oxd-main-menu')]//span[contains(.,'Admin')]")
    private WebElement leftMenuAdmin;
    @FindBy(xpath = "//form//input[contains(@class,'oxd-input')]")
    private WebElement sysUsersUsernameField;

    public void enterText() {
        sendKeys(sysUsersUsernameField, System.getProperty("lastProductName"));
    }

    public void openNewTabAndSwitch() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void loginWithHappyPath() {
        sendKeys(usernameField, "Admin");
        sendKeys(passwordField, "admin123");
        click(loginBtn);
    }

    public void clickLeftMenuItems(String text) {
        click(leftMenuAdmin);
    }


}
