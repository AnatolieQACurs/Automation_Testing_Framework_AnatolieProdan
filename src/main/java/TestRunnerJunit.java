import managers.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.Home;
import pageobjects.Register;

public class TestRunnerJunit {
    WebDriverManager webDriverManager = new WebDriverManager("CHROME");

    @BeforeEach
    public void testBeforeEach() {
        webDriverManager.getDriver().get("https://demo.opencart.com/");
    }

    @AfterEach
    public void testAfter() {
        webDriverManager.getDriver().close();
        webDriverManager.getDriver().quit();
    }

    @Test
    @DisplayName("Adresa URL a paginii Register este disponibila din pagina Home")
    public void verifyRegisterAccessible() {

        Home home = new Home(webDriverManager.getDriver());
        home.navigateRegister();

        boolean urlIsValid = webDriverManager.getDriver().getCurrentUrl().contains("register");

        Assertions.assertTrue(urlIsValid, "AdresaUrl nu este valida");

    }

    @Test
    @DisplayName("Register page elements are displayed")
    public void elementsDispayed() {

        Home home = new Home(webDriverManager.getDriver());
        home.navigateRegister();

        Register register = new Register(webDriverManager.getDriver());

        Assertions.assertTrue(register.allTheElemantsAreDisplayed(), "Cel putin una dintre elemente nu a fost afisat");
    }

    @Test
    public void anErrorMessageIsDisplayed() {
        Home home = new Home(webDriverManager.getDriver());
        home.navigateRegister();

        Register register = new Register(webDriverManager.getDriver());
        register.registrForm("Bobov", "Alexandru", "bobov@mail.ru", "78956323",
                "741852963", "741852963");
        register.clickContinuie();

        WebElement errorMessage = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
        String expectedError = "Warning: You must agree to the Privacy Policy!";
        String actalText = errorMessage.getText();

        Assertions.assertEquals(expectedError,actalText, "Error message");
        webDriverManager.getDriver().close();

    }
}