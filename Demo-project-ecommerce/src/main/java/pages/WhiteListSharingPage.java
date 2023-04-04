package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhiteListSharingPage {

    private WebDriver driver;
    private By emailField = By.id("email_address");
    private By shareWhiteListButton = By.xpath("//button[@title='Share Wishlist']");

    public WhiteListSharingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickShareWhiteListButton2(){
        driver.findElement(shareWhiteListButton).click();
    }
}
