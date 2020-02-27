package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenPage extends AbstractPage {
    By productTitleInCart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a");

    public WomenPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getProductTitleInCart() {
        By cartDropdown = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(cartDropdown)).perform();
        return webDriver.findElement(productTitleInCart).getAttribute("title");
    }
    public void colourChange(String colour) {
        WebDriverWait wait = new WebDriverWait(webDriver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(colour)));
        webDriver.findElement(By.id(colour)).click();
    }

}
