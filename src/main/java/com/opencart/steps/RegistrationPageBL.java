package com.opencart.steps;

import com.opencart.Data.RegisterModel;
import com.opencart.PageObjects.BasePage;
import com.opencart.PageObjects.RegistrationPage;
import com.opencart.PageObjects.SuccessRegistrationPage;
import com.opencart.repository.RegisterModelRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RegistrationPageBL extends BasePage {

    private RegistrationPage registrationPage;
    private SuccessRegistrationPage succesRegistrationPage;

    public RegistrationPageBL() {
       registrationPage = new RegistrationPage();
    }

    public RegistrationPageBL registerNewPerson(){
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();

        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());

        clickPolicyBox();
        clickOnSubmitButton();


        succesRegistrationPage = new SuccessRegistrationPage();
        return this;
    }



    private void inputFirstName(String firstName){
        registrationPage.getFirstNameForReg().clear();
        registrationPage.getFirstNameForReg().sendKeys(firstName);
    }

    private void inputLastName(String lastName){
        registrationPage.getLastNameForReg().clear();
        registrationPage.getLastNameForReg().sendKeys(lastName);
    }

    private void inputEmail(String email){
        registrationPage.getEmailForReg().clear();
        registrationPage.getEmailForReg().sendKeys(email);
    }

    private void inputTelephone(String telephone){
        registrationPage.getTelephoneForReg().clear();
        registrationPage.getTelephoneForReg().sendKeys(telephone);
    }

    private void inputPassword(String password){
        registrationPage.getPasswordForReg().clear();
        registrationPage.getPasswordForReg().sendKeys(password);
        registrationPage.getPasswordConfirmForReg().clear();
        registrationPage.getPasswordConfirmForReg().sendKeys(password);
    }

    private void clickPolicyBox() {
       registrationPage.getCheckBox().click();
    }

    public void clickOnSubmitButton(){
        registrationPage.getSubmitButton().click();
    }

    public void checkSuccessRegistration(){
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(succesRegistrationPage.getSuccessRegistration().getText(),expectedMessage, "Incorrect page title");
    }

}
