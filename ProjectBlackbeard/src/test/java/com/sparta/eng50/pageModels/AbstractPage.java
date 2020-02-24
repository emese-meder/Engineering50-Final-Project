package com.sparta.eng50.pageModels;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver webDriver;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void closePage() {
        webDriver.close();
        webDriver.quit();
    }

    public void goBackAPage() {
        webDriver.navigate().back();
    }

    public void refreshPage() {
        webDriver.navigate().refresh();
    }
}