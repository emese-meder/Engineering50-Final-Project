import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.WomenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    WomenPage womenPage; //Create the pages you will be navigating to, to use its methods

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        homePage.navigateToHomePage();
    }

    @When("I click on the WOMEN button on the navigation bar")
    public void iClickOnWomen() {
        womenPage = homePage.navigateToWomenPage(); // Initialise the required pages to use their methods
    }

    @Then("I will be on the Women page")
    public void iWillBeOnTheWomenPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
