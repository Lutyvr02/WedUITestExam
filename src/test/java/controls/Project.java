package controls;

import org.openqa.selenium.By;

public class Project extends Control {
    private String name;

    public String getName() {
        this.name = control.getText();
        return name;
    }

    public Project(By locator) {
        super(locator);
    }


}
