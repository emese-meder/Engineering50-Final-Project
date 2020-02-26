import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.SignInPage;
import com.sparta.eng50.pageModels.WomenPage;
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
    SignInPage signInPage;

    @Given("I am on the home page and logged in.")
    public void iAmOnTheHomePage() throws InterruptedException {
        homePage.navigateToHomePage();
        signInPage = homePage.navigateToHeaderSignInPage();
        signInPage.enterSignInFields();
        homePage.navigateToHomePage();
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
