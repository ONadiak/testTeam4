package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminNavigationPage extends BasePage{
    AdminNavigationPage adminNavigationPage;

    @FindBy (xpath = "//*[@id=\"menu-system\"]")
    private WebElement systemButton;

    @FindBy(linkText = "Localisation")
    private WebElement systemLocalizationButton;

    @FindBy(linkText = "Currencies")
    private WebElement currenciesSettingsButton;

    @FindBy(linkText = "Taxes")
    private WebElement taxesButton;

    @FindBy(linkText = "Tax Classes")
    private WebElement taxClassesButton;

    @FindBy(linkText = "Tax Rates")
    private WebElement taxRatesButton;

    public AdminNavigationPage() {

    }

    public WebElement getSystemButton() {
        return systemButton;
    }

    public WebElement getSystemLocalizationButton() {
        return systemLocalizationButton;
    }

    public WebElement getCurrenciesSettingsButton() {
        return currenciesSettingsButton;
    }

    public WebElement getTaxesButton() {
        return taxesButton;
    }

    public WebElement getTaxClassesButton() {
        return taxClassesButton;
    }

    public WebElement getTaxRatesButton() {
        return taxRatesButton;
    }
}
