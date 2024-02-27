package stepdefs;

import drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AbstractHomePage;

public class HomePageAbstractSteps {

    AbstractHomePage homePage;
    WebDriver driver;

    public HomePageAbstractSteps() {
        driver = Driver.getDriver();
        homePage = new AbstractHomePage();
    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        driver.get(url);
    }

    @When("I search for {string}")
    public void iSearchFor(String text) {
        homePage.searchText(text);
    }

    @And("I save the name of the last product in the search results")
    public void iSaveTheNameOfTheLastProductInTheSearchResults() {
        homePage.getLastProductAfterSearch();

    }
}
