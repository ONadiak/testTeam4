package com.opencart.steps;

import com.opencart.Data.TaxModel;
import com.opencart.PageObjects.AdminAddTaxRatePage;
import com.opencart.repository.TaxModelRepository;

public class AdminAddTaxRatePageBL {
    private AdminAddTaxRatePage adminAddTaxRatePage;

    public AdminAddTaxRatePageBL() {adminAddTaxRatePage = new AdminAddTaxRatePage();
    }

    public AdminTaxRatesPageBL addNewTax(){
        TaxModel taxModel=new TaxModelRepository().getTaxModel();

        inputTaxName(taxModel.getTaxName());
        inputTaxRate(taxModel.getTaxRate());


        clickOnSaveButton();

        return new AdminTaxRatesPageBL();

    }

    public void inputTaxName(String taxName){
        adminAddTaxRatePage.getTaxName().clear();
        adminAddTaxRatePage.getTaxName().sendKeys(taxName);
    }

    public void inputTaxRate(String taxRate){
        adminAddTaxRatePage.getTaxRate().clear();
        adminAddTaxRatePage.getTaxRate().sendKeys(taxRate);
    }

    public void clickOnSaveButton(){
        adminAddTaxRatePage.getSaveCurrencyButton().click();
    }
}

