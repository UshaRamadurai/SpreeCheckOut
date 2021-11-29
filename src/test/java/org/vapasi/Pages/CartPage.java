package org.vapasi.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(css = "[data-hook='cart_item_total']")
    private WebElement cartTotal;
    @FindBy(id="checkout-link")
    private WebElement checkOutBtn;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getCartValue() {
        String cartTotalValue = cartTotal.getText();
        return cartTotalValue;
    }
    public void clickCheckOut(){

        checkOutBtn.click();
    }
}
