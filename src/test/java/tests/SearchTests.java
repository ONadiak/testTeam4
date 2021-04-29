package tests;

import com.opencart.Data.SearchData;
import com.opencart.Navigation.Navigation;
import com.opencart.PageObjects.SearchPage;
import com.opencart.steps.SearchPageBL;
import com.opencart.steps.StepsPage;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class SearchTests extends WebDriverSettings{

   @Test
    public void checkCorrectProductSearch()  {
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .enterDataIntoSearchField(searchData.getSamsung())
                .checkSuccessSearch();
    }

    @Test
    public void checkWrongProductNameSearch(){
       new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .enterDataIntoSearchField(searchData.getSamsng())
                .checkFailSearch();

    }

   @Test
    public void checkCorrectProductAndCorrectCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseCategoryToSearchAndEnterProductToSearch(searchData.getSamsung(),true)
                .checkSuccessSearch();
    }
    @Test
    public void checkCorrectProductButWrongCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseCategoryToSearchAndEnterProductToSearch(searchData.getSamsung(),false)
                .checkFailSearch();
    }
    @Test
    public void checkWrongProductButCorrectCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseCategoryToSearchAndEnterProductToSearch(searchData.getSamsng(), true)
                .checkFailSearch();

    }
    @Test
    public void checkWrongProductAndWrongCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseCategoryToSearchAndEnterProductToSearch(searchData.getSamsng(), false)
                .checkFailSearch();

    }
}
