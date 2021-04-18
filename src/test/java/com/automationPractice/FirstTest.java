package com.automationPractice;

import com.automationPractice.PageObjects.LoginPage;
import com.automationPractice.PageObjects.MainPage;
import com.automationPractice.PageObjects.RegistrationPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FirstTest extends WebDriverSettings {
    MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
    RegistrationPage registPage = PageFactory.initElements(driver,RegistrationPage.class);


    @Test
    public void firstTest() {
        mainPage.open();
        mainPage.clickOnRegistrationButton();
        registPage.registration();



    }
    


}
