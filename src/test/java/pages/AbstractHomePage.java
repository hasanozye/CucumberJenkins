package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AbstractHomePage extends BaseTest {

    public AbstractHomePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchField;
    @FindBy(xpath = "//span[@class='input-group-btn']")
    private WebElement clickSearchBtn;

    @FindBy(xpath = "//div[@class='product-thumb']//h4/a")
    protected List<WebElement> productsAfterSearch;

    public void searchText(String text) {
        sendKeys(searchField, text);
        click(clickSearchBtn);
    }

    public void getLastProductAfterSearch() {
        String lastProductName = productsAfterSearch.get(productsAfterSearch.size() - 1).getText();
        System.setProperty("lastProductName", lastProductName);
    }

}
