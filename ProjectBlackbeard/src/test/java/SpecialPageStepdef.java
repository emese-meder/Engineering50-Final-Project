import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SpecialPageStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from

    @Given("I am on the homepage.")
    public void iAmOnTheHomepage() {
        homePage.navigateToHomePage();
    }

    @When("I click on the specials link.")
    public void iClickOnTheSpecialsLink() {
        homePage.navigateToSpecial();
    }

    @Then("I will be navigated to the specials page.")
    public void iWillBeNavigatedToTheSpecialsPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=prices-drop", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
