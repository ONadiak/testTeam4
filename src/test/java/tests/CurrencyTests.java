package tests;

import com.opencart.Navigation.Navigation;
import com.opencart.steps.HeaderPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class CurrencyTests extends WebDriverSettings {
    @Test
    public void changeCurrencyCheck() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL stepsPage = new MainPageBL();
        HeaderPageBL headerPageBL = stepsPage.getMainPageBL()
                .clickOnCurrencyButton()
                .clickOnChangeCurrencyToEuroButton();
                headerPageBL.checkCurrency();
                headerPageBL.clickOnCurrencyButton()
                .clickOnChangeCurrencyToUSDollarButton()
                .checkCurrency();
                headerPageBL.clickOnCurrencyButton()
                .clickOnChangeCurrencyToPoundButton()
                .checkCurrency();
    }

}

