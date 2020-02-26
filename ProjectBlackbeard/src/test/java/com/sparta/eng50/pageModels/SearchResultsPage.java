package com.sparta.eng50.pageModels;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends AbstractPage {
    public SearchResultsPage(WebDriver webDriver) {
        super(webDriver);

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
