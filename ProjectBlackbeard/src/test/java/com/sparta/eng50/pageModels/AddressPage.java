package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends AbstractPage {
    private By updateDeliveryAddressButton = By.xpath("//*[@id=\"address_delivery\"]/li[7]/a");
    private By deliveryAddress1Text = By.xpath("//*[@id=\"address_delivery\"]/li[3]");

    public AddressPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickUpdateAddress() {
        webDriver.findElement(updateDeliveryAddressButton).click();
    }

    public String getDeliveryAddress1Text() {
        return webDriver.findElement(deliveryAddress1Text).getText();
    }
}
