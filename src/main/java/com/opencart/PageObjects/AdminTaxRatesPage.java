package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminTaxRatesPage extends BasePage{
    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement addNewTaxRateButton;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteTaxRateButton;

    @FindBy(xpath = ".//tbody/tr[position() = 1]/td[position() = 1]")
    private WebElement firstTaxRate;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successChangeMessage;

    public WebElement getAddNewTaxRateButton() {
        return addNewTaxRateButton;
    }

    public WebElement getDeleteTaxRateButton() {
        return deleteTaxRateButton;
    }

    public WebElement getFirstTaxRate() {
        return firstTaxRate;
    }

    public WebElement getSuccessChangeMessage() {
        return successChangeMessage;
    }
}
