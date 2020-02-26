import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class WomensDropDownMenuStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    HomePage homePage = new HomePage(webDriver);

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        homePage.navigateToHomePage();
    }

    @When("I hover on the Women button")
    public void iHoverOnTheWomenButton() {
        homePage.hoverOverWomensButton();
    }

    @Then("I should be able to click on a link to visit the t-shirt page")
    public void iShouldBeAbleToClickOnALinkToVisitTheTShirtPage() throws InterruptedException {
        homePage.navigateToTShirtsPage();
        Assertions.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category", webDriver.getCurrentUrl());
    }
}
