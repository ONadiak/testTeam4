package com.opencart.steps;

import com.opencart.Data.SearchData;
import com.opencart.PageObjects.BasePage;
import com.opencart.PageObjects.SearchPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SearchPageBL extends BasePage {
    private String samsungToCheck = "Samsung SyncMaster 941BW";
    private String failSearchingCheck = "There is no product that matches the search criteria.";

    private SearchPageBL searchPageBL;
    private SearchPage searchPage;
    private SearchData searchData;
    public SearchPageBL () {
        searchPage = new SearchPage();
    }

    public SearchPageBL checkSuccessSearch()  {
        wait.until(ExpectedConditions.visibilityOf(searchPage.getCheckIsSamsungAdded()));
        Assert.assertEquals(searchPage.getCheckIsSamsungAdded().getText(), samsungToCheck);
        return this;
    }

    public SearchPageBL checkFailSearch(){
        wait.until(ExpectedConditions.visibilityOf(searchPage.getNothingSearchedToCheck()));
        Assert.assertEquals(searchPage.getNothingSearchedToCheck().getText(),failSearchingCheck );
        return this;
    }

    public SearchPageBL chooseCategoryToSearchAndEnterProductToSearch(String productToSearch, boolean correctOrWrong){
        searchPage.getInputSearchField().sendKeys(productToSearch);
        if (correctOrWrong) {
            searchPage.getChooseCategoriesButton().click();
            searchPage.getDesktopCategory().click();
            searchPage.getSearchButton().click();
        }
        else if (!correctOrWrong) {
            searchPage.getChooseCategoriesButton().click();
            searchPage.getLaptopsAndNotebooksCategory().click();
            searchPage.getSearchButton().click();
        }
        return this;
    }



}
