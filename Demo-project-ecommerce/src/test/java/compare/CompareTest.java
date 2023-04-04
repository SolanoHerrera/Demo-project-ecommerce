package compare;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareTest extends BaseTest {

    @Test
    public void compareTests(){
        var mobilePage = homePage.clickMobilePage();
        mobilePage.addCompareIphone();
        mobilePage.addCompareSony();
        mobilePage.clickCompareButton();
        mobilePage.switchWindow();
        assertEquals(mobilePage.getTextMobile1(),"SONY XPERIA","Title Incorrect");
        System.out.println("Mobile 1: " + mobilePage.getTextMobile1());
        assertEquals(mobilePage.getTextMobile2(),"IPHONE","Title Incorrect");
        System.out.println("Mobile 2: " + mobilePage.getTextMobile2());
        mobilePage.closePopUp();
    }
}
