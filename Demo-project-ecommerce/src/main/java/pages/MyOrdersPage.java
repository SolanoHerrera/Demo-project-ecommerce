package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyOrdersPage {

    private WebDriver driver;
    private By ordersNumber = By.xpath("//td[@class=\"number\"]");
    private By status = By.xpath("//td[@class=\"status\"]");
    private By viewOrderLink = By.linkText("VIEW ORDER");
    private By orderPrintNumber = By.xpath
            ("//*[@class=\"page-print sales-order-print\"]/div/h1");
    private By reOrderLink = By.linkText("REORDER");


    public MyOrdersPage(WebDriver driver) {
        this.driver = driver;
    }
    public void checkOrdersNumberIsDisplayed(){
        driver.findElement(ordersNumber).isDisplayed();
    }
    public String verifyStatus(){
       return driver.findElement(status).getText();
    }
    public OrderPage clickViewOrderPage(){
        driver.findElement(viewOrderLink).click();
        return new OrderPage(driver);
    }
    public CartPage clickReorderLink(){
        driver.findElement(reOrderLink).click();
        return new CartPage(driver);
    }
}
