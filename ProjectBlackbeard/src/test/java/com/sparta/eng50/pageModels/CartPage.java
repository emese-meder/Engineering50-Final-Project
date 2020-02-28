package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends AbstractPage {


    By productText = By.className("product-name");
  //pick one
    By proceedToCheckoutButton = By.linkText("Proceed to checkout");
    By checkoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");


    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }


    public String getProductText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productText));
        return webDriver.findElement(productText).getText();
    }
  
//pick one
    public SignInPage clickProceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
        return new SignInPage(webDriver);
    }
  
    public SignInPageInCart navigateToProceedToCheckoutButton(){
        webDriver.findElement(checkoutButton).click();
        return (new SignInPageInCart(webDriver));
    }
}
