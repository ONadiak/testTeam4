package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h2[1]")
    private WebElement myAccountTitle;

    public WebElement getMyAccountTitle() {
        return myAccountTitle;
    }
}
