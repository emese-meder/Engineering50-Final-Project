package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage {
    By emailAddressInputBox = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
    By passwordInputBox = By.id("passwd");
    By signInButton = By.id("SubmitLogin");

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage navigateToSignIn() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        return this;
    }

    public void login() {
        webDriver.findElement(emailAddressInputBox).sendKeys("fedf@fd.com");
        webDriver.findElement(passwordInputBox).sendKeys("Password1");
        webDriver.findElement(signInButton).click();
    }
}
