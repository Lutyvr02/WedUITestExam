package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailInput = new TextBox(By.id("element-0"));
    public TextBox passwordInput =  new TextBox(By.id("\"//span[text()=\\\"Name\\\"]/../../..//input\""));
    public Button confirmationButton =  new Button(By.xpath("//button[@data-gtm-id=\"start-email-login\"]"));

    public Button loginButton = new Button(By.xpath("//a[@href=\"/auth/login\"]"));
}
