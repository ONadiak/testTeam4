package com.opencart.steps;

import com.opencart.PageObjects.AdminAddTaxRatePage;
import com.opencart.PageObjects.AdminNavigationPage;
import com.opencart.PageObjects.AdminTaxRatesPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AdminTaxRatesPageBL extends AdminTaxRatesPage{

    private AdminTaxRatesPage adminTaxRatesPage;

    public AdminTaxRatesPageBL() {adminTaxRatesPage = new AdminTaxRatesPage();
    }

    public AdminAddTaxRatePageBL clickOnAddTaxRateButton(){
        adminTaxRatesPage.getAddNewTaxRateButton().click();
        return new AdminAddTaxRatePageBL();
    }

    public AdminTaxRatesPageBL checkSuccessChangingTaxRate(){
        String expectedMessage = "Success: You have modified tax rates!\n";
        Assert.assertTrue(adminTaxRatesPage.getSuccessChangeMessage().getText().contains(expectedMessage));
        return this;
    }

    public AdminTaxRatesPageBL chooseFirstTaxRate(){
        adminTaxRatesPage.getFirstTaxRate().click();
        return this;
    }

    public AdminTaxRatesPageBL clickOnDeleteTax(){
        adminTaxRatesPage.getDeleteTaxRateButton().click();
        Alert alert = driver.switchTo().alert();
        return this;
    }

    public AdminTaxRatesPageBL acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

}
