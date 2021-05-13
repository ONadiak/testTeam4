package com.opencart.steps;

import com.opencart.containers.WishListProductsContainer;
import com.opencart.pages.HeaderPage;
import com.opencart.pages.WishListPage;


public class WishListPageBL {

    private WishListPage wishListPage;


    public WishListPageBL() {
        wishListPage = new WishListPage();
    }

    public WishListPageBL testingWishList() {
        removeProductByName("Apple Cinema 30\"");
        removeProductByName("Canon EOS 5D");
        removeProductByName("HP LP3065");
        removeProductByName("Palm Treo Pro");
        removeProductByName("iPhone");
        addProductByName("iPod Classic");

        return this;
    }

    public HeaderPage getHeaderPageBL() {
        return getHeaderPageBL();
    }


    public void removeProductByName(String productName) {
        WishListProductsContainer wishListProductsContainer = wishListPage.getWishListProducts().stream()
                .filter(e -> e.getProductName().getText().equals(productName))
                .findFirst()
                .get();
        wishListProductsContainer.getRemoveButton().click();

    }

    public void addProductByName(String productName) {
        WishListProductsContainer wishListProductsContainer = wishListPage.getWishListProducts().stream()
                .filter(e -> e.getProductName().getText().replaceAll("\n", "").trim().equals(productName))
                .findFirst()
                .get();
        wishListProductsContainer.getAddToCartButton().click();
    }


}
