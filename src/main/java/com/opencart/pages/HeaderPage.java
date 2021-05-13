package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href, 'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href, 'login')]")
    private WebElement loginButton;

    @FindBy(xpath = ".//*[@id= 'wishlist-total']/i")
    private WebElement wishListButton;

    @FindBy(xpath = ".//i[@class='fa fa-shopping-cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = ".//*[@id='top-links']/ul/li[5]/a/i")
    private WebElement checkoutButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
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
