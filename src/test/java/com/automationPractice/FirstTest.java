package com.automationPractice;

import com.automationPractice.Navigation.Navigation;
import com.automationPractice.steps.RegistrationPageBL;
import com.automationPractice.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.automationPractice.enums.URLs.BASE_URL;

public class FirstTest extends WebDriverSettings {


    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL stepsPage = new MainPageBL();
        RegistrationPageBL registrationPageBL = stepsPage.getMainPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registrationPageBL.checkSuccessRegistration();



    }



}
