package com.automationPractice;


import com.automationPractice.Navigation.Navigation;
import com.automationPractice.steps.RegistrationPageBL;
import com.automationPractice.steps.StepsPage;
import org.testng.annotations.Test;

import static com.automationPractice.enums.URLs.BASE_URL;

public class FirstTest extends WebDriverSettings {


    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        StepsPage stepsPage = new StepsPage();
        RegistrationPageBL registrationPageBL = stepsPage.getMainPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registrationPageBL.checkSuccessRegistration();



    }



}
