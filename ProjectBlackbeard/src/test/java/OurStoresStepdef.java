import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OurStoresStepdef {

    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    private HomePage homePage = new HomePage(webDriver);

    @Given("I am on the homepage\\(OurStoresStepdef).")
    public void iAmOnTheHomepageOurStoresStepdef() {
        homePage.navigateToHomePage();
    }

    @When("I click on the our stores link.")
    public void iClickOnTheOurStoresLink() {
        homePage.navigateToHomePage().navigateToOurStoresPage();
    }

    @Then("I will be navigated to the our stores page.")
    public void iWillBeNavigatedToTheOurStoresPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=stores", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
