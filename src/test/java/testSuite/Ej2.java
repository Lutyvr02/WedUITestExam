package testSuite;

import session.Session;
import pages.todoly.*;
import org.junit.jupiter.api.*;

public class Ej2 {
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    SettingsSection settingsSection = new SettingsSection();

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void changePassword() throws InterruptedException {

        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("lutyvr02@gmail.com");
        loginSection.pwdTextBox.setText("hola1234");
        loginSection.loginButton.click();
        menuSection.settingsButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(settingsSection.confirmationButton.isControlDisplayed(), "ERROR la settings no abrio");

        settingsSection.oldPass.clearSetText("hola1234");
        Thread.sleep(2000);
        settingsSection.newPass.clearSetText("Cowboyvr02");
        Thread.sleep(2000);
        settingsSection.confirmationButton.click();
        //Closing session and quit of the menu section
        menuSection.logoutButton.click();
        Thread.sleep(2000);

        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("lutyvr02@gmail.com");
        loginSection.pwdTextBox.setText("hola1234");
        loginSection.loginButton.click();
    }
}
