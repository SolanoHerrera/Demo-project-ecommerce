package purchase;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DiscountCouponTest extends BaseTest {

    @Test
    public void discountCouponTest(){
        var mobilePage = homePage.clickMobilePage();
        var cartPage = mobilePage.addIphoneToCart();
        cartPage.setCouponCode("GURU50");
        cartPage.clickApplyButton();
    assertTrue(cartPage.verifySubTotalPrice() != cartPage.verifyGrandTotalPrice());
        System.out.println("Subtotal: " + cartPage.verifySubTotalPrice());
        System.out.println("Grand total: " +cartPage.verifyGrandTotalPrice());
    }
}
