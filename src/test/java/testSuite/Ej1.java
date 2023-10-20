package testSuite;

import session.Session;
import pages.todoist.*;
import org.junit.jupiter.api.*;

import java.util.Random;

public class Ej1 {
    MainPage mainPage = new MainPage();
    SignInSection signInSection = new SignInSection();
    MenuSection menuSection = new MenuSection();
    ProjectsSection projectsSection = new ProjectsSection();

    AddProjectSection addProjectSection = new AddProjectSection();

    static String newAccount;
    static String newPassword;
    static String newUsername;

    static String newProject;
    static Random random = new Random();


    @BeforeAll
    public static void setup() {
        newAccount = ("lutyvr02@gmail.com");
        newPassword = "Cowboyvr02";
        newUsername = "cowpoke";
        newProject = "WebUi";
    }

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    @AfterEach
    public void close() {
        Session.getInstance().closeSession();
    }

    @Test
    public void createUserProject() throws InterruptedException {
        Thread.sleep(2000);
        mainPage.signInButton.click();
        signInSection.emailInput.setText(newAccount);
        signInSection.passInput.setText(newPassword);
        signInSection.createButton.click();
        menuSection.projects.click();
        projectsSection.addProject.click();
        addProjectSection.nameProject.setText("primeracosas");
        addProjectSection.addButton.click();
        Assertions.assertTrue(projectsSection.getProject("primeracosas"), "No se creo el proyecto");
    }

}