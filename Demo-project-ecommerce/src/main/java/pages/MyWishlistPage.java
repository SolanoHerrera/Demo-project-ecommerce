package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishlistPage {

    private WebDriver driver;
    private By shareWhiteListButton = By.xpath("//button[@title='Share Wishlist']");
    private By wishListConfirmationMessage = By.xpath
            ("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span");
    private By addToCartButton = By.xpath("//div[@class='cart-cell']/button/span/span");

    public MyWishlistPage(WebDriver driver) {
        this.driver = driver;
    }
    public WhiteListSharingPage clickShareWhiteListButton(){
        driver.findElement(shareWhiteListButton).click();
        return new WhiteListSharingPage(driver);
    }
    public String getWishListConfirmationMessage(){
        return driver.findElement(wishListConfirmationMessage).getText();
    }
    public CartPage clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
        return new CartPage(driver);
    }
}
