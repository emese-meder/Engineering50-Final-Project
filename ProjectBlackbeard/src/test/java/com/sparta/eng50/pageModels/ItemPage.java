package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemPage extends AbstractPage {
    By addToCartButton = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By checkoutPopupButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    By closeWindowButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    By productTitleText = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1");

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
        webDriver.findElement(checkoutPopupButton).click();
        return (new CartPage(webDriver));
    }

    public void closeItemWindow() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(closeWindowButton));
        webDriver.findElement(closeWindowButton).click();
    }

    public String getProductTitle() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(productTitleText));
        return webDriver.findElement(productTitleText).getText();
    }
}
