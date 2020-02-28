import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ContactUsButtonStepdef {
    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    private HomePage homePage = new HomePage(webDriver);


    @Given("I am on the homepage \\(ContactUsStepDef).")
    public void iAmOnTheHomepageContactUsStepDef() {
        homePage.navigateToHomePage();
    }

    @When("I click on the contact us link.")
    public void iClickOnTheContactUsLink() {
        homePage.navigateToFooterContactUsPage();
    }

    @Then("I will be navigated to the customer services page.")
    public void iWillBeNavigatedToTheCustomerServicesPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=contact", webDriver.getCurrentUrl());
        webDriver.quit();
    }


}
