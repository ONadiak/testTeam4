package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage{
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement adminUserName;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement adminPassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement adminLoginButton;

    public WebElement getAdminUserName() {
        return adminUserName;
    }

    public WebElement getAdminPassword() {
        return adminPassword;
    }

    public WebElement getAdminLoginButton() {
        return adminLoginButton;
    }
}
