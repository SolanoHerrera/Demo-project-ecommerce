package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    private WebDriver driver;
    private By qtyField = By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input");
    private By updateButton = By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/button");
    private By errorMessage = By.xpath("//html/body/div/div/div[2]/div/div/div/ul/li/ul/li");
    private By emptyCartButton = By.xpath("//*[@id='shopping-cart-table']/tfoot/tr/td/button[2]");
    private By pageTitle = By.xpath("//html/body/div/div/div[2]/div/div/div");
    private By countryDropDown = By.id("country");
    private By stateDropDown = By.id("region_id");
    private By zipField = By.id("postcode");
    private By estimateButton = By.xpath("//div[@class='buttons-set']/button/span/span");
    private By shippingCost = By.xpath("//label[@for='s_method_flatrate_flatrate']/span");
    private By shippingRadioButton = By.id("s_method_flatrate_flatrate");
    private By updateTotalButton = By.xpath("//button[@title='Update Total']/span/span");
    private By shippingAtSubTotal = By.xpath
            ("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[1]");
    private By proceedToCheckOutButton = By.xpath
            ("//ul[@class='checkout-types bottom']/li/button/span/span");
    private By couponField = By.id("coupon_code");
    private By applyButton = By.xpath("//button[@value=\"Apply\"]/span/span");
    private By subTotalPrice = By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tbody/tr/td[2]/span");
    private By grandTotalPrice = By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot" +
            "/tr/td[2]/strong/span");



    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearQtyField(){
        driver.findElement(qtyField).clear();
    }
    public void setQtyField(String qty){
        driver.findElement(qtyField).sendKeys(qty);
    }
    public void clickUpdateButton(){
        driver.findElement(updateButton).click();
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
    public void clickEmptyCartButton(){
        driver.findElement(emptyCartButton).click();
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }
    public Select findCountryDropDownElement() {
        return new Select(driver.findElement(countryDropDown));
    }
    public void selectCountryOption(String option){
        findCountryDropDownElement().selectByVisibleText(option);
    }
    public Select findStateDropDownElement() {
        return new Select(driver.findElement(stateDropDown));
    }
    public void selectStateOption(String option) {
        findStateDropDownElement().selectByVisibleText(option);
    }
    public void setZipField(String zip){
        driver.findElement(zipField).sendKeys(zip);
    }
    public void clickEstimateButton(){
        driver.findElement(estimateButton).click();
    }
    public String checkShippingCost(){
        return driver.findElement(shippingCost).getText();
    }
    public void selectShippingRadioButton(){
        driver.findElement(shippingRadioButton).click();
    }
    public void clickUpdateTotal(){
        driver.findElement(updateTotalButton).click();
    }
    public boolean verifyShippingAtSubTotal(){
        return driver.findElement(shippingAtSubTotal).isDisplayed();
    }
    public CheckOutPage clickProceedToCheckOut(){
        driver.findElement(proceedToCheckOutButton).click();
        return new CheckOutPage(driver);
    }
    public void setCouponCode(String couponCode){
        driver.findElement(couponField).sendKeys(couponCode);
    }
    public void clickApplyButton(){
        driver.findElement(applyButton).click();
    }
    public String verifySubTotalPrice(){
        return driver.findElement(subTotalPrice).getText();
    }
    public String verifyGrandTotalPrice(){
        return driver.findElement(grandTotalPrice).getText();
    }
}
