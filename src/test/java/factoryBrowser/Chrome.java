package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=es");
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }
}
