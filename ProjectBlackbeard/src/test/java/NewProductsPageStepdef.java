import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class NewProductsPageStepdef {

    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    private HomePage homePage = new HomePage(webDriver);

    @Given("I am on the homepage \\(NewProductsOnOfferStepdef).")
    public void iAmOnTheHomepageNewProductsOnOfferStepdef() {
        homePage.navigateToHomePage();
    }

    @When("I click on the new products link.")
    public void iClickOnTheNewProductsLink() {
        homePage.navigateToNewProductsFooterPage();
    }

    @Then("I will be navigated to the new products page.")
    public void iWillBeNavigatedToTheNewProductsPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=new-products", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
