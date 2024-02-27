package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import readers.PropertyReader;

public class DriverFactory {

    public static WebDriver createChrome() {
        ChromeOptions options = new ChromeOptions();
        PropertyReader pr = PropertyReader.read();
        for (String str : pr.getProperty("chrome.options").split(",")) {
            options.addArguments(str.trim());
        }
        return new ChromeDriver(options);
    }


}
