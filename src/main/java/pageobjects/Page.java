package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/i")
    protected WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    protected WebElement registerButton;

    public void navigateRegister() {
        myAccountButton.click();
        registerButton.click();

    }
}