package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TvPage {

    private WebDriver driver;
    private By lgLcdAddWishList = By.xpath
            ("//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a");

    public TvPage(WebDriver driver) {
        this.driver = driver;
    }
    public MyWishlistPage addLgLcdToWishList(){
        driver.findElement(lgLcdAddWishList).click();
        return new MyWishlistPage(driver);
    }
}
