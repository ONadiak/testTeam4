package com.opencart.steps;

import com.opencart.Data.DataForTests;
import com.opencart.PageObjects.BasePage;
import com.opencart.PageObjects.SearchPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SearchPageBL extends BasePage {

    private SearchPage searchPage;
    public SearchPageBL () {
        searchPage = new SearchPage();
    }

    public SearchPageBL checkSuccessSearch()  {
        wait.until(ExpectedConditions.visibilityOf(searchPage.getCheckIsSamsungAdded()));
        Assert.assertEquals(searchPage.getCheckIsSamsungAdded().getText(), DataForTests.samsungToCheck);
        return this;
    }

    public SearchPageBL checkFailSearch(){
        wait.until(ExpectedConditions.visibilityOf(searchPage.getNothingSearchedToCheck()));
        Assert.assertEquals(searchPage.getNothingSearchedToCheck().getText(),DataForTests.failSearchingCheck );
        return this;
    }

    public SearchPageBL chooseDekstopCategoryAndEnterProductToSearch(String productToSearch){
        searchPage.getInputSearchField().sendKeys(productToSearch);
        searchPage.getChooseCategoriesButton().click();
        searchPage.getDesktopCategory().click();
        searchPage.getSearchButton().click();
        return this;
    }

    public SearchPageBL chooseLaptopsAndNotebooksCategoryAndEnterProductToSearch(String productToSearch){
        searchPage.getInputSearchField().sendKeys(productToSearch);
        searchPage.getChooseCategoriesButton().click();
        searchPage.getLaptopsAndNotebooksCategory().click();
        searchPage.getSearchButton().click();
        return this;
    }






}
