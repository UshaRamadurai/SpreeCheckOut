package org.vapasi.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {
    @FindBy(name = "commit")
    private WebElement buttonSaveAndContinue;

    public DeliveryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickSaveAndContinue(){
        buttonSaveAndContinue.click();
    }
}
