package com.automationPractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    WebDriver driver;
    WebDriverWait wait;
    public RegistrationPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

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

    public void registration () {
        firstNameForReg.sendKeys("Ost");
        lastNameForReg.sendKeys("Nad");
        emailForReg.sendKeys("nad@gmail.com");
        telephoneForReg.sendKeys("32874554");
        passwordForReg.sendKeys("password");
        passwordConfirmForReg.sendKeys("password");
        checkBox.click();

    }


}
