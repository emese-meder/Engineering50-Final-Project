import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAddressStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    SignInPage signInPage = new SignInPage(webDriver);
    ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage(webDriver);
    AddressPage addressPage = new AddressPage(webDriver);
    EditAddressPage editAddressPage = new EditAddressPage(webDriver);

    @Given("I am signed in")
    public void iAmSignedIn() {
        signInPage.navigateToSignIn();
        signInPage.login();
    }

    @And("have an item in the cart")
    public void haveAnItemInTheCart() {
        homePage.navigateToHomePage();
        homePage.addItemToCart();
    }

    @And("on the address page")
    public void onTheAddressPage() {
        homePage.proceedToCheckout();
        shoppingCartSummaryPage.proceedToCheckout();
    }

    @When("I click on the update button")
    public void iClickOnTheUpdateButton() {
        addressPage.clickUpdateAddress();
    }

    @Then("I will be able to update my address")
    public void iWillBeAbleToUpdateMyAddress() {
        editAddressPage.enterNewAddress();
        editAddressPage.saveNewAddress();
        assertEquals("125 London Wall", addressPage.getDeliveryAddress1Text());
        webDriver.quit();
    }
}
