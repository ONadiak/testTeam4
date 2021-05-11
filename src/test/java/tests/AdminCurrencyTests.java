package tests;
import com.opencart.Navigation.Navigation;
import com.opencart.steps.AdminCurrenciesPageBL;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminNavigationPageBL;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
import static com.opencart.enums.URLs.CURRENCY_URL;

public class AdminCurrencyTests extends WebDriverSettings{

    @Test
    public void loginAdmin(){
        new Navigation().navigateToURL(ADMIN_URL.getValue());
        AdminLoginPageBL steps = new AdminLoginPageBL();
        AdminCurrenciesPageBL adminCurrenciesPageBL = steps.loginAdmin()
                .clickOnSystemButton()
                .clickOnLocalizationButton()
                .clickOnCurrenciesSettingsButton()
                .clickOnAddCurrencyButton()
                .addNewCurrency();
        adminCurrenciesPageBL.checkSuccessAddingCurrency();
    }

}
