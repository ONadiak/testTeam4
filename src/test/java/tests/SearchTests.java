package tests;

import com.opencart.Data.DataForTests;
import com.opencart.Navigation.Navigation;
import com.opencart.steps.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class SearchTests extends WebDriverSettings{

   @Test
    public void checkCorrectProductSearch()  {
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .enterDataIntoSearchField(DataForTests.validDataForSearchTests)
                .checkSuccessSearch();
    }

    @Test
    public void checkWrongProductNameSearch(){
       new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .enterDataIntoSearchField(DataForTests.invalidDataForSearchTests)
                .checkFailSearch();

    }

   @Test
    public void checkCorrectProductAndCorrectCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseDekstopCategoryAndEnterProductToSearch(DataForTests.validDataForSearchTests)
                .checkSuccessSearch();
    }
    @Test
    public void checkCorrectProductButWrongCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseLaptopsAndNotebooksCategoryAndEnterProductToSearch(DataForTests.validDataForSearchTests)
                .checkFailSearch();
    }
    @Test
    public void checkWrongProductButCorrectCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseDekstopCategoryAndEnterProductToSearch(DataForTests.invalidDataForSearchTests)
                .checkFailSearch();

    }
    @Test
    public void checkWrongProductAndWrongCategories(){
        new Navigation().navigateToURL(BASE_URL.getValue());
        SearchPageBL searchPageBL = stepsPage.getMainPageBL()
                .clickOnSearchButton()
                .chooseLaptopsAndNotebooksCategoryAndEnterProductToSearch(DataForTests.invalidDataForSearchTests)
                .checkFailSearch();

    }
}
