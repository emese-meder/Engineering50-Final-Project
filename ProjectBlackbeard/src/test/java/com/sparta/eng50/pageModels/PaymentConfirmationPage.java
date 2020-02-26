package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentConfirmationPage extends AbstractPage {

    By confirmButton = By.xpath("//*[@id=\"cart_navigation\"]/button");

    public PaymentConfirmationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrderConfirmationPage clickOnConfirmButton(){
        webDriver.findElement(confirmButton).click();
        return new OrderConfirmationPage(webDriver);
    }
}
