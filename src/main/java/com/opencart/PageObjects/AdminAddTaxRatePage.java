package com.opencart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminAddTaxRatePage extends BasePage{
    @FindBy(id = "input-name")
    private WebElement taxName;

    @FindBy(id="input-rate")
    private WebElement taxRate;

    @FindBy(xpath = "//i[@class='fa fa-save']")
    private WebElement saveCurrencyButton;

    private Select taxTypeSelector = new Select(driver.findElement(By.id("input-type")));

    private Select taxGeoZoneSelector = new Select(driver.findElement(By.id("input-type")));

    public WebElement getTaxName() {
        return taxName;
    }

    public WebElement getTaxRate() {
        return taxRate;
    }

    public Select getTaxTypeSelector() {
        return taxTypeSelector;
    }

    public Select getTaxGeoZoneSelector() {
        return taxGeoZoneSelector;
    }

    public WebElement getSaveCurrencyButton() {
        return saveCurrencyButton;
    }
}
