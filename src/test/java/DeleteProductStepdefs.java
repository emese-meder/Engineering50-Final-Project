import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.ShoppingCartSummaryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeleteProductStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage(webDriver);

    @Given("a product is in the cart")
    public void aProductIsInTheCart() {
        homePage.navigateToHomePage();
        homePage.addItemToCart();
    }

    @And("I am on the cart page")
    public void iAmOnTheCartPage() {
        homePage.proceedToCheckout();
    }

    @When("I click on the delete button")
    public void iClickOnTheDeleteButton() {
        shoppingCartSummaryPage.deleteProduct();
    }

    @Then("the product is removed from the cart")
    public void theProductIsRemovedFromTheCart() {
        assertFalse(shoppingCartSummaryPage.isProductInCart());
    }
}
