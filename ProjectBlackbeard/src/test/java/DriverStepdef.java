import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.WomenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class DriverStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();

    HomePage homePage;
    WomenPage womenPage;
    WebDriver webDriver;

    @Given("I am using a {string}")
    public void iAmUsingABrowser(String driver) {

        webDriver = factoryPatternObject.getWebDriver(driver);
        homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
    }

    @When("I click on the WOMEN button on nav bar")
    public void iClickOnTheWOMENButtonOnNavBar() {
        womenPage = homePage.navigateToWomenPage(); // Initialise the required pages to use their methods
    }

    @Then("I will be on the Women page")
    public void iWillBeOnTheWomenPageWithBrowser() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category", webDriver.getCurrentUrl());
        homePage.quit();
    }




}
