import managers.WebDriverManager;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo-opencart.com/");

        HomePage home = new HomePage(webDriverManager.getDriver());
        home.navigateRegister();

        RegisterPage register = new RegisterPage(webDriverManager.getDriver());
        register.registrForm("Vahnovan", "Marin", "vinovanmariin@mail.ru", "060123456", "bond777561", "bond777561");

        Thread.sleep(10000);
        webDriverManager.getDriver().close();
        webDriverManager.getDriver().quit();

    }
}