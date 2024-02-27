package stepdefs;

import drivers.Driver;
import io.cucumber.java.After;

public class Hooks {


    @After
    public void quitDriver() {
        if (Driver.getDriver() != null) {
            Driver.quitDriver();
        }
    }
}
