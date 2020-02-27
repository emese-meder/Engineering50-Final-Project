import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ViewAddressesStepdef {

    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");
    HomePage homePage = new HomePage(webDriver);
    MyAccountPage myAccountPage = new MyAccountPage(webDriver);

    @Given("I am logged in.")
    public void iAmLoggedIn() throws InterruptedException {
        myAccountPage = homePage.navigateToHomePage().navigateToHeaderSignInPage().enterSignInFields();
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