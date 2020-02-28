import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.SearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SearchBarStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    SearchResultsPage searchResultsPage = new SearchResultsPage(webDriver);


    @Given("I am on the homepage on I want to search")
    public void iAmOnTheHomepageOnIWantToSearch() {
        homePage.navigateToHomePage();
    }

    @When("I enter dress in the search bar")
    public void iEnterDressInTheSearchBar() {
        homePage.enterQueryAndSearch("dress");
    }



    @Then("I will presented with the results")
    public void iWillPresentedWithTheResults() {

        Assertions.assertEquals(searchResultsPage.searchForDress(), searchResultsPage.searchForDress());
        webDriver.quit();
    }

    @When("I enter t-shirt in the search bar")
    public void iEnterTShirtInTheSearchBar() {
        homePage.enterQueryAndSearch("t-shirt");

    }

    @Then("I will presented with the results for t-shirt")
    public void iWillPresentedWithTheResultsForTShirt() {
        Assertions.assertEquals(searchResultsPage.searchForTshirt(),searchResultsPage.searchForTshirt());
        webDriver.quit();
    }
}