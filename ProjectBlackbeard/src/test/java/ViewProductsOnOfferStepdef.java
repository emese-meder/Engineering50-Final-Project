import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ViewProductsOnOfferStepdef {

    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    HomePage homePage = new HomePage(webDriver);

    @When("I click on the new products link.")
    public void iClickOnTheNewProductsLink() {
        homePage.navigateToHomePage().navigateToNewProductsFooterPage();
    }

    @Then("I will be navigated to the new products page.")
    public void iWillBeNavigatedToTheNewProductsPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=new-products", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
