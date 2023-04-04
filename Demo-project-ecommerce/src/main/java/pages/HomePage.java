package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private By mobileLink = By.linkText("MOBILE");
    private By homePageTitle = By.className("page-title");
    private By accountButton = By.xpath("//*[@id='header']/div/div[2]/div/a/span[2]");
    private By myAccountLink = By.linkText("MY ACCOUNT");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String verifyHomePageTitle(){
        return driver.findElement(homePageTitle).getText();
    }

    public MobilePage clickMobilePage(){
        driver.findElement(mobileLink).click();
        return new MobilePage(driver);
    }
    public void clickAccountButton(){
        driver.findElement(accountButton).click();
    }
    public CustomerLoginPage clickMyAccountLink(){
        driver.findElement(myAccountLink).click();
        return new CustomerLoginPage(driver);
    }
}
