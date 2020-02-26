package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends AbstractPage
{

    By addToCartButton = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

    public ItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ItemPage navigateToAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.findElement(addToCartButton).click();
        return this;
    }

    public CartPage navigateToCheckoutPopup() throws InterruptedException {
        Thread.sleep(2500);

        By checkoutPopupButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
        webDriver.findElement(checkoutPopupButton).click();
        return (new CartPage(webDriver));
    }
}
