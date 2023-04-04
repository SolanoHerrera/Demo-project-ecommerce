package purchase;

import base.BaseTest;
import org.apache.commons.mail.Email;
import org.testng.annotations.Test;

public class ReOrderTest extends BaseTest {

    @Test
    public void reOrderTest(){
        homePage.clickAccountButton();
        var costumerLoginPage = homePage.clickMyAccountLink();
        costumerLoginPage.setEmailField("qatesting5@gmail.com");
        costumerLoginPage.setPasswordField("123456");
        var myAccountPage = costumerLoginPage.clickLoginButton();
        var myOrderPage = myAccountPage.clickMyOrdersLink();
        var cartPage = myOrderPage.clickReorderLink();
        cartPage.clearQtyField();
        cartPage.setQtyField("3");
        cartPage.clickUpdateButton();
        cartPage.selectCountryOption("United States");
        cartPage.selectStateOption("New York");
        cartPage.setZipField("542896");
        cartPage.clickEstimateButton();
        cartPage.selectShippingRadioButton();
        cartPage.clickUpdateTotal();
        var checkOutPage = cartPage.clickProceedToCheckOut();
        checkOutPage.clickBillingAdressContinueButton();
        checkOutPage.clickShippingMethodContinueButton();
        checkOutPage.selectCheck_MoneyOrderRadioButton();
        checkOutPage.clickPaymentInformationContinueButton();
        checkOutPage.clickPlaceOrderButton();
        System.out.println("Order number: " + checkOutPage.getPurchaseOrderNumber());
    }
}
