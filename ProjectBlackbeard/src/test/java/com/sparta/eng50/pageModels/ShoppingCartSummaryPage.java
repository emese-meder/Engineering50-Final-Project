package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage extends AbstractPage {
    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By deleteProductButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[7]/div/a");

    public ShoppingCartSummaryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void proceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
    }

    public void deleteProduct() {
        webDriver.findElement(deleteProductButton).click();
    }

    public boolean isProductInCart() {
        return webDriver.findElements(By.id("product_2_7_0_277797")).size() > 0;
    }
}
