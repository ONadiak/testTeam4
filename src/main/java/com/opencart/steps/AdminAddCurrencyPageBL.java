package com.opencart.steps;

import com.opencart.Data.CurrencyModel;
import com.opencart.PageObjects.AdminAddCurrencyPage;
import com.opencart.repository.CurrencyModelRepository;


public class AdminAddCurrencyPageBL extends AdminAddCurrencyPage {
    private AdminAddCurrencyPage adminAddCurrencyPage;

    public AdminCurrenciesPageBL addNewCurrency(){
        CurrencyModel currencyModel = new CurrencyModelRepository().getCurrencyModel();

        inputCurrencyTitle(currencyModel.getCurrencyTitle());
        inputCurrencyCode(currencyModel.getCurrencyCode());
        inputCurrencySymbolLeft(currencyModel.getCurrencySymbolLeft());
        inputCurrencySymbolRight(currencyModel.getCurrencySymbolRight());
        inputCurrencyDecimalPlaces(currencyModel.getCurrencyDecimalPlaces());
        inputCurrencyValue(currencyModel.getCurrencyValue());

        adminAddCurrencyPage.getCurrencyStatusSelector().selectByVisibleText("Enabled");

        clickOnSaveCurrencyButton();

        return new AdminCurrenciesPageBL();
    }

    public AdminAddCurrencyPageBL() {
        adminAddCurrencyPage = new AdminAddCurrencyPage();
    }

    public void inputCurrencyTitle(String currencyTitle){
        adminAddCurrencyPage.getCurrencyTitleInput().clear();
        adminAddCurrencyPage.getCurrencyTitleInput().sendKeys(currencyTitle);
    }

    public void inputCurrencyCode(String currencyCode){
        adminAddCurrencyPage.getCurrencyCodeInput().clear();
        adminAddCurrencyPage.getCurrencyCodeInput().sendKeys(currencyCode);
    }

    public void inputCurrencySymbolLeft(String currencySymbolLeft){
        adminAddCurrencyPage.getCurrencySymbolLeftInput().clear();
        adminAddCurrencyPage.getCurrencySymbolLeftInput().sendKeys(currencySymbolLeft);
    }

    public void inputCurrencySymbolRight(String currencySymbolRight){
        adminAddCurrencyPage.getCurrencySymbolRightInput().clear();
        adminAddCurrencyPage.getCurrencySymbolRightInput().sendKeys(currencySymbolRight);
    }

    public void inputCurrencyDecimalPlaces(String currencyDecimalPlace){
        adminAddCurrencyPage.getCurrencyDecimalPlaceInput().clear();
        adminAddCurrencyPage.getCurrencyDecimalPlaceInput().sendKeys(currencyDecimalPlace);
    }

    public void inputCurrencyValue(String currencyValue){
        adminAddCurrencyPage.getCurrencyValueInput().clear();
        adminAddCurrencyPage.getCurrencyValueInput().sendKeys(currencyValue);
    }

    public void clickOnSaveCurrencyButton(){
        adminAddCurrencyPage.getSaveCurrencyButton().click();
    }
}
