import managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRunner {
    public static void main(String[] args) {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo.opencart.com/");

//        WebElement registerButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
//        registerButton.click();
//
//        WebElement firstNameInput = webDriverManager.getDriver().findElement(By.id("input-firstname"));
//        firstNameInput.sendKeys("Anatolie");
//
//        WebElement lastNameInput = webDriverManager.getDriver().findElement(By.id("input-lastname"));
//        lastNameInput.sendKeys("Prodan");
//
//        WebElement emalInput = webDriverManager.getDriver().findElement(By.id("input-email"));
//        emalInput.sendKeys("qqautomatioon@gmail.com");
//
//        WebElement telephoneInput = webDriverManager.getDriver().findElement(By.id("input-telephone"));
//        telephoneInput.sendKeys("079999818");
//
//        WebElement passwordInput = webDriverManager.getDriver().findElement(By.name("password"));
//        passwordInput.sendKeys("qazwsxedc1242");
//
//        WebElement confirmPasswordInput = webDriverManager.getDriver().findElement(By.name("confirm"));
//        confirmPasswordInput.sendKeys("qazwsxedc1242");
//
//        WebElement  subscribeRadio = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]"));
//        subscribeRadio.click();
//
//        WebElement checkboxInput = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
//        checkboxInput.click();
//
//        WebElement continueInput = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
//        continueInput.click();
//
//        WebElement continInput = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
//        continInput.click();
//
//        WebElement logoutButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]"));
//        logoutButton.click();
//
//        WebElement continuInput = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
//        continuInput.click();
////      webDriverManager.getDriver().close();

        WebElement myAccountButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i"));
        myAccountButton.click();

        WebElement loginButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        loginButton.click();

        WebElement emalInput = webDriverManager.getDriver().findElement(By.id("input-email"));
        emalInput.sendKeys("qqautomatioon@gmail.com");

        WebElement passwordInput = webDriverManager.getDriver().findElement(By.name("password"));
        passwordInput.sendKeys("qazwsxedc1242");

        WebElement logiInput = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        logiInput.click();
        webDriverManager.getDriver().close();

    }
}
