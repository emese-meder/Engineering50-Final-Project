package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtsPage extends AbstractPage {
    By productButton = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");

    public TShirtsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ItemPage navigateToItemPage() {
        webDriver.findElement(productButton).click();
        return new ItemPage(webDriver);
    }
}
