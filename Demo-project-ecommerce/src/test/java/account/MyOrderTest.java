package account;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyOrderTest extends BaseTest {

    @Test
    public void myOrderTest(){
        homePage.clickAccountButton();
        var costumerLoginPage = homePage.clickMyAccountLink();
        costumerLoginPage.setEmailField("qatesting5@gmail.com");
        costumerLoginPage.setPasswordField("123456");
        var myAccountPage = costumerLoginPage.clickLoginButton();
        var myOrderPage = myAccountPage.clickMyOrdersLink();
        myOrderPage.checkOrdersNumberIsDisplayed();
        assertEquals(myOrderPage.verifyStatus(),"Pending", "Status incorrect");
        var orderPage = myOrderPage.clickViewOrderPage();
        orderPage.clickPrintOrder();
        orderPage.switchWindow();
        orderPage.verifyOrderIsDisplayed();
        orderPage.clickCloseWindowButton();

    }
}
