package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class DesplegableSection {
    public Button configButton = new Button(By.xpath("//div/span[@class=\"user_menu_label\"]"));
    public Button closeSession = new Button(By.xpath("//span[text()='Log out']"));
}
