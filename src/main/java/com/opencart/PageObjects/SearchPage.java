package com.opencart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy (xpath = "//input[@id='input-search']")
    private WebElement inputSearchField;

    @FindBy (xpath = "//select[@name='category_id']")
    private WebElement chooseCategoriesButton;

    @FindBy (xpath = "//option[@value = '20']")
    private WebElement dekstopsCategory;

    @FindBy (xpath = "//input[@id='button-search']")
    private WebElement searchButton;

    @FindBy (xpath = "//a[text()='Samsung SyncMaster 941BW']")
    private WebElement checkIsSamsungAdded;

    @FindBy (xpath = "//p[text()='There is no product that matches the search criteria.']")
    private WebElement nothingSearchedToCheck;

    @FindBy (xpath = "//option[@value='18']")
    private WebElement laptopsAndNotebooksCategory;

    public WebElement getInputSearchField() {
        return inputSearchField;
    }

    public WebElement getChooseCategoriesButton() {
        return chooseCategoriesButton;
    }

    public WebElement getLaptopsAndNotebooksCategory() {
        return laptopsAndNotebooksCategory;
    }

    public WebElement getDesktopCategory() {
        return dekstopsCategory;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCheckIsSamsungAdded() {
        return checkIsSamsungAdded;
    }

    public WebElement getNothingSearchedToCheck() {
        return nothingSearchedToCheck;
    }
}
