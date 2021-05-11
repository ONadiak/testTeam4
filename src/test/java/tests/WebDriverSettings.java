package tests;

import com.opencart.driver.DriverRepository;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class WebDriverSettings {




    @BeforeSuite
    public void setUp() {
        DriverRepository.downloadWebDriver();

    }

    @BeforeClass
    public void createDriver (){
        DriverRepository.instanceWebBrowser();
    }

//    @AfterSuite
//    public void closeBrowser(){
//        DriverRepository.closeBrowser();
//    }
}
