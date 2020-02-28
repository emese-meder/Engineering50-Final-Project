package com.sparta.eng50.pageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FactoryPatternObject {
    WebDriver webDriver;

    public FactoryPatternObject() {
    }

    public WebDriver getWebDriver(String type) {
        String driverTypeLowerCase = type.toLowerCase();
        switch (driverTypeLowerCase) {
            case "chrome":
                webDriver = new ChromeDriver();
            break;

            case "firefox":
            case "fire fox":
                webDriver = new FirefoxDriver();
            break;

            case "microsoft edge":
            case "edge":
                System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
                webDriver = new EdgeDriver();
            break;

            case "ie":
            case "internet explorer":
                webDriver = new InternetExplorerDriver();
            break;

            case "safari":
                webDriver = new SafariDriver();
                break;

            case "opera":
                webDriver = new OperaDriver();
            break;

        }
        return webDriver;
    }

}

