package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MobilePage {

    private WebDriver driver;
    private By sortByDropDown = By.xpath("//select[@title='Sort By']");
    private By sonyXperiaPrice = By.id("product-price-1");
    private By sonyXperiaLink = By.linkText("SONY XPERIA");
    private By sonyXperiaAddCartButton = By.xpath
            ("//html[@id='top']/body/div/div/div[2]/div/div[2]/div/div[3]/ul/li[3]/div/div[3]/button");
    private By iphoneAddCartButton = By.xpath
            ("//html[@id='top']/body/div/div/div[2]/div/div[2]/div/div[3]/ul/li[3]/div/div[3]/button/span/span");
    private By iphoneAddCompareButton = By.xpath
            ("//html[@id='top']/body/div/div/div[2]/" +
                    "div/div[2]/div/div[3]/ul/li[3]/div/div[3]/button/span/span");
    private By sonyxAddCompareButton = By.xpath
            ("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a");
    private By compareButton = By.xpath
            ("//button[@title='Compare']");
    private By popUpMobile1 = By.linkText("SONY XPERIA");
    private By popUpMobile2 = By.linkText("IPHONE");
    private By closeWindowButton = By.xpath("//button[@title='Close Window']");

    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    public Select findDropDownElement(){
        return new Select(driver.findElement(sortByDropDown));
    }
    public void selectOption(String Option){
        findDropDownElement().selectByVisibleText(Option);
    }
    public String getPriceSonyXperia(){
       return driver.findElement(sonyXperiaPrice).getText();
    }
    public void printSonyXperiaPrice(){
        System.out.println("Sony Xperia price: " + getPriceSonyXperia());
    }

    public SonyXperiaPage clickSonyXperiaLink(){
        driver.findElement(sonyXperiaLink).click();
        return new SonyXperiaPage(driver);
    }
    public CartPage addSonyXperiaToCart() {
        driver.findElement(sonyXperiaAddCartButton).click();
        return new CartPage(driver);
    }
    public void addCompareIphone(){
        driver.findElement(iphoneAddCompareButton).click();
    }
    public void addCompareSony(){
        driver.findElement(sonyxAddCompareButton).click();
    }
    public void clickCompareButton(){
        driver.findElement(compareButton).click();
    }
    public void switchWindow(){
        for (String window : driver.getWindowHandles()){
            driver.switchTo().window(window);
        }
    }
    public String getTextMobile1(){
        return driver.findElement(popUpMobile1).getText();
    }
    public String getTextMobile2(){
        return driver.findElement(popUpMobile2).getText();
    }
    public void closePopUp(){
        driver.findElement(closeWindowButton).click();
    }
    public CartPage addIphoneToCart(){
        driver.findElement(iphoneAddCartButton).click();
        return new CartPage(driver);
    }

}
