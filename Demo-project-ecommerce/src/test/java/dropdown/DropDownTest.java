/*

Test Steps
Step 1. Goto http://live.techpanda.org/
Step 2. Verify Title of the page
Step 3. Click on �MOBILE� menu
Step 4. Verify Title of the page
Step 5. In the list of all mobile , select �SORT BY� dropdown as �name�
Step 6. Verify all products are sorted by name
*/

package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() throws IOException {
        assertEquals(homePage.verifyHomePageTitle(), "THIS IS DEMO SITE FOR   "
                , "Home Page Title Incorrect");
        var mobileHomePage = homePage.clickMobilePage();
        mobileHomePage.selectOption("Name");
        takeScreenshot();
    }
}