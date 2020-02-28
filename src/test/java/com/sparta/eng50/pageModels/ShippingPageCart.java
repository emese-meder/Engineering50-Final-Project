package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPageCart extends AbstractPage {
    By termsAndConditonsBox = By.xpath("//*[@id=\"cgv\"]");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"form\"]/p/button");

    public ShippingPageCart(WebDriver webDriver) {
        super(webDriver);
    }

    public ShippingPageCart acceptTermsConditions() {
        webDriver.findElement(termsAndConditonsBox).click();
        return this;
    }

    public PaymentPageCart navigateToProceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
        return (new PaymentPageCart(webDriver));
    }
}
