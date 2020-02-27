package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    protected WebDriver webDriver;

    protected WebDriverWait wait;
    By queryBox = By.name("search_query");
    By navWomenButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By navDressesButton = By.linkText("Dresses");
    By navTShirtsButton = By.linkText("T-shirts");
    By contactUsButton = By.xpath("//*[@id=\"contact-link\"]/a");
    By signInButton = By.linkText("Sign in");
    By signOutButton = By.className("logout");
    By cartButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    By specialPageButton = By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a");
    By homePageLogoButton = By.xpath("//*[@id=\"header_logo\"]/a/img");
    By cartDropDownMenu = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a");

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, 20);
    }

    public HomePage navigateToHomePageThroughLogo() {
        webDriver.findElement(homePageLogoButton).click();
        return (new HomePage(webDriver));
    }

    public AbstractPage hoverOverCartDropDown() {
        Actions actions = new Actions(webDriver);
        WebElement target = webDriver.findElement(cartButton);
        actions.moveToElement(target).perform();
        return this;
    }

    public CartPage navigateToCart() {
        webDriver.findElement(cartButton).click();
        return (new CartPage(webDriver));
    }

    public SpecialPage navigateToSpecial() {
        webDriver.findElement(specialPageButton).click();
        return (new SpecialPage(webDriver));
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

    public TShirtsPage navigateToTShirtsPage() throws InterruptedException {
        webDriver.findElement(navTShirtsButton).click();
        return (new TShirtsPage(webDriver));
    }

    public ContactUsPage navigateToHeaderContactUsPage() {
        webDriver.findElement(contactUsButton).click();
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