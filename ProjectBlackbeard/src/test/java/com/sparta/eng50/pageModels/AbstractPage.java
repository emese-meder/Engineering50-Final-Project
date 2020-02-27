package com.sparta.eng50.pageModels;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.text.TabExpander;

public abstract class AbstractPage {
    protected WebDriver webDriver;


    protected WebDriverWait wait;

    protected WebDriverWait webDriverWait;


   // By queryBox = By.name("search_query");
    By queryBox = By.xpath("//*[@id=\"search_query_top\"]");

    private By navWomenButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    private By navDressesButton = By.linkText("Dresses");
    private By navTShirtsButton = By.linkText("T-shirts");
    private By contactUsButton = By.xpath("//*[@id=\"contact-link\"]/a");
    private By signInButton = By.linkText("Sign in");
    private By signOutButton = By.className("logout");
    private By cartButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    private By specialPageButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a");
    private By homePageLogoButton = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private By contactUsFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[5]/a");
    private By addressFooterButton = By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[3]/a");
    private By termsAndConditonsButton = By.linkText("Terms and conditions of use");
    private By newProductPageFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a");
    private By ourStoresPageFooterButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a");

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;

        this.wait = new WebDriverWait(webDriver, 20);
    }

    public void navigateToHomePageThroughLogo() {
        webDriver.findElement(homePageLogoButton).click();
    }

    public void hoverOverCartDropDown() {
        Actions actions = new Actions(webDriver);
        WebElement target = webDriver.findElement(cartButton);
        actions.moveToElement(target).perform();


        this.wait = new WebDriverWait(webDriver,20);

        this.webDriverWait = new WebDriverWait(webDriver, 20);
    }

    public CartPage navigateToCart() {
        webDriver.findElement(cartButton).click();
        return (new CartPage(webDriver));
    }

    public SpecialPage navigateToSpecial() {
        webDriver.findElement(specialPageButton).click();
        return (new SpecialPage(webDriver));
    }

    public OurStoresPage navigateToOurStoresPage() {
        webDriver.findElement(ourStoresPageFooterButton).click();
        return (new OurStoresPage(webDriver));
    }

    public NewProductsPage navigateToNewProductsFooterPage() {
        webDriver.findElement(newProductPageFooterButton).click();
        return (new NewProductsPage(webDriver));
    }

    public void navigateToTermsAndConditionsPage() {
        webDriver.findElement(termsAndConditonsButton).click();
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