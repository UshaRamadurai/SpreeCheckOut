package org.vapasi.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(linkText ="Bags")
    private WebElement category;

    @FindBy(css = "[title='Ruby on Rails Tote']")
    private WebElement product;

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void clickCategory() {
        category.click();
    }
    public void clickProduct(){
        product.click();
    }

}
