package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {



    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement myAccountButton;
    @FindBy(xpath = "//*[text()='Register'][1]")
    private WebElement registrationButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }
    public WebElement getRegistrationButton() {
        return registrationButton;
    }







}
