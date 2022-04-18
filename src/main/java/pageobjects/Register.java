package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Page {

    public Register(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement eMailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]")
    private WebElement subscibe;

    @FindBy(xpath = "///*[@id=\"content\"]/form/div/div/input[1]")
    private WebElement checkboxButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private WebElement buttonContinue;

    public void registrForm(String firstName, String lastName, String eMail, String telephone, String password, String confirm) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        eMailInput.sendKeys(eMail);
        telephoneInput.sendKeys(telephone);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(confirm);
        buttonContinue.click();

    }

    public boolean allTheElemantsAreDisplayed() {
        return firstNameInput.isDisplayed() && lastNameInput.isDisplayed() && eMailInput.isDisplayed() && telephoneInput.isDisplayed() &&
                passwordInput.isDisplayed() && passwordConfirmInput.isDisplayed() && buttonContinue.isDisplayed();

    }
    public void clickContinuie(){
        continueButton.click();
    }
}

