import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuantityOfItemsStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");

    HomePage homePage = new HomePage(webDriver);
    SignInPage signInPage = new SignInPage(webDriver);
    MyAccountPage myAccountPage;
    ShoppingCartSummaryPage shoppingCartSummaryPage;
    By amount = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1/span/span");
    By emptyBox = By.xpath("/html/body/div/div[2]/div/div[3]/div/p");

    @Given("there is a product in the cart")
    public void thereIsAProductInTheCart() {
        homePage.navigateToHomePage();
        homePage = homePage.navigateToHeaderSignInPage().login().navigateToHomePageThroughLogo();
        homePage.addItemToCart();

    }

    @And("I am on the shopping cart summary")
    public void iAmOnTheShoppingCartSummary() {
        shoppingCartSummaryPage = homePage.proceedToCheckout();
    }

    @When("I click on the add quantity button")
    public void iClickOnTheAddQuantityButton() throws InterruptedException {
        shoppingCartSummaryPage.increaseQuantity();
        Thread.sleep(1000);
    }

    @Then("the product quantity will increase")
    public void theProductQuantityWillIncrease() throws InterruptedException {
        Assertions.assertEquals("2 Products", webDriver.findElement(amount).getText());
    }

    @When("I click on the decrease quantity button")
    public void iClickOnTheDecreaseQuantityButton() throws InterruptedException {
        shoppingCartSummaryPage.decreaseQuality();
        Thread.sleep(3000);
    }

    @Then("the product quantity will decrease")
    public void theProductQuantityWillDecrease() {
        Assertions.assertEquals("Your shopping cart is empty.", webDriver.findElement(emptyBox).getText());
    }
}
