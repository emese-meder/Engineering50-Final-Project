package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage{
    By Username = By.xpath("//*[@id=\"email\"]");
    By Password = By.xpath("//*[@id=\"passwd\"]");
    By SignInEnterButton = By.xpath("//*[@id=\"SubmitLogin\"]");
    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage enterSignInFields() throws InterruptedException {
        Thread.sleep(1000);


        webDriver.findElement(Username).sendKeys("fedf@fd.com");
        webDriver.findElement(Password).sendKeys("Password1");
        webDriver.findElement(SignInEnterButton).click();
        return (new SignInPage(webDriver));
    }
}
