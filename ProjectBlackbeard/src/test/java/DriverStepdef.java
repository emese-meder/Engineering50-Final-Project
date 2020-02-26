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
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    HomePage homePage = new HomePage(webDriver);
    WomenPage womenPage;



    @Given("I am using a {string}")
    public void iAmUsingABrowser(String driver) {


        homePage.navigateToHomePage();
    }

    @When("I click on the WOMEN button on the navigation bar")
    public void iClickOnTheWOMENButtonOnNavBar() {
        womenPage = homePage.navigateToWomenPage(); // Initialise the required pages to use their methods
    }

    @Then("I will be on the Women page")
    public void iWillBeOnTheWomenPageWithBrowser() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category", webDriver.getCurrentUrl());
        webDriver.quit();
    }




}
