package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage extends AbstractPage {

    By mrCheckButton = By.xpath("//*[@id=\"id_gender1\"]");
    By mrsCheckButton = By.xpath("//*[@id=\"id_gender2\"]");
    By firstNameField = By.xpath("//*[@id=\"customer_firstname\"]");
    By lastNameField = By.xpath("//*[@id=\"customer_lastname\"]");
    By emailField = By.xpath("//*[@id=\"email\"]");
    By passwordField = By.xpath("//*[@id=\"passwd\"]");
    By dayDropDown = By.name("days");
    By monthDropDown = By.name("months");
    By yearDropDown = By.name("years");
    By newsletterSignUp = By.xpath("//*[@id=\"newsletter\"]");
    By specialOffers = By.xpath("//*[@id=\"optin\"]");
    By firstNameAddressField = By.xpath("//*[@id=\"firstname\"]");
    By lastNameAddressField = By.xpath("//*[@id=\"lastname\"]");
    By companyField = By.xpath("//*[@id=\"company\"]");
    By addressLineOneField = By.xpath("//*[@id=\"address1\"]");
    By addressLineTwoField = By.xpath("//*[@id=\"address2\"]");
    By cityField = By.xpath("//*[@id=\"city\"]");
    By stateDropDown = By.xpath("//*[@id=\"id_state\"]");
    By postcodeField = By.xpath("//*[@id=\"postcode\"]");
    By countryDropDown = By.xpath("//*[@id=\"id_country\"]");
    By additionalInformationField = By.xpath("//*[@id=\"other\"]");
    By homePhoneField = By.xpath("//*[@id=\"phone\"]");
    By mobilePhoneField = By.xpath("//*[@id=\"phone_mobile\"]");
    By aliasField = By.xpath("//*[@id=\"alias\"]");
    By registerButton = By.xpath("//*[@id=\"submitAccount\"]");

    public AccountCreationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyAccountPage enterSignUpForm() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(mrCheckButton).click();
        webDriver.findElement(firstNameField).sendKeys("Test");
        webDriver.findElement(lastNameField).sendKeys("User");
        //webDriver.findElement(emailField).sendKeys("test@user.com");
        webDriver.findElement(passwordField).sendKeys("password");
        Select daySelect = new Select(webDriver.findElement(dayDropDown));
        daySelect.selectByValue("1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select monthSelect = new Select(webDriver.findElement(monthDropDown));
        monthSelect.selectByValue("1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select yearSelect = new Select(webDriver.findElement(yearDropDown));
        yearSelect.selectByValue("1940");
        webDriver.findElement(newsletterSignUp).click();
        webDriver.findElement(specialOffers).click();
        webDriver.findElement(firstNameAddressField).sendKeys("Test");
        webDriver.findElement(lastNameAddressField).sendKeys("User");
        webDriver.findElement(companyField).sendKeys("Sparta Global");
        webDriver.findElement(addressLineOneField).sendKeys("1 Street Road");
        webDriver.findElement(addressLineTwoField).sendKeys("Floor 9");
        webDriver.findElement(cityField).sendKeys("London");
        Select stateSelect = new Select(webDriver.findElement(stateDropDown));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stateSelect.selectByValue("1");
        webDriver.findElement(postcodeField).sendKeys("00000");
        Select countrySelect = new Select(webDriver.findElement(countryDropDown));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countrySelect.selectByValue("21");
        webDriver.findElement(homePhoneField).sendKeys("00000000000");
        webDriver.findElement(mobilePhoneField).sendKeys("00000000000");
        //webDriver.findElement(aliasField).sendKeys("Home Address");
        webDriver.findElement(registerButton).click();
        return new MyAccountPage(webDriver);
    }
}
