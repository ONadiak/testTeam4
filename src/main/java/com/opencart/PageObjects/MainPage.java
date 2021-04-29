package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {


    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class= 'btn btn-default btn-lg']")
    private WebElement searchButton;

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
