package com.opencart.steps;

import com.opencart.PageObjects.AdminCurrenciesPage;
import org.testng.Assert;

public class AdminCurrenciesPageBL extends AdminCurrenciesPage {
    private AdminCurrenciesPage adminCurrenciesPage;

    public AdminCurrenciesPageBL() {
        adminCurrenciesPage = new AdminCurrenciesPage();
    }

    public void checkSuccessAddingCurrency(){
        String expectedMessage = "Success: You have modified currencies!\n";
        Assert.assertTrue(adminCurrenciesPage.getSuccessAddingCurrencyText().getText().contains(expectedMessage));
    }

    public AdminAddCurrencyPageBL clickOnAddCurrencyButton(){
        adminCurrenciesPage.getAddCurrencyButton().click();
        return new AdminAddCurrencyPageBL();
    }



}
