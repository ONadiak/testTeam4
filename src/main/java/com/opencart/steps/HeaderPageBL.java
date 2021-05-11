package com.opencart.steps;

import com.opencart.PageObjects.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;
    private String chosenCurrency = "";

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton(){
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegistrationPageBL clickOnRegisterButton(){
        headerPage.getRegistrationButton().click();
        return new RegistrationPageBL();
    }

    public HeaderPageBL clickOnChangeCurrencyToPoundButton(){
        headerPage.getChangeCurrencyToPoundButton().click();
        chosenCurrency = "£";
        return this;
    }
    public HeaderPageBL clickOnChangeCurrencyToEuroButton(){
        headerPage.getChangeCurrencyToEuroButton().click();
        chosenCurrency = "€";
        return this;
    }

    public HeaderPageBL clickOnChangeCurrencyToUSDollarButton(){
        headerPage.getChangeCurrencyToUSDollarButton().click();
        chosenCurrency = "$";
        return this;
    }

    public HeaderPageBL clickOnCurrencyButton(){
        headerPage.getCurrencyButton().click();
        return this;
    }

    public void checkCurrency(){
        headerPage.getCurrencyButton().getText().contains(chosenCurrency);
    }

}
