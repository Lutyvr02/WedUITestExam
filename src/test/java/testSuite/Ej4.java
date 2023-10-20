package testSuite;

import session.Session;
import pages.todoly.MainPage;
import pages.todoly.MenuSection;
import pages.todoly.SettingsSection;
import pages.todoly.SignInSection;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;

import java.util.Random;

public class Ej4 {
    MainPage mainPage = new MainPage();
    SignInSection signInSection = new SignInSection();
    MenuSection menuSection = new MenuSection();

    SettingsSection settingsSection = new SettingsSection();

    static String newAccount;
    static String newPassword;
    static String newUsername;

    static String newProject;
    static Random random = new Random();


    @BeforeAll
    public static void setup() {
        newAccount = "lutyvr02@vrvrvr.com";
        newPassword = "cowpoke1";
        newUsername = "Luty";
        newProject = "fin";
    }

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void createUserProject() throws InterruptedException {
        mainPage.signInButton.click();
        signInSection.fullNameInput.setText(newUsername);
        signInSection.emailInput.setText(newAccount);
        signInSection.passwordInput.setText(newPassword);
        signInSection.check.click();
        signInSection.signin.click();
        menuSection.settingsButton.click();
        settingsSection.accountButton.click();
        settingsSection.deleteButton.click();
        Thread.sleep(2000);
        Alert alert = Session.getInstance().getBrowser().switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        Assertions.assertTrue(mainPage.signInButton.isControlDisplayed(),
                "ERROR");
    }
}
