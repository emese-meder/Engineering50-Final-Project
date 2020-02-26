package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AbstractPage {

    By addToCartButton = By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[1]");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");

    WebDriverWait wait = new WebDriverWait(webDriver, 120);


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage navigateToHomePage() {
        webDriver.get("http://automationpractice.com/index.php");
        return this;
    }


    public void addItemToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        webDriver.findElement(addToCartButton).click();
    }

    public void proceedToCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutButton));
        webDriver.findElement(proceedToCheckoutButton).click();
    }


    public SignInPage navigateToSignInPage() {
        navigateToHomePage();
        webDriver.findElement(signInButton).click();
        return new SignInPage(webDriver);
    }


}
