package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button signInButton = new Button(By.xpath("//a[@href=\"/auth/signup?success_page=%2Fapp%2F\"]"));
}
