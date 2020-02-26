package com.sparta.eng50.pageModels;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import javax.swing.text.TabExpander;

public abstract class AbstractPage {
    protected WebDriver webDriver;

    By queryBox = By.name("search_query");
    By navWomenButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By navDressesButton = By.linkText("Dresses");
    By navTShirtsButton = By.linkText("T-shirts");
    By contactUsButton = By.xpath("//*[@id=\"contact-link\"]/a");
    By signInButton = By.linkText("Sign in");
    By signOutButton = By.className("logout");
    By cartButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    By contactUsFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[5]/a");
    By addressFooterButton = By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[3]/a");
    By termsAndConditonsButton = By.linkText("Terms and conditions of use");
    By newProductPageFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a");
    By ourStoresPageFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a");


    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public CartPage navigateToCart() {
        webDriver.findElement(cartButton).click();
        return (new CartPage(webDriver));
    }

    public OurStoresPage navigateToOurStoresPage() {
        webDriver.findElement(ourStoresPageFooterButton).click();
        return (new OurStoresPage(webDriver));
    }

    public NewProductsPage navigateToNewProductsFooterPage() {
        webDriver.findElement(newProductPageFooterButton).click();
        return (new NewProductsPage(webDriver));
    }

    public TermsAndConditionsPage navigateToTermsAndConditionsPage() {
        webDriver.findElement(termsAndConditonsButton).click();
        return (new TermsAndConditionsPage(webDriver));
    }

    public SearchResultsPage enterQueryAndSearch(String input) {
        webDriver.findElement(queryBox).sendKeys(input, Keys.ENTER);
        return (new SearchResultsPage(webDriver));
    }

    public WomenPage navigateToWomenPage() {
        webDriver.findElement(navWomenButton).click();
        return (new WomenPage(webDriver));
    }

    public DressesPage navigateToDressesPage() {
        webDriver.findElement(navDressesButton).click();
        return (new DressesPage(webDriver));
    }

    public AddressPage navigateToAddressFooterPage() {
        webDriver.findElement(addressFooterButton).click();
        return (new AddressPage(webDriver));
    }

    public TShirtsPage navigateToTShirtsPage() throws InterruptedException {
        webDriver.findElement(navTShirtsButton).click();
        return (new TShirtsPage(webDriver));
    }

    public ContactUsPage navigateToHeaderContactUsPage() {
        webDriver.findElement(contactUsButton).click();
        return (new ContactUsPage(webDriver));
    }

    public ContactUsPage navigateToFooterContactUsPage() {
        webDriver.findElement(contactUsFooterButton).click();
        return (new ContactUsPage(webDriver));
    }

    public SignInPage navigateToHeaderSignInPage() {
        webDriver.findElement(signInButton).click();
        return (new SignInPage(webDriver));
    }

    public AbstractPage signOut() {
        webDriver.findElement(signOutButton).click();
        return this;
    }

    public void quit() {
        webDriver.quit();
    }

    public void goBackAPage() {
        webDriver.navigate().back();
    }

    public void refreshPage() {
        webDriver.navigate().refresh();
    }
}