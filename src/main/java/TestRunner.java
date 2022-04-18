import managers.WebDriverManager;
import pageobjects.Home;
import pageobjects.Register;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo.opencart.com/");

        Home home = new Home(webDriverManager.getDriver());
        home.navigateRegister();

        Register register = new Register(webDriverManager.getDriver());
        register.registrForm("Vahnovan", "Marin", "vinovanmarin@mail.ru", "060123456", "bond777561", "bond777561");

        Thread.sleep(10000);
        webDriverManager.getDriver().close();
        webDriverManager.getDriver().quit();

    }
}