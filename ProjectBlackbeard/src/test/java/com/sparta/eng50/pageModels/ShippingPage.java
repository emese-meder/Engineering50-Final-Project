package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShippingPage extends AbstractPage {

    By termsAndConditions = By.xpath("//*[@id=\"uniform-cgv\"]");
    By proceedButton = By.xpath("//*[@id=\"form\"]/p/button");

    public ShippingPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ShippingPage clickOnTermsAndConditions(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditions));
        webDriver.findElement(termsAndConditions).click();
        return this;
    }

    public PaymentPage proceedButton(){
        webDriver.findElement(proceedButton).click();
        return new PaymentPage(webDriver);
    }
}
