package com.opencart.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListProductsContainer extends BasePage {

   private WebElement webElement;

    public WishListProductsContainer(WebElement webElement) {
        this.webElement = webElement;
    }


    public WebElement getProductName() {
        return webElement.findElement(By.xpath(".//*[@class='text-left']//*[contains(@href,'product')]"));
    }

    public WebElement getRemoveButton() {
        return webElement.findElement(By.xpath(".//*[@data-original-title='Remove']"));
    }
    public WebElement getAddToCartButton() {
        return webElement.findElement(By.xpath(".//*[@data-original-title='Add to Cart']"));
    }

}
