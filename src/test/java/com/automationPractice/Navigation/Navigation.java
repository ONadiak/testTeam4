package com.automationPractice.Navigation;

import com.automationPractice.driver.DriverRepository;
import org.openqa.selenium.WebDriver;

public class Navigation {
    private WebDriver driver;
    public Navigation(){
        driver = DriverRepository.DRIVERS.get();
    }

    public void navigateToURL(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }


}
