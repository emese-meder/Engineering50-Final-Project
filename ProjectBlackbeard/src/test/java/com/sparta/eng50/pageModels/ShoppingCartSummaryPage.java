package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage extends AbstractPage {
    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public ShoppingCartSummaryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void proceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
    }

}
