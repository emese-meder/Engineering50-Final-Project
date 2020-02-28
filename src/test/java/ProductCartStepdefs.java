import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCartStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from
    TShirtsPage tShirtsPage;
    ItemPage itemPage;
    WomenPage womenPage;

    String productName;

    @Given("I am on the products page")
    public void iAmOnTheProductsPage() throws InterruptedException {
        homePage.navigateToHomePage();
        tShirtsPage = homePage.navigateToTShirtsPage();
    }

    @And("have added a product to my cart")
    public void haveAddedAProductToMyCart() throws InterruptedException {
        itemPage = tShirtsPage.navigateToItemPage();//
        productName = itemPage.getProductTitle();
        itemPage.navigateToAddToCart();
        itemPage.closeItemWindow();
    }

    @When("I navigate to the womens page")
    public void iNavigateToTheWomensPage() {
        womenPage = itemPage.navigateToWomenPage();
    }

    @Then("the cart will still have my product")
    public void theCartWillStillHaveMyProduct() {
        assertEquals(productName, womenPage.getProductTitleInCart());
    }
}
