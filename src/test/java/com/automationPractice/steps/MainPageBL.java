package com.automationPractice.steps;

import com.automationPractice.PageObjects.HeaderPage;

public class MainPageBL {

    private HeaderPage mainPage;

    public MainPageBL( ) {
        mainPage = new HeaderPage();
    }

    public MainPageBL clickOnMyAccountButton(){
        mainPage.getMyAccountButton().click();
        return this;
    }
    public RegistrationPageBL clickOnRegisterButton(){
        mainPage.getRegistrationButton().click();
        return new RegistrationPageBL();
    }


}
