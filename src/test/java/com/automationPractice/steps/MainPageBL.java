package com.automationPractice.steps;

import com.automationPractice.PageObjects.MainPage;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL( ) {
        mainPage = new MainPage();
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
