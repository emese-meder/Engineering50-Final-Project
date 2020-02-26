package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPageCart extends AbstractPage {
    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/form/p/button");

    public AddressPageCart(WebDriver webDriver) {
        super(webDriver);
    }

    public ShippingPageCart navigateToProceedToCheckout(){
        webDriver.findElement(proceedToCheckoutButton).click();
        return (new ShippingPageCart(webDriver));
    }
}
