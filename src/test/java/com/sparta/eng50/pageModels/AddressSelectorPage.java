package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressSelectorPage extends AbstractPage {

    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/form/p/button");

    public AddressSelectorPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ShippingPage clickProceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
        return new ShippingPage(webDriver);
    }

}
