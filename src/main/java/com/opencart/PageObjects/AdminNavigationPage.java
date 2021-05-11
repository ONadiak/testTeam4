package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminNavigationPage extends BasePage{
    private AdminNavigationPage adminNavigationPage;

    @FindBy (xpath = "//*[@id=\"menu-system\"]")
    private WebElement systemButton;

    @FindBy(linkText = "Localisation")
    private WebElement systemLocalizationButton;

    @FindBy(linkText = "Currencies")
    private WebElement currenciesSettingsButton;

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
}
