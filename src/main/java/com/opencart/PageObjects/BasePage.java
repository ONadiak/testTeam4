package com.opencart.PageObjects;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage () {
        driver = DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this);
    }

}
