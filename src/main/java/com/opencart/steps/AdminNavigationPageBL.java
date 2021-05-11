package com.opencart.steps;

import com.opencart.PageObjects.AdminCurrenciesPage;
import com.opencart.PageObjects.AdminNavigationPage;
import com.opencart.PageObjects.HeaderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public AdminLoginPageBL getAdminLoginPageBL() {
        return adminLoginPageBL;
    }
}
