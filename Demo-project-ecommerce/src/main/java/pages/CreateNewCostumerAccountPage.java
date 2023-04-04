package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewCostumerAccountPage {

    private WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmation");
    private By registerButton = By.xpath("//button[@title='Register']");

    public CreateNewCostumerAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setFirstNameField(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setLastNameField(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPasswordField(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public MyAccountPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new MyAccountPage(driver);
    }
}
