package sonyxperia;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest {

    @Test
    public void cartTests() {
        var mobilePage = homePage.clickMobilePage();
        var cartPage = mobilePage.addSonyXperiaToCart();
        cartPage.clearQtyField();
        cartPage.setQtyField("1000");
        cartPage.clickUpdateButton();
        assertEquals(cartPage.getErrorMessage()
                ,"Some of the products cannot be ordered in requested quantity."
                , "Incorrect error message");
        cartPage.clickEmptyCartButton();
        assertEquals(cartPage.getPageTitle(),"SHOPPING CART IS EMPTY"
                , "Page Title incorrect");
    }
}
