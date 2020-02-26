package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends AbstractPage {

    By bankWireButton = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");

    public PaymentPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PaymentConfirmationPage clickPayByBankWire() {
        webDriver.findElement(bankWireButton).click();
        return new PaymentConfirmationPage(webDriver);
    }


}
