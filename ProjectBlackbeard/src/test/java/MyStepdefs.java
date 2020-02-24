import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.WomenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver webDriver = new ChromeDriver();
    HomePage homePage = new HomePage(webDriver);
    WomenPage womenPage = new WomenPage(webDriver);

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        homePage.navigateToHomePage();
    }

    @When("I click on women")
    public void iClickOnWomen() {
        homePage.navigateToWomenPage();
    }

    @Then("I will be on the women page")
    public void iWillBeOnTheWomenPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category", webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.quit();
    }
}
