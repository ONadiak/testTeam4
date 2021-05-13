package com.opencart.steps;

import com.opencart.PageObjects.AdminCurrenciesPage;
import com.opencart.PageObjects.AdminNavigationPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class AdminCurrenciesPageBL extends AdminCurrenciesPage {
    private AdminCurrenciesPage adminCurrenciesPage;
    private AdminNavigationPage adminNavigationPage;

    public AdminCurrenciesPageBL() {
        adminCurrenciesPage = new AdminCurrenciesPage();
    }

    public AdminCurrenciesPageBL checkSuccessChangingCurrency(){
        String expectedMessage = "Success: You have modified currencies!\n";
        Assert.assertTrue(adminCurrenciesPage.getSuccessAddingCurrencyText().getText().contains(expectedMessage));
        return this;
    }

    public AdminAddCurrencyPageBL clickOnAddCurrencyButton(){
        adminCurrenciesPage.getAddCurrencyButton().click();
        return new AdminAddCurrencyPageBL();
    }

    public AdminCurrenciesPageBL clickOnDeleteButton(){
        adminCurrenciesPage.getDeleteCurrencyButton().click();
        Alert alert = driver.switchTo().alert();
        return this;
    }

    public AdminCurrenciesPageBL clickOnCurrenciesSettingsButton(){
        adminNavigationPage.getCurrenciesSettingsButton().click();
        return this;
    }

    public AdminCurrenciesPageBL acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    public AdminCurrenciesPageBL dismissAlert(){
        driver.switchTo().alert().dismiss();
        return this;
    }

    public AdminCurrenciesPageBL chooseFirstCurrency(){
        adminCurrenciesPage.getFirstCurrency().click();
        return this;
    }

}
