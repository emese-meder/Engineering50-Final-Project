package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartSummaryPage extends AbstractPage {
    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    By increaseQuantityButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[2]");
    By decreaseQuantityButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[1]");

    By deleteProductButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a");


    public ShoppingCartSummaryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void proceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
    }

    public ShoppingCartSummaryPage increaseQuantity() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(increaseQuantityButton));
        webDriver.findElement(increaseQuantityButton).click();
        return this;
    }

    public ShoppingCartSummaryPage decreaseQuality() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(decreaseQuantityButton));
        webDriver.findElement(decreaseQuantityButton).click();
        return this;
    }

    public void deleteProduct() {
        webDriver.findElement(deleteProductButton).click();
    }

    public boolean isProductInCart() {
        return webDriver.findElements(By.id("product_2_7_0_277797")).size() > 0;

    }
}
