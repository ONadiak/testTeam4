package com.opencart.steps;

import com.opencart.PageObjects.AdminNavigationPage;

public class AdminNavigationPageBL {
    private AdminNavigationPageBL adminNavigationPageBL;
    private AdminNavigationPage adminNavigationPage;
    private AdminLoginPageBL adminLoginPageBL;



    public AdminNavigationPageBL(AdminNavigationPage adminNavigationPage) {
        this.adminNavigationPage = adminNavigationPage;
    }



    public AdminNavigationPageBL() {
        adminNavigationPage = new AdminNavigationPage();
    }

    public AdminNavigationPageBL clickOnSystemButton(){
        adminNavigationPage.getSystemButton().click();
        return this;
    }

    public AdminNavigationPageBL clickOnLocalizationButton(){
        adminNavigationPage.getSystemLocalizationButton().click();
        return this;
    }

    public AdminCurrenciesPageBL clickOnCurrenciesSettingsButton(){
        adminNavigationPage.getCurrenciesSettingsButton().click();
        return new AdminCurrenciesPageBL();
    }

    public AdminNavigationPageBL clickOnTaxesButton(){
        adminNavigationPage.getTaxesButton().click();
        return this;
    }

    public AdminTaxRatesPageBL clickOnTaxRatesButton(){
        adminNavigationPage.getTaxRatesButton().click();
        return new AdminTaxRatesPageBL();
    }

    public AdminLoginPageBL getAdminLoginPageBL() {
        return adminLoginPageBL;
    }
}
