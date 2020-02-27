import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuantityOfItemsStepdef {
    private FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    private WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");

    private HomePage homePage = new HomePage(webDriver);
    private SignInPage signInPage = new SignInPage(webDriver);
    private ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage(webDriver);
    private By amount = By.id("summary_products_quantity");
    private By emptyBox = By.xpath("/html/body/div/div[2]/div/div[3]/div/p");


    @Given("I am on the homepage \\(QuantityOfItemsStepDef)")
    public void iAmOnTheHomepageQuantityOfItemsStepDef() {
        homePage.navigateToHomePage();
    }

    @And("there is a product in the cart\\(QuantityOfItemsStepDef)")
    public void thereIsAProductInTheCart() {
        homePage.navigateToHeaderSignInPage();
        signInPage.login();
        signInPage.navigateToHomePageThroughLogo();
        homePage.addItemToCart();
    }

    @And("I am on the shopping cart summary\\(QuantityOfItemsStepDef)")
    public void iAmOnTheShoppingCartSummaryQuantityOfItemsStepDef() {
        homePage.proceedToCheckout();
    }

    @When("I click on the add quantity button")
    public void iClickOnTheAddQuantityButton() throws InterruptedException {
        shoppingCartSummaryPage.increaseQuantity();
        Thread.sleep(10000);
    }

    @Then("the product quantity will increase")
    public void theProductQuantityWillIncrease() throws InterruptedException {
        Assertions.assertEquals("2 Products", webDriver.findElement(amount).getText());
        webDriver.quit();
    }

    @When("I click on the decrease quantity button")
    public void iClickOnTheDecreaseQuantityButton() throws InterruptedException {
        shoppingCartSummaryPage.decreaseQuality();
        Thread.sleep(10000);
    }

    @Then("the product quantity will decrease")
    public void theProductQuantityWillDecrease() {
        Assertions.assertEquals("Your shopping cart is empty.", webDriver.findElement(emptyBox).getText());
        webDriver.quit();
    }



}
