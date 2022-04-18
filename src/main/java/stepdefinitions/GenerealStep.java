package stepdefinitions;
import contextManagers.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class GenerealStep {

    private TestContext testContext;

    public GenerealStep(TestContext context){
        testContext = context;
    }

    @Given("^\"([^\"]*)\" is accessed$")
    public void isAccessed(String adresaUrl){
        testContext.getWebDriverManager().getDriver().get(adresaUrl);
    }

}
