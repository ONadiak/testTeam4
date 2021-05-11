package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCurrenciesPage extends BasePage{
    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement addCurrencyButton;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteCurrencyButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successAddingCurrencyText;

    public AdminCurrenciesPage() {
    }

    public WebElement getAddCurrencyButton() {
        return addCurrencyButton;
    }

    public WebElement getDeleteCurrencyButton() {
        return deleteCurrencyButton;
    }

    public WebElement getSuccessAddingCurrencyText() {
        return successAddingCurrencyText;
    }
}
