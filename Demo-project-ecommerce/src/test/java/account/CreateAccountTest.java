package account;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createAccountTest(){
        homePage.clickAccountButton();
        var costumerLoginPage = homePage.clickMyAccountLink();
        var createNewCostumerAccountPage = costumerLoginPage.clickCreateAccount();
        createNewCostumerAccountPage.setFirstNameField("tester");
        createNewCostumerAccountPage.setLastNameField("qa");
        createNewCostumerAccountPage.setEmailField("qatesting5@gmail.com");
        createNewCostumerAccountPage.setPasswordField("123456");
        createNewCostumerAccountPage.setConfirmPasswordField("123456");
        var myAccountPage = createNewCostumerAccountPage.clickRegisterButton();
        var tvPage = myAccountPage.clickTvLink();
        var myWishListPage = tvPage.addLgLcdToWishList();
        var whiteListSharingPage = myWishListPage.clickShareWhiteListButton();
        whiteListSharingPage.setEmailField("qatesting3118@gmail.com");
        whiteListSharingPage.clickShareWhiteListButton2();
        assertEquals(myWishListPage.getWishListConfirmationMessage(),"Your Wishlist has been shared."
                , "Confirmation message incorrect");

    }
}
