package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends AbstractPage {

    By productText = By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getProductText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return webDriver.findElement(productText).getText();
    }

    public SignInPage clickProceedToCheckout() {
        webDriver.findElement(proceedToCheckoutButton).click();
        return new SignInPage(webDriver);
    }

}
