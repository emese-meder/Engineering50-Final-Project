package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage{

    By emailText = By.name("email_create");
    By createAccountButton = By.xpath("//*[@id=\"SubmitCreate\"]");
    By Username = By.xpath("//*[@id=\"email\"]");
    By Password = By.xpath("//*[@id=\"passwd\"]");
    By SignInEnterButton = By.xpath("//*[@id=\"SubmitLogin\"]");
  

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage enterEmailAddress(String email) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(emailText).sendKeys(email);
        webDriver.findElement(createAccountButton).click();
        return this;
    }

    public SignInPage enterSignInFields() throws InterruptedException {
        Thread.sleep(1000);


        webDriver.findElement(Username).sendKeys("fedf@fd.com");
        webDriver.findElement(Password).sendKeys("Password1");
        webDriver.findElement(SignInEnterButton).click();
        return (new SignInPage(webDriver));

    }
}
