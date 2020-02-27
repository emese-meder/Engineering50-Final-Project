import com.sparta.eng50.pageModels.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickestPathStepdefs {

    FactoryPatternObject factoryPatternObject = new FactoryPatternObject();
    WebDriver webDriver = factoryPatternObject.getWebDriver("chrome");

    HomePage homePage = new HomePage(webDriver);
    CartPage cartPage = new CartPage(webDriver);
    SignInPage signInPage = new SignInPage(webDriver);
    AccountCreationPage accountCreationPage = new AccountCreationPage(webDriver);
    AddressSelectorPage addressSelectorPage = new AddressSelectorPage(webDriver);
    ShippingPage shippingPage = new ShippingPage(webDriver);
    PaymentPage paymentPage = new PaymentPage(webDriver);
    PaymentConfirmationPage paymentConfirmationPage = new PaymentConfirmationPage(webDriver);
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(webDriver);

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.navigateToHomePage();
    }

    @When("I hover over a popular item and click add to basket")
    public void iHoverOverAPopularItemAndClickAddToBasket() {
        homePage.addItemToCart();
    }

    @Then("I should be notified that the item has been added to my cart")
    public void iShouldBeNotifiedThatTheItemHasBeenAddedToMyCart() {
        assertEquals("Product successfully added to your shopping cart", homePage.getCartNotification());
        webDriver.quit();
    }

    @When("I click proceed to checkout")
    public void iClickProceedToCheckout() {
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        homePage.clickProceedToCheckout();
    }

    @Then("I should go to the checkout with the item in the cart")
    public void iShouldGoToTheCheckoutWithTheItemInTheCart() {
        assertEquals("Faded Short Sleeve T-shirts", cartPage.getProductText());
        webDriver.quit();
    }

    @When("I click on the proceed to checkout button")
    public void iClickOnTheProceedToCheckoutButton() {
        cartPage.clickProceedToCheckout();
    }

    @Then("I am transported to the checkout sign in page")
    public void iAmTransportedToTheCheckoutSignInPage() {
        assertEquals(signInPage.getBreadcrumbText(),"Authentication");
        webDriver.quit();
    }

    @When("I enter an email address and click create an account")
    public void iEnterAnEmailAddressAndClickCreateAnAccount() {
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        signInPage.enterEmailAddress(EmailRandomiser.getRandomEmailAddress());
    }

    @When("I enter in valid details for account creation")
    public void iEnterInValidDetailsForAccountCreation() {
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        accountCreationPage.enterSignUpForm();
    }

    @Then("I should have an account made")
    public void iShouldHaveAnAccountMade() {
        assertEquals("http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=0", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("I click on the proceed to checkout button on the address page")
    public void iClickOnTheProceedToCheckoutButtonOnTheAddressPage() {
        addressSelectorPage.clickProceedToCheckout();
    }

    @Then("I should be on the shipping page")
    public void iShouldBeOnTheShippingPage() {
        assertEquals("http://automationpractice.com/index.php?controller=order", webDriver.getCurrentUrl());
        webDriver.quit();
    }


    @When("I agree to the terms and conditions")
    public void iAgreeToTheTermsAndConditions() {
        /*try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        shippingPage.clickOnTermsAndConditions();
    }

    @And("I then click the proceed to checkout button on the shipping page")
    public void iThenClickTheProceedToCheckoutButtonOnTheShippingPage() {
        shippingPage.proceedButton();
    }

    @Then("I should be on the payment page")
    public void iShouldBeOnThePaymentPage() {
        assertEquals("http://automationpractice.com/index.php?controller=order&multi-shipping=", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("I choose to pay by bank wire")
    public void iChooseToPayByBankWire() {
        paymentPage.clickPayByBankWire();
    }

    @Then("I should be on the payment confirmation page")
    public void iShouldBeOnThePaymentConfirmationPage() {
        assertEquals("http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment", webDriver.getCurrentUrl());
        webDriver.quit();
    }

    @When("I click I confirm my order")
    public void iClickIConfirmMyOrder() {
        paymentConfirmationPage.clickOnConfirmButton();
    }

    @Then("I will be able to view the order details page")
    public void iWillBeAbleToViewTheOrderDetailsPage() {
        assertEquals("Order confirmation", orderConfirmationPage.getBreadcrumbText());
        webDriver.quit();
    }
}
