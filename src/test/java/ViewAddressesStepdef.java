
import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.MyAccountPage;
import com.sparta.eng50.pageModels.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ViewAddressesStepdef {

    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    private HomePage homePage = new HomePage(webDriver);
    private MyAccountPage myAccountPage = new MyAccountPage(webDriver);
    private SignInPage signInPage = new SignInPage(webDriver);

    @Given("I am on the home page \\(ViewAddressesStepdef).")
    public void iAmOnTheHomePageViewAddressesStepdef() {
        homePage.navigateToHomePage();
    }

    @And("I am logged in \\(ViewAddressesStepdef).")
    public void iAmLoggedInViewAddressesStepdef() throws InterruptedException {
        homePage.navigateToHeaderSignInPage();
        signInPage.enterSignInFields();
    }

    @When("I click on the ‘My addresses’ button.")
    public void iClickOnTheMyAddressesButton() {
        myAccountPage.navigateToAddressFooterPage();
    }

    @Then("I will be directed to the ‘My addresses’ page.")
    public void iWillBeDirectedToTheMyAddressesPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=addresses", webDriver.getCurrentUrl());
        webDriver.quit();
    }


}