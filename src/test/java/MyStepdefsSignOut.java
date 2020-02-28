import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.SignInPage;
import com.sparta.eng50.pageModels.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefsSignOut {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    SignInPage signInPage = new SignInPage(webDriver);

    @Given("I am on the home page and logged in.")
    public void iAmOnTheHomePage() throws InterruptedException {


        signInPage.enterSignInFields();
        homePage.navigateToHomePage();
    }


    @Given("I am on the home page\\(SignOutStepDef).")
    public void iAmOnTheHomePageSignOutStepDef() {
        homePage.navigateToHomePage();
    }

    @And("click sign in.")
    public void clickSignIn() {
        homePage.navigateToHeaderSignInPage();

    }

    @And("Enter correct email-address.")
    public void enterCorrectEmailAddress() {
        signInPage.enterEmailAddress();
    }

    @And("Enter correct pass.")
    public void enterCorrectPass() {
        signInPage.enterPassword();
    }

    @And("Click sign-in button.")
    public void clickSignInButton() {
        signInPage.clickSignInButtonOnSignInPage();
    }

    @When("I click on sign-out.")
    public void iClickOnSignOut() {
        homePage.signOut();
    }

    @Then("I will be signed out of my account.")
    public void iWillBeSignedOutOfMyAccount() {
        Assertions.assertEquals(webDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")), webDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
        webDriver.quit();

    }
}
