package com.opencart.pages;

import com.opencart.containers.WishListProductsContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;


public class WishListPage extends BasePage {


    @FindBy(xpath = ".//*[@class = 'table-responsive']//tbody/tr")
    private List<WebElement> wishListProductList;


    public List<WishListProductsContainer> getWishListProducts() {
        return wishListProductList.stream()
                .map(WishListProductsContainer::new)
                .collect(Collectors.toList());
    }




}
