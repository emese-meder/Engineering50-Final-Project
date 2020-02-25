package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver webDriver;

    By queryBox = By.name("search_query");
    By navWomenButton = By.linkText("Women");
    By navDressesButton = By.linkText("Dresses");
    By navTShirtsButton = By.linkText("T-shirts");
    By contactUsButton = By.xpath("//*[@id=\"contact-link\"]/a");
    By signInButton = By.linkText("Sign in");
    By cartButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public CartPage navigateToCart() {
        webDriver.findElement(cartButton).click();
        return (new CartPage(webDriver));
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

    public TShirtsPage navigateToTShirtsPage() {
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