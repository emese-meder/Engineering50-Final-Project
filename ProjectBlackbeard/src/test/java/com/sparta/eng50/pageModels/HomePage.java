package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    By womenButton = By.linkText("Women");


    public HomePage navigateToHomePage() {
        webDriver.get("http://automationpractice.com/index.php");
        return this;
    }

    public WomenPage navigateToWomenPage() {
        webDriver.findElement(womenButton).click();
        return (new WomenPage(webDriver));
    }
}
