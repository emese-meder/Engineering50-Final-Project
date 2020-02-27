import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartDropDownStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");

    HomePage homePage = new HomePage(webDriver);
    By cartValue = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a");

    @Given("I am on the home page and have a item in the cart")
    public void iAmOnTheHomePageAndHaveAItemInTheCart() throws InterruptedException {
        homePage.navigateToHomePage();
        homePage.addItemToCart();
        Thread.sleep(3000);
        homePage.refreshPage();
    }

    @When("I hover on the cart button")
    public void iHoverOnTheCartButton() throws InterruptedException {
        Thread.sleep(2000);
        homePage.hoverOverCartDropDown();
    }

    @Then("I should see the item I selected")
    public void iShouldSeeTheItemISelected() {
        Assertions.assertEquals("Printed...", webDriver.findElement(cartValue).getText());
    }
}
