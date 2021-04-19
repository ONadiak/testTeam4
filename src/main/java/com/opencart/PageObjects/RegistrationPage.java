package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {


    @FindBy(id = "input-firstname")
    private WebElement firstNameForReg;
    @FindBy(id = "input-lastname")
    private WebElement lastNameForReg;
    @FindBy(id = "input-email")
    private WebElement emailForReg;
    @FindBy(id = "input-telephone")
    private WebElement telephoneForReg;
    @FindBy(id = "input-password")
    private WebElement passwordForReg;
    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmForReg;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBox;
    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement submitButton;

    public WebElement getFirstNameForReg() {
        return firstNameForReg;
    }

    public WebElement getLastNameForReg() {
        return lastNameForReg;
    }

    public WebElement getEmailForReg() {
        return emailForReg;
    }

    public WebElement getTelephoneForReg() {
        return telephoneForReg;
    }

    public WebElement getPasswordForReg() {
        return passwordForReg;
    }

    public WebElement getPasswordConfirmForReg() {
        return passwordConfirmForReg;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }



}
