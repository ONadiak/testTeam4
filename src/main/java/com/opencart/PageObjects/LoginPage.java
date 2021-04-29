package com.opencart.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }








}
