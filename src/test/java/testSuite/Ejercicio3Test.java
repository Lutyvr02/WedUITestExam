package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Date;


public class Ejercicio3Test extends TestBase {


    @Test
    public void fullNameTesting() throws InterruptedException {


        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("selenium@seleniumupb.com");
        loginSection.pwdTextBox.setText("12345");
        loginSection.loginButton.click();
        String newName = new Date().getTime()+"SCRUM";

        menuSection.settingButton.click();
        profileDialog.fullNameTextBox.clearSetText(newName);
        profileDialog.okButton.click();
        menuSection.settingButton.click();
        String actualResult=profileDialog.fullNameTextBox.getTextProperty("value");
        Assertions.assertEquals(newName,actualResult,"ERROR no se actualizo el fullName");

   }


}
