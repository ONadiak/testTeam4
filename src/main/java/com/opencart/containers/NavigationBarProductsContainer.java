package com.opencart.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationBarProductsContainer extends BasePage {

    private WebElement webElement;

    public NavigationBarProductsContainer(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getProductsName() {
        return webElement.findElement(By.xpath(".//h4//*[contains(@href,'product')]"));
    }

    public WebElement getWishListButton() {
        return webElement.findElement(By.xpath(".//i[@class='fa fa-heart']"));
    }

}
