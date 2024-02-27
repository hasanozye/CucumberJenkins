package stepdefs;

import drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import pages.OrangeHRMPage;

public class OrangeHRMSteps {

    OrangeHRMPage orangeHRM;
    WebDriver driver;

    public OrangeHRMSteps() {
        driver = Driver.getDriver();
        orangeHRM = new OrangeHRMPage();

    }


    @And("I open a new tab and navigate to {string}")
    public void iOpenANewTabAndNavigateTo(String url) {
        orangeHRM.openNewTabAndSwitch();
        driver.get(url);
    }

    @And("I login into the application")
    public void iLoginIntoTheApplication() {
        orangeHRM.loginWithHappyPath();
    }

    @And("I click on {string} menu")
    public void iClickOnMenu(String menu) {
        orangeHRM.clickLeftMenuItems(menu);
    }

    @And("I enter the saved product name into the username input field")
    public void iEnterTheSavedProductNameIntoTheUsernameInputField() {
        orangeHRM.enterText();
    }

    @Then("I take a screenshot of the screen")
    public void iTakeAScreenshotOfTheScreen() {
        orangeHRM.getScreenShotAsByte();
    }
}
