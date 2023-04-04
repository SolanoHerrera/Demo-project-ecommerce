package sonyxperia;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SonyXperiaTest extends BaseTest {

    @Test
    public void SonyXperiaTests(){
        var mobilePage = homePage.clickMobilePage();
        assertEquals(mobilePage.getPriceSonyXperia(), "$100.00", "Price Incorrect");
        mobilePage.printSonyXperiaPrice();
        var sonyXperiaPage = mobilePage.clickSonyXperiaLink();
        assertEquals(mobilePage.getPriceSonyXperia(),sonyXperiaPage.verifyPriceSonyXperia());
    }
}
