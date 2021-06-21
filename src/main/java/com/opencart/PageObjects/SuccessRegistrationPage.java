
package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessRegistrationPage extends BasePage{

    @FindBy (xpath = "//h1[text() ='Your Account Has Been Created!']")
    private WebElement successRegistration;

    public WebElement getSuccessRegistration() {
        wait.until(ExpectedConditions.visibilityOf(successRegistration));
        return successRegistration;
    }
}
