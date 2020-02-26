package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends AbstractPage{

    By orderConfirmationBreadcrumb = By.className("navigation_page");
    public OrderConfirmationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getBreadcrumbText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return webDriver.findElement(orderConfirmationBreadcrumb).getText();
    }
}
