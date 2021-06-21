
package tests;

import com.opencart.Data.DataForTests;
import com.opencart.driver.DriverRepository;
import com.opencart.steps.StepsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class WebDriverSettings {

    DataForTests dataForTests = new DataForTests();
    StepsPage stepsPage = new StepsPage();


    @BeforeSuite
    public void setUp() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver (){
        DriverRepository.instanceWebBrowser();
    }

    @AfterSuite
    public void closeBrowser(){
        DriverRepository.closeBrowser();
    }
}
