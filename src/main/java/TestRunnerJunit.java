import managers.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class TestRunnerJunit {
    WebDriverManager webDriverManager = new WebDriverManager("CHROME");

    @BeforeEach
    public void testBeforeEach() {
        webDriverManager.getDriver().get("https://demo-opencart.com/");
    }

    @AfterEach
    public void testAfter() {
        webDriverManager.getDriver().close();
        webDriverManager.getDriver().quit();
    }

    @Test
    @DisplayName("Adresa URL a paginii Register este disponibila din pagina Home")
    public void verifyRegisterAccessible() throws InterruptedException {

        HomePage home = new HomePage(webDriverManager.getDriver());
        home.navigateRegister();

        boolean urlIsValid = webDriverManager.getDriver().getCurrentUrl().contains("register");

        Assertions.assertTrue(urlIsValid, "AdresaUrl nu este valida");

    }

    @Test
    @DisplayName("Register page elements are displayed")
    public void elementsDispayed() {

        HomePage home = new HomePage(webDriverManager.getDriver());
        home.navigateRegister();

        RegisterPage register = new RegisterPage(webDriverManager.getDriver());

        Assertions.assertTrue(register.allTheElemantsAreDisplayed(), "Cel putin una dintre elemente nu a fost afisat");
    }

    @Test
    public void anErrorMessageIsDisplayed() throws InterruptedException {
        HomePage home = new HomePage(webDriverManager.getDriver());
        home.navigateRegister();

        RegisterPage register = new RegisterPage(webDriverManager.getDriver());
        register.registrForm("Bobov", "Alexandru", "bobok677569708975453@mail.ru", "78956323",
                "741852963", "741852963");
        register.clickContinuie();

        WebElement errorMessage = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
        String expectedError = "Warning: You must agree to the Privacy Policy!";
        String actalText = errorMessage.getText();
        Thread.sleep(5000);
        Assertions.assertEquals(expectedError,actalText, "Error message");

    }
}