package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends AbstractPage {
  //sort this out
    //email
    By emailAddressInputBox = By.id("email");
     By passwordInputBox = By.id("passwd");
    By signInButton = By.id("SubmitLogin");

    By emailText = By.name("email_create");
    By createAccountButton = By.xpath("//*[@id=\"SubmitCreate\"]");

    By authenticationBreadcrumb = By.className("navigation_page");

    By Username = By.xpath("//*[@id=\"email\"]");
    By Password = By.xpath("//*[@id=\"passwd\"]");
    By SignInEnterButton = By.xpath("//*[@id=\"SubmitLogin\"]");



    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }



    public SignInPage navigateToSignIn() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        return this;
    }
//remove this login method because the same method has been done below but split up, if i remove will cause errors, so someone else remove
   public MyAccountPage login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressInputBox));
        webDriver.findElement(emailAddressInputBox).sendKeys("fedf@fd.com");
        webDriver.findElement(passwordInputBox).sendKeys("Password1");
        webDriver.findElement(signInButton).click();
        return (new MyAccountPage(webDriver));
    }

    public void enterEmailAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressInputBox));
        webDriver.findElement(emailAddressInputBox).sendKeys("fedf@fd.com");
    }

    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressInputBox));
        webDriver.findElement(passwordInputBox).sendKeys("Password1");
    }

    public void clickSignInButtonOnSignInPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressInputBox));
        webDriver.findElement(signInButton).click();
    }

  public AccountCreationPage enterEmailAddress(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailText));
        webDriver.findElement(emailText).sendKeys(email);
        webDriver.findElement(createAccountButton).click();
        return new AccountCreationPage(webDriver);
    }

    public String getBreadcrumbText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(authenticationBreadcrumb));
        return webDriver.findElement(authenticationBreadcrumb).getText();
    }

    public MyAccountPage enterSignInFields() throws InterruptedException {
        Thread.sleep(1000);

        webDriver.findElement(Username).sendKeys("fedf@fd.com");
        webDriver.findElement(Password).sendKeys("Password1");
        webDriver.findElement(SignInEnterButton).click();
        return (new MyAccountPage(webDriver));

    }
}
