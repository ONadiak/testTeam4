package tests;

import com.opencart.Navigation.Navigation;
import com.opencart.steps.HeaderPageBL;
import com.opencart.steps.RegistrationPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class FirstTest extends WebDriverSettings {


    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToURL(BASE_URL.getValue());
        MainPageBL stepsPage = new MainPageBL();
        RegistrationPageBL registrationPageBL = stepsPage.getMainPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registrationPageBL.checkSuccessRegistration();
    }






}
