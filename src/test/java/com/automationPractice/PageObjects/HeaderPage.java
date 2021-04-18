package com.automationPractice.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[text()='Register'][1]")
    private WebElement registrationButton;

    @FindBy(xpath = "//i[@class='fa fa-phone']")
    private WebElement contactUsButton;

    @FindBy(xpath = "//i[@class='fa fa-heart']")
    private WebElement wishListButton;

    @FindBy(xpath = ".//i[@class='fa fa-caret-down']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//i[@class='fa fa-share']")
    private WebElement checkoutButton;


    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

}
