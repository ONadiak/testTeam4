package com.automationPractice.PageObjects;

import com.automationPractice.Data.MainPageData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriverWait wait;
    public MainPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    @FindBy(css = "[href=\"http://automationpractice.com/index.php?controller=my-account\"]")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    private WebElement preRegisterButton;
    @FindBy(xpath = "//*[text()='Register'][1]")
    private WebElement registrationButton;

    MainPageData mainData = new MainPageData();





    public void open () {
        driver.get(mainData.getURL());

        //driver.get("http://localhost/opencart/upload/");
    }

    public void clickOnRegistrationButton () {
        preRegisterButton.click();
        registrationButton.click();
    }





}
