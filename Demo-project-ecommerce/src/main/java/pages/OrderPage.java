package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private WebDriver driver;
    private By printOrderLink = By.linkText("Print Order");
    private By orderNumber = By.xpath
            ("//*[@class=\"page-print sales-order-print\"]/div/h1");
    private By closeWindowButton = By.xpath("//button[@title=\"Close Window\"]/span/span");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickPrintOrder(){
        driver.findElement(printOrderLink).click();
    }
    public void switchWindow(){
        for (String window : driver.getWindowHandles()){
            driver.switchTo().window(window);
        }
    }
    public void verifyOrderIsDisplayed(){
        driver.findElement(orderNumber).isDisplayed();
    }
    public void clickCloseWindowButton(){
        driver.findElement(closeWindowButton).click();
    }
}
