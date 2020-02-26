package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends AbstractPage {

    By checkoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPageInCart navigateToProceedToCheckoutButton(){
        webDriver.findElement(checkoutButton).click();
        return (new SignInPageInCart(webDriver));
    }
}
