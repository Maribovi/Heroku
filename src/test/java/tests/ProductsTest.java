package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
@Test
    public void buyProduct() {
    loginPage.open();
    loginPage.login("standard_user", "secret_sauce");
    productsPage.addToCart("Sauce Labs Backpack");
    productsPage.addToCart("Sauce Labs Bike Light");
    productsPage.addToCart("Sauce Labs Onesie");
    productsPage.openCart();
}
}
