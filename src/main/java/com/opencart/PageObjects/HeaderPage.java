package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage extends BasePage {



    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[text()='Register'][1]")
    private WebElement registrationButton;

    @FindBy(xpath = "//i[@class='fa fa-phone']")
    private WebElement contactUsButton;

    @FindBy(xpath = "//i[@class='fa fa-heart']")
    private WebElement wishListButton;

    @FindBy(xpath = "//span[@id='cart-total']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//i[@class='fa fa-share']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    private WebElement currencyButton;

    @FindBy(xpath = "//button[@name='EUR']")
    private WebElement changeCurrencyToEuroButton;

    @FindBy(xpath = "//button[@name='GBP']")
    private WebElement changeCurrencyToPoundButton;

    @FindBy(xpath = "//button[@name='USD']")
    private WebElement changeCurrencyToUSDollarButton;





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

    public WebElement getChangeCurrencyToEuroButton() {
        return changeCurrencyToEuroButton;
    }

    public WebElement getChangeCurrencyToPoundButton() {
        return changeCurrencyToPoundButton;
    }

    public WebElement getChangeCurrencyToUSDollarButton() {
        return changeCurrencyToUSDollarButton;
    }

    public WebElement getCurrencyButton() {
        return currencyButton;
    }


}