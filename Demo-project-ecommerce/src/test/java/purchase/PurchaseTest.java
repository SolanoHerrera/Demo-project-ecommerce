package purchase;

import base.BaseTest;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    @Test
    public void purchaseTest() {
        homePage.clickAccountButton();
        var costumerLoginPage = homePage.clickMyAccountLink();
        costumerLoginPage.setEmailField("qatesting5@gmail.com");
        costumerLoginPage.setPasswordField("123456");
        var myAccountPage = costumerLoginPage.clickLoginButton();
        var myWishListPage = myAccountPage.clickMyWishListLink();
        var cartPage = myWishListPage.clickAddToCartButton();
        cartPage.selectCountryOption("United States");
        cartPage.selectStateOption("New York");
        cartPage.setZipField("542896");
        cartPage.clickEstimateButton();
        System.out.println("Shipping cost: " + cartPage.checkShippingCost());
        cartPage.selectShippingRadioButton();
        cartPage.clickUpdateTotal();
        cartPage.verifyShippingAtSubTotal();
        var checkOutPage = cartPage.clickProceedToCheckOut();
        checkOutPage.setAddressField("ABC");
        checkOutPage.setCityField("New York");
        checkOutPage.selectStateOption("New York");
        checkOutPage.setZipField("542896");
        checkOutPage.selectCountryOption("United States");
        checkOutPage.setTelephoneField("12345678");
        checkOutPage.clickBillingAdressContinueButton();
        checkOutPage.clickShippingMethodContinueButton();
        checkOutPage.selectCheck_MoneyOrderRadioButton();
        checkOutPage.clickPaymentInformationContinueButton();
        checkOutPage.clickPlaceOrderButton();
        System.out.println(checkOutPage.checkOrderReceivedMessage());

    }
}
