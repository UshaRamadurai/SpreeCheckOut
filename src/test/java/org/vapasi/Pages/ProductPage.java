package org.vapasi.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    @FindBy(id = "quantity")
    private WebElement quantity;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void enterQuantity(String noOfProducts){
        quantity.clear();
        quantity.sendKeys(noOfProducts);
    }
    public void clickAddToCart(){
        addToCartBtn.click();
    }
}
