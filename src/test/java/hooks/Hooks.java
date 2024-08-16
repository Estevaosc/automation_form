package hooks;

import io.cucumber.java.AfterAll;
import utils.WebDriverManager;

public class Hooks {

    @AfterAll
    public static void tearDown() {
        WebDriverManager.quitDriver();
    }
}
