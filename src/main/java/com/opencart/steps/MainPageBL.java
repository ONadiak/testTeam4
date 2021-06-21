
package com.opencart.steps;

import com.opencart.Data.DataForTests;
import com.opencart.PageObjects.BasePage;
import com.opencart.PageObjects.MainPage;
import com.opencart.PageObjects.SearchPage;

public class MainPageBL extends BasePage {

   private MainPage mainPage;
   private DataForTests dataForTests;
   public MainPageBL(){
       mainPage = new MainPage();
       dataForTests = new DataForTests();

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

