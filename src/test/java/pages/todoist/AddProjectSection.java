package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class AddProjectSection {
    public TextBox nameProject = new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//button[@type='submit']"));
}
