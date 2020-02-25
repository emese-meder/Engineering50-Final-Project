package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAddressPage extends AbstractPage {
    By address1InputBox = By.id("address1");
    By submitButton = By.id("submitAddress");

    public EditAddressPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterNewAddress() {
        webDriver.findElement(address1InputBox).clear();
        webDriver.findElement(address1InputBox).sendKeys("125 London Wall");
    }

    public void saveNewAddress() {
        webDriver.findElement(submitButton).click();
    }

}
