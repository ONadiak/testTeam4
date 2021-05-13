package tests;
import com.opencart.Navigation.Navigation;
import com.opencart.steps.AdminCurrenciesPageBL;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminNavigationPageBL;
import com.opencart.steps.AdminTaxRatesPageBL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;


public class AdminCurrencyTests extends WebDriverSettings{

    @Test
    public void addNewCurrency(){
        new Navigation().navigateToURL(ADMIN_URL.getValue());
        AdminLoginPageBL steps = new AdminLoginPageBL();
        AdminCurrenciesPageBL adminCurrenciesPageBL = steps.loginAdmin()
                .clickOnSystemButton()
                .clickOnLocalizationButton()
                .clickOnCurrenciesSettingsButton()
                .clickOnAddCurrencyButton()
                .addNewCurrency();
        adminCurrenciesPageBL.checkSuccessChangingCurrency();
    }

    @Test
    public void deleteCurrency(){
        new Navigation().navigateToURL(ADMIN_URL.getValue());
        AdminLoginPageBL steps = new AdminLoginPageBL();
        AdminCurrenciesPageBL adminCurrenciesPageBL = steps.loginAdmin()
                .clickOnSystemButton()
                .clickOnLocalizationButton()
                .clickOnCurrenciesSettingsButton()
                .chooseFirstCurrency()
                .clickOnDeleteButton()
                .acceptAlert()
                .checkSuccessChangingCurrency();
    }

    @Test
    public void addNewTax(){
        new Navigation().navigateToURL(ADMIN_URL.getValue());
        AdminLoginPageBL steps = new AdminLoginPageBL();
        AdminTaxRatesPageBL adminCurrenciesPageBL = steps.loginAdmin()
                .clickOnSystemButton()
                .clickOnLocalizationButton()
                .clickOnTaxesButton()
                .clickOnTaxRatesButton()
                .clickOnAddTaxRateButton()
                .addNewTax();
                adminCurrenciesPageBL.checkSuccessChangingTaxRate();

    }

    @Test
    public void deleteTax(){
        new Navigation().navigateToURL(ADMIN_URL.getValue());
        AdminLoginPageBL steps = new AdminLoginPageBL();
        AdminTaxRatesPageBL adminCurrenciesPageBL = steps.loginAdmin()
                .clickOnSystemButton()
                .clickOnLocalizationButton()
                .clickOnTaxesButton()
                .clickOnTaxRatesButton()
                .chooseFirstTaxRate()
                .clickOnDeleteTax()
                .acceptAlert()
                .checkSuccessChangingTaxRate();
    }

}
