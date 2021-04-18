package com.automationPractice.steps;

import com.automationPractice.PageObjects.HeaderPage;

public class HeaderPageBL {

    private HeaderPage mainPage;

    public HeaderPageBL( ) {
        mainPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton(){
        mainPage.getMyAccountButton().click();
        return this;
    }
    public RegistrationPageBL clickOnRegisterButton(){
        mainPage.getRegistrationButton().click();
        return new RegistrationPageBL();
    }


}
