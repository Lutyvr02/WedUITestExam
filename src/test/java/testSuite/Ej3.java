package testSuite;

import session.Session;
import pages.todoist.AccountSection;
import pages.todoist.DesplegableSection;
import pages.todoist.LoginSection;
import pages.todoist.MenuSection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ej3 {
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    DesplegableSection desplegableSection = new DesplegableSection();
    AccountSection accountSection = new AccountSection();

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void changeName() throws InterruptedException {
        loginSection.emailInput.setText("lutyvr02@gmail.com");
        loginSection.passwordInput.setText("Cowboyvr02");
        loginSection.confirmationButton.click();

        Thread.sleep(5000);
        menuSection.deplegableProfile.click();
        desplegableSection.configButton.click();
        accountSection.name.clearSetText("Lutyvr02");
        accountSection.buttonUpdate.click();

        Thread.sleep(1000);
        accountSection.buttonClose.click();
        menuSection.deplegableProfile.click();
        desplegableSection.closeSession.click();
        Thread.sleep(2000);
        loginSection.emailInput.setText("lutyvr02@gmail.com");
        loginSection.passwordInput.setText("Cowboyvr02");
        loginSection.confirmationButton.click();

        menuSection.deplegableProfile.click();
        desplegableSection.configButton.click();
    }

}