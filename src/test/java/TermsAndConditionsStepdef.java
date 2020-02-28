import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class TermsAndConditionsStepdef {

    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject
    private HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from

    @Given("I am on the homepage \\(TermsAndConditionsStepdef).")
    public void iAmOnTheHomepageTermsAndConditionsStepdef() {
        homePage.navigateToHomePage();
    }

    @When("I click on the terms and conditions of use link.")
    public void iClickOnTheTermsAndConditionsOfUseLink() {
        homePage.navigateToTermsAndConditionsPage();
    }

    @Then("I will be navigated to the terms and conditions.")
    public void iWillBeNavigatedToTheTermsAndConditions() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=3&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }


}
