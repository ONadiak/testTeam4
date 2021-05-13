package com.opencart.steps;

import com.opencart.containers.NavigationBarProductsContainer;
import com.opencart.containers.WishListProductsContainer;
import com.opencart.pages.NavigationBarPage;
import org.jsoup.select.Collector;
import org.testng.Assert;

import java.util.stream.Collectors;

public class NavigationBarPageBL extends WishListPageBL {


    private NavigationBarPage navigationBarPage;


    public NavigationBarPageBL() {
        navigationBarPage = new NavigationBarPage();
    }


    public NavigationBarPageBL addProductToTheWishList() {
        clickOnDesktopsButton();
        clickOnShowAllDesktops();
        addProductsToWishList("Apple Cinema 30\"");
        addProductsToWishList("Canon EOS 5D");
        addProductsToWishList("HP LP3065");
        addProductsToWishList("Palm Treo Pro");
        addProductsToWishList("iPhone");
        addProductsToWishList("iPod Classic");

        return this;
    }



    public void clickOnDesktopsButton() {
        navigationBarPage.getDesktopsButton().click();
    }

    public void clickOnShowAllDesktops() {
        navigationBarPage.getShowAllDesktops().click();
    }



    public void addProductsToWishList(String productName) {
        System.out.println(navigationBarPage.getNavigationBarProducts().stream().map(e -> e.getProductsName().getText()).collect(Collectors.toList()));
        NavigationBarProductsContainer navigationBarProductsContainer = navigationBarPage.getNavigationBarProducts().stream()
                .filter(e -> e.getProductsName().getText().replaceAll("\n", "").trim().equals(productName))
                .findFirst()
                .get();
        navigationBarProductsContainer.getWishListButton().click();

    }
}





