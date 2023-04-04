package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

    private WebDriver driver;
    private By addressField = By.id("billing:street1");
    private By cityField = By.id("billing:city");
    private By stateDropDown = By.id("billing:region_id");
    private By zipField = By.id("billing:postcode");
    private By countryDropDown = By.id("billing:country_id");
    private By telephoneField = By.id("billing:telephone");
    private By billingAddressContinueButton = By.xpath("//button[@onclick=\"billing.save()\"]/span/span");
    private By shippingMethodContinueButton = By.xpath("//button[@onclick=\"shippingMethod.save()\"]");
    private By check_MoneyOrderRadioButton = By.id("p_method_checkmo");
    private By paymentInformationContinueButton = By.xpath("//button[@onclick=\"payment.save()\"]");
    private By placeOrderButton = By.xpath("//button[@title=\"Place Order\"]");
    private By orderReceivedMessage = By.xpath("//div[@class=\"page-title\"]/h1");
    private By purchaseOrderNumber = By.xpath("//div[@class=\"col-main\"]/p[1]/a");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void setCityField(String city){
        driver.findElement(cityField).sendKeys(city);
    }
    public Select findStateDropDown(){
        return new Select(driver.findElement(stateDropDown));
    }
    public void selectStateOption(String option){
        findStateDropDown().selectByVisibleText(option);
    }
    public void setZipField(String zip){
        driver.findElement(zipField).sendKeys(zip);
    }
    public Select findCountryDropDown(){
        return new Select(driver.findElement(countryDropDown));
    }
    public void selectCountryOption(String option){
        findCountryDropDown().selectByVisibleText(option);
    }
    public void setTelephoneField(String telephone){
        driver.findElement(telephoneField).sendKeys(telephone);
    }
    public void clickBillingAdressContinueButton(){
        driver.findElement(billingAddressContinueButton).click();
    }
    public void clickShippingMethodContinueButton(){
        driver.findElement(shippingMethodContinueButton).click();
    }
    public void selectCheck_MoneyOrderRadioButton(){
        driver.findElement(check_MoneyOrderRadioButton).click();
    }
    public void clickPaymentInformationContinueButton(){
        driver.findElement(paymentInformationContinueButton).click();
    }
    public void clickPlaceOrderButton(){
        driver.findElement(placeOrderButton).click();
    }
    public String checkOrderReceivedMessage(){
        return driver.findElement(orderReceivedMessage).getText();
    }
    public String getPurchaseOrderNumber(){
        return driver.findElement(purchaseOrderNumber).getText();
    }
}
