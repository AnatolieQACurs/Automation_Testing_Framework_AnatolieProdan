import managers.WebDriverManager;

public class TestRunner {
    public static void main(String[] args) {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://google.md/");
        webDriverManager.getDriver().close();

        WebDriverManager firefoxDriverManager = new WebDriverManager("CHROME");
        firefoxDriverManager.getDriver().get("https://ltconstantinstamati.netlify.app/");
        firefoxDriverManager.getDriver().close();

//        WebDriverManager firefoxDriverManager = new WebDriverManager("FIREFOX");
//        firefoxDriverManager.getDriver().get("https://google.md/");
//        firefoxDriverManager.getDriver().close();
    }
}
