package tests;

import com.opencart.Navigation.Navigation;
import com.opencart.PageObjects.SearchPage;
import com.opencart.steps.RegistrationPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.StepsPage;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class FirstTest extends WebDriverSettings {



    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        StepsPage stepsPage = new StepsPage();
        RegistrationPageBL registrationPageBL = stepsPage.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registrationPageBL.checkSuccessRegistration();
    }



}
