package com.sparta.eng50.pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends AbstractPage {
    By informationTable = By.id("informations_block_left_1");

    public SearchResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchResultsPage navigateToSearchResultsPageWithoutSearch() {
        webDriver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
        return this;
    }
//     public DeliveryInformationPage navigateToDeliveryInformation(){
//        webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("Delivery")).click();
//        return new DeliveryInformationPage(webDriver);
//     }

     public TermsAndConditionsPage navigateToTermsAndConditions(){
        webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("Terms and conditions of use")).click();
        return new TermsAndConditionsPage(webDriver);
     }

//     public LegalNoticePage navigateToLegalNoticePage(){
//        webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("Legal Notice")).click();
//        return new LegalNoticePage(webDriver);
//     }
//
//     public AboutUsPage navigateToAboutUsPage(){
//         webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("About us")).click();
//         return new AboutUsPage(webDriver);
//     }
//     public SecurePaymentPage navigateToSecurePaymentPage(){
//         webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("Secure payment")).click();
//         return new SecurePaymentPage(webDriver);
//     }
     public OurStoresPage navigateToOurStoresPage(){
         webDriver.findElement(By.id("informations_block_left_1")).findElement(By.linkText("Our stores")).click();
         return new OurStoresPage(webDriver);
     }


    public SearchResultsPage searchForDress(){
        webDriver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
        return this;
    }
    public SearchResultsPage searchForTshirt(){
        webDriver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=t-shirt&submit_search=");
        return this;

    }

}
