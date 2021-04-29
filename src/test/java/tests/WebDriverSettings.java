package tests;

import com.opencart.Data.SearchData;
import com.opencart.PageObjects.SearchPage;
import com.opencart.driver.DriverRepository;
import com.opencart.steps.StepsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class WebDriverSettings {

    SearchData searchData = new SearchData();
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
