import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeColourStepdefs {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject
    HomePage homePage = new HomePage(webDriver);
    WomenPage womenPage = new WomenPage(webDriver);

    @Given("I am on the clothes viewing page.")
    public void iAmOnTheClothesViewingPage() {
        homePage.navigateToHomePage();
        womenPage.navigateToWomenPage();
    }


    @When("I select a colour")
    public void iSelectAColour() {
        womenPage.colourChange("color_20");
    }

    @Then("The colour of the product has been changed")
    public void theColourOfTheProductHasBeenChanged() {
        Assertions.assertEquals("http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue",
                "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue");
    }


}
