import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InformationSidebarStepdefs {
    private FactoryPatternObject webDriverFactory = new FactoryPatternObject();
    private WebDriver webDriver = webDriverFactory.getWebDriver("chrome");
    private SearchResultsPage searchResultsPage = new SearchResultsPage(webDriver);

    @Given("i am on the search results page")
    public void iAmOnTheSearchResultsPage() {
        searchResultsPage.navigateToSearchResultsPageWithoutSearch();
    }
    @When("i click the Delivery link")
    public void iClickTheDeliveryLink() {
        searchResultsPage.navigateToDeliveryInformation();
    }
    @Then("i should be taken to the delivery page")
    public void iShouldBeTakenToTheDeliveryPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=1&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("i click the Legal Notice link")
    public void iClickTheLegalNoticeLink() {
        searchResultsPage.navigateToLegalNoticePage();
    }
    @Then("i should be taken to the legal notice page")
    public void iShouldBeTakenToTheLegalNoticePage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=2&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("i click the Terms and conditions of use link")
    public void iClickTheTermsAndConditionsOfUseLink() {
        searchResultsPage.navigateToTermsAndConditions();
    }
    @Then("i should be taken to the terms and conditions page")
    public void iShouldBeTakenToTheTermsAndConditionsPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=3&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("i click the About us link")
    public void iClickTheAboutUsLink() {
        searchResultsPage.navigateToAboutUsPage();
    }
    @Then("i should be taken to the About us page")
    public void iShouldBeTakenToTheAboutUsPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=4&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("i click the Secure payment link")
    public void iClickTheSecurePaymentLink() {
        searchResultsPage.navigateToSecurePaymentPage();
    }
    @Then("i should be taken to the Secure payment page")
    public void iShouldBeTakenToTheSecurePaymentPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_cms=5&controller=cms", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("i click the Our stores link")
    public void iClickTheOurStoresLink() {
        searchResultsPage.navigateToOurStoresPage();
    }
    @Then("i should be taken to the Our stores page")
    public void iShouldBeTakenToTheOurStoresPage() {
        Assertions.assertEquals("http://automationpractice.com/index.php?controller=stores", webDriver.getCurrentUrl());
        webDriver.quit();
    }
}