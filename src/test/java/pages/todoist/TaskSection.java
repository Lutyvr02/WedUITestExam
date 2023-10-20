package pages.todoist;

import controls.Task;
import org.openqa.selenium.By;

public class TaskSection {
    public Task task;

    public boolean taskExists(String name){
        task = new Task(By.xpath(String.format("//div[text()='%s']", name)));
        return task.isControlDisplayed();
    }
}
