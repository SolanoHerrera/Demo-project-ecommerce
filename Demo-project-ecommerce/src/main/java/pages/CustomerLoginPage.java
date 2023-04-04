package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage {

    private WebDriver driver;
    private By createAnAccount = By.linkText("CREATE AN ACCOUNT");
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    public CustomerLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public CreateNewCostumerAccountPage clickCreateAccount (){
        driver.findElement(createAnAccount).click();
        return new CreateNewCostumerAccountPage(driver);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public MyAccountPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new MyAccountPage(driver);
    }
}
