package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInPageInCart extends AbstractPage{
    public SignInPageInCart(WebDriver webDriver) {
        super(webDriver);
    }

    By registerEmail = By.xpath("//*[@id=\"email\"]");
    By registerPassword = By.xpath("//*[@id=\"passwd\"]");

    public AddressPageCart signIn(){
        webDriver.findElement(registerEmail).sendKeys("fedf@fd.com");
        webDriver.findElement(registerPassword).sendKeys("Password1", Keys.ENTER);
        return (new AddressPageCart(webDriver));
    }


}
