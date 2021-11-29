package org.vapasi;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.vapasi.Pages.*;

public class CheckOutTest extends BaseTest{
    @Test
    public void test() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        AddressPage addressPage = new AddressPage(driver);
        DeliveryPage deliveryPage = new DeliveryPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        loginPage.login1("test21@gmail.com","testpassword");
        homePage.clickCategory();
        homePage.clickProduct();
        productPage.enterQuantity("2");
        productPage.clickAddToCart();
        Assert.assertEquals(cartPage.getCartValue(),"$31.98");
        cartPage.clickCheckOut();
        addressPage.enterAddressDetails();
        addressPage.clickSaveAndContinue();
        deliveryPage.clickSaveAndContinue();
        paymentPage.clickCheck();
        paymentPage.clickSaveAndContinue();
        Assert.assertEquals(orderPage.verifyOrderSuccessMessage(),"Your order has been processed successfully");
    }
}
