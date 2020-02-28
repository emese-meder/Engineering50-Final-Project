package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPageCart extends AbstractPage {


    public PaymentPageCart(WebDriver webDriver) {
        super(webDriver);
    }

    public PaymentDetailsPage navigateToPayByBankWire() throws InterruptedException {
        Thread.sleep(2000);
        By payByBankWireButton = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
        webDriver.findElement(payByBankWireButton).click();
        return (new PaymentDetailsPage(webDriver));
    }

    public PaymentDetailsPage navigateToPayByCheque() throws InterruptedException {
        Thread.sleep(2000);
        By payByChequeButton = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
        webDriver.findElement(payByChequeButton).click();
        return (new PaymentDetailsPage(webDriver));
    }
}
