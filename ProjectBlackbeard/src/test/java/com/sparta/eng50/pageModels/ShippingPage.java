package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {

    WebDriver webDriver;

    By termsAndConditions = By.xpath("//*[@id=\"uniform-cgv\"]");
    By proceedButton = By.xpath("//*[@id=\"form\"]/p/button");

    public ShippingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ShippingPage clickOnTermsAndConditions(){
        webDriver.findElement(termsAndConditions).click();
        return this;
    }

    public PaymentPage proceedButton(){
        webDriver.findElement(proceedButton).click();
        return new PaymentPage(webDriver);
    }
}
