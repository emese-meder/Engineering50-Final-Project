import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SignInAccountViewMyStepDefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    SignInPage signInPage;
    @Given("I am on the home page.")
    public void iAmOnTheHomePage() {
        homePage.navigateToHomePage();

    }

    @When("I click on the sign in button and enter correct details.")
    public void iClickOnTheSignInButtonAndEnterCorrectDetails() throws InterruptedException {
        signInPage = homePage.navigateToHeaderSignInPage();
        signInPage.enterSignInFields();
    }

    @Then("I should be signed in to the website.")
    public void iShouldBeSignedInToTheWebsite() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=my-account", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
