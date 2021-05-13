package com.opencart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminAddCurrencyPage extends BasePage{
    @FindBy(id = "input-title")
    private WebElement currencyTitleInput;

    @FindBy(id = "input-code")
    private WebElement currencyCodeInput;

    @FindBy(id = "input-symbol-left")
    private WebElement currencySymbolLeftInput;

    @FindBy(id = "input-symbol-right")
    private WebElement currencySymbolRightInput;

    @FindBy(id = "input-decimal-place")
    private WebElement currencyDecimalPlaceInput;

    @FindBy(id = "input-value")
    private WebElement currencyValueInput;

    @FindBy(xpath = "//i[@class='fa fa-save']")
    private WebElement saveCurrencyButton;



    private Select currencyStatusSelector = new Select(driver.findElement(By.id("input-status")));

    public WebElement getCurrencyTitleInput() {
        return currencyTitleInput;
    }

    public WebElement getCurrencyCodeInput() {
        return currencyCodeInput;
    }

    public WebElement getCurrencySymbolLeftInput() {
        return currencySymbolLeftInput;
    }

    public WebElement getCurrencySymbolRightInput() {
        return currencySymbolRightInput;
    }

    public WebElement getCurrencyDecimalPlaceInput() {
        return currencyDecimalPlaceInput;
    }

    public WebElement getCurrencyValueInput() {
        return currencyValueInput;
    }

    public WebElement getSaveCurrencyButton() {
        return saveCurrencyButton;
    }

    public Select getCurrencyStatusSelector() {
        return currencyStatusSelector;
    }
}
