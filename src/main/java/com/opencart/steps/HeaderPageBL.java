package com.opencart.steps;

import com.opencart.PageObjects.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL( ) {
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


}
