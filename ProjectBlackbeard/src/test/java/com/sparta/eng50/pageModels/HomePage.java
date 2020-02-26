package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends AbstractPage {
    By firstItem = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
    By womensButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By tshirtButtonInDropdown = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public HomePage navigateToHomePage() {

        webDriver.get("http://automationpractice.com/index.php");
        return this;
    }

    public ItemPage navigateToFirstItem() throws InterruptedException {
        webDriver.findElement(firstItem).click();
        return (new ItemPage(webDriver));
    }

    public HomePage hoverOverWomensButton() {
        Actions actions = new Actions(webDriver);

        WebElement target = webDriver.findElement(womensButton);

        actions.moveToElement(target).perform();
        return this;
    }

    public TShirtsPage navigateToTShirtsPage() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.findElement(tshirtButtonInDropdown).click();
        return (new TShirtsPage(webDriver));
    }
}
