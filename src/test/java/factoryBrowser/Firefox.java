package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecho.driver","src/test/resources/firefox/geckodriver.exe");
        WebDriver driverty = new FirefoxDriver();
        return driverty;
    }
}
