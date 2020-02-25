package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    By addToCartButton = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    By notificationBox = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage navigateToHomePage() {
        webDriver.get("http://automationpractice.com/index.php");
        return this;
    }

    public SignInPage navigateToSignInPage() {
        navigateToHomePage();
        webDriver.findElement(signInButton).click();
        return new SignInPage(webDriver);
    }

    public CartPage addItemToCart() {
        webDriver.findElement(addToCartButton).click();
        return new CartPage(webDriver);
    }

    public String getCartNotification(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return webDriver.findElement(notificationBox).getText();
    }

    public CartPage clickProceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
        return new CartPage(webDriver);
    }

}
