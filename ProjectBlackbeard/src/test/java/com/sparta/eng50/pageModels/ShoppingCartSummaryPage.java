package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartSummaryPage extends AbstractPage {
    private By proceedToCheckoutButton = By.name("Proceed to checkout");

    private By increaseQuantityButton = By.id("cart_quantity_up_6_31_0_278425");
    private By decreaseQuantityButton = By.id("cart_quantity_down_6_31_0_278425");

    private By deleteProductButton = By.name("Your shopping cart is empty.");


    public ShoppingCartSummaryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void proceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
    }

    public void increaseQuantity() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(increaseQuantityButton));
        webDriver.findElement(increaseQuantityButton).click();
    }

    public void decreaseQuality() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(decreaseQuantityButton));
        webDriver.findElement(decreaseQuantityButton).click();
    }

    public void deleteProduct() {
        webDriver.findElement(deleteProductButton).click();
    }

    public boolean isProductInCart() {
        return webDriver.findElements(By.id("product_2_7_0_277797")).size() > 0;

    }
}
