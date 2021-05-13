import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class WishListTest extends BaseTest {

    @Test
    public void checkWishlist() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        WishListPageBL wishListPageBL = mainPageBL.getNavigationBarPageBL()
                .addProductToTheWishList();
        WishListPageBL wishListPageBL1 = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton()
                .testingWishList();
        WishListPageBL wishListPageBL2 = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();

    }


}

