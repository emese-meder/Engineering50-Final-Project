import com.sparta.eng50.pageModels.FactoryPatternObject;
import com.sparta.eng50.pageModels.HomePage;
import com.sparta.eng50.pageModels.PaymentDetailsPage;
import com.sparta.eng50.pageModels.PaymentPageCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PaymentMethodDetailsStepdef {
    FactoryPatternObject factoryPatternObject = new FactoryPatternObject(); //Create the FactoryPatternObject
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome"); //The WebDriver should equal the returned driver from the FactoryPatternObject

    HomePage homePage = new HomePage(webDriver); // HomePage must be instantiated at the beginning as its where you start from

    PaymentPageCart paymentPageCart;
    PaymentDetailsPage paymentDetailsPage;

    @Given("I am on the Payment Page")
    public void iAmOnThePaymentPage() throws InterruptedException {
        paymentPageCart = homePage.navigateToHomePage().navigateToFirstItem().navigateToAddToCart().navigateToCheckoutPopup().navigateToProceedToCheckoutButton().signIn().navigateToProceedToCheckout().acceptTermsConditions().navigateToProceedToCheckout();
    }

    @When("I click on Payment {string}")
    public void iClickOnPaymentPaymentType(String paymentType) throws InterruptedException {
        switch (paymentType) {
            case "bankwire":
                paymentDetailsPage = paymentPageCart.navigateToPayByBankWire();
                break;
            case "cheque":
                paymentDetailsPage = paymentPageCart.navigateToPayByCheque();
                break;
        }
    }

    @Then("I will go to the Detail page about {string}")
    public void iWillGoToTheDetailPageAboutPaymentType(String paymentType) {
        /*Assertions.assertEquals("http://automationpractice.com/index.php?fc=module&module="+ paymentType +"&controller=payment", webDriver.getCurrentUrl());*/
    }
}
