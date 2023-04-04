package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By tvLink = By.linkText("TV");
    private By myWishListLink = By.linkText("MY WISHLIST");
    private By myOrdersLink = By.linkText("MY ORDERS");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public TvPage clickTvLink(){
        driver.findElement(tvLink).click();
        return new TvPage(driver);
    }
    public MyWishlistPage clickMyWishListLink(){
        driver.findElement(myWishListLink).click();
        return new MyWishlistPage(driver);
    }
    public MyOrdersPage clickMyOrdersLink(){
        driver.findElement(myOrdersLink).click();
        return new MyOrdersPage(driver);
    }
}
