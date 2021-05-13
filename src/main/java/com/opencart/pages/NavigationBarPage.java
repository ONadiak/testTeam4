package com.opencart.pages;

import com.opencart.containers.NavigationBarProductsContainer;
import com.opencart.containers.WishListProductsContainer;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;


public class NavigationBarPage extends BasePage {


    @FindBy(xpath = ".//*[@id='menu']")
    private WebElement navigationBar;


   @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/a")
   private WebElement desktopsButton;


    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[1]/div/div/ul/li[2]/a")
    private WebElement macButton;

    @FindBy(xpath = "./html/body/div[1]/nav/div[2]/ul/li[1]/div/a")
    private WebElement showAllDesktops;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[2]/i")
    private WebElement addToWishListButton;



    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/a")
    private WebElement laptopsAndNotebooks;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[2]/div/a")
    private WebElement showAllLaptopsAndNotebooksButton;

    @FindBy(xpath = ".//*[@id='content']/div[4]/div[1]/div/div[2]/div[2]/button[2]/i")
    private WebElement addToWishListButton1;



    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/a")
    private WebElement componentsButton;

    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")
    private WebElement monitorsButton;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[2]/i")
    private WebElement addToWishListButton2;

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[2]/div/div[2]/div[2]/button[2]")
    private WebElement addToWishListButton3;



    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[4]/a")
    private WebElement tabletsButton;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[2]")
    private WebElement addToWishListButton4;



    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[6]/a")
    private WebElement phonesPDAsButton;


    @FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]")
    private WebElement addToWishListButton5;



    @FindBy(xpath = ".//*[@id='menu']/div[2]/ul/li[7]/a")
    private WebElement camerasButton;


    @FindBy(xpath = ".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]/i")
    private WebElement addToWishListButton6;


    public WebElement getNavigationBar() {
        return navigationBar;
    }

    public WebElement getDesktopsButton() {
        return desktopsButton;
    }

    public WebElement getMacButton() {
        return macButton;
    }

    public WebElement getShowAllDesktops() {
        return showAllDesktops;
    }

    public WebElement getAddToWishListButton() {
        return addToWishListButton;
    }

    public WebElement getLaptopsAndNotebooks() {
        return laptopsAndNotebooks;
    }

    public WebElement getShowAllLaptopsAndNotebooksButton() {
        return showAllLaptopsAndNotebooksButton;
    }


    public WebElement getAddToWishListButton1() {
        return addToWishListButton1;
    }

    public WebElement getComponentsButton() {
        return componentsButton;
    }

    public WebElement getMonitorsButton() {
        return monitorsButton;
    }


    public WebElement getAddToWishListButton2() {
        return addToWishListButton2;
    }


    public WebElement getAddToWishListButton3() {
        return addToWishListButton3;
    }

    public WebElement getTabletsButton() {
        return tabletsButton;
    }


    public WebElement getAddToWishListButton4() {
        return addToWishListButton4;
    }

    public WebElement getPhonesPDAsButton() {
        return phonesPDAsButton;
    }


    public WebElement getAddToWishListButton5() {
        return addToWishListButton5;
    }

    public WebElement getCamerasButton() {
        return camerasButton;
    }


    public WebElement getAddToWishListButton6() {
        return addToWishListButton6;
    }


    @FindBy(xpath = ".//*[@class='product-thumb']")
    private List<WebElement> navigationBarProductList;

    public List<NavigationBarProductsContainer> getNavigationBarProducts() {
        return navigationBarProductList.stream()
                .map(NavigationBarProductsContainer::new)
                .collect(Collectors.toList());
    }
}