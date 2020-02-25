import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountCreationStepdefs {

    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");

    HomePage homePage = new HomePage(webDriver);
    SignInPage signInPage = new SignInPage(webDriver);
    AccountCreationPage accountCreationPage = new AccountCreationPage(webDriver);
    MyAccountPage myAccountPage = new MyAccountPage(webDriver);

    @And("I navigate to the sign in page")
    public void iNavigateToTheSignInPage() {
        signInPage = homePage.navigateToSignInPage();
    }

    @When("I enter an email address and click create an account")
    public void iEnterAnEmailAddressAndClickCreateAnAccount() {
        signInPage.enterEmailAddress("ababababababababaa@b.com");
    }

    @And("I enter in valid details for account creation")
    public void iEnterInValidDetailsForAccountCreation() {
        myAccountPage = accountCreationPage.enterSignUpForm();
    }

    @Then("I should have an account made")
    public void iShouldHaveAnAccountMade() {
        assertEquals("http://automationpractice.com/index.php?controller=my-account", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
