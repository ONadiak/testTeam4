package com.opencart.steps;

import com.opencart.Data.SearchData;
import com.opencart.PageObjects.BasePage;
import com.opencart.PageObjects.MainPage;
import com.opencart.PageObjects.SearchPage;

public class MainPageBL extends BasePage {

   private MainPage mainPage;
   private SearchData searchData;
   private SearchPage searchPage;
   public MainPageBL(){
       mainPage = new MainPage();
       searchData = new SearchData();
       searchPage = new SearchPage();

   }

   public SearchPageBL enterDataIntoSearchField(String productName)  {

       mainPage.getSearchField().click();
       mainPage.getSearchField().sendKeys(productName);
       mainPage.getSearchButton().click();
       return new SearchPageBL();

   }
   public SearchPageBL clickOnSearchButton(){
       mainPage.getSearchButton().click();
       return new SearchPageBL();

   }
}
