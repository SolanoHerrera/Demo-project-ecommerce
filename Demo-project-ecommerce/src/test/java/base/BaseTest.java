package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
private WebDriver driver;
protected HomePage homePage;
@BeforeClass
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("http://live.techpanda.org/index.php/");
    driver.manage().window().maximize();
    homePage = new HomePage(driver);

}
@BeforeMethod
    public void goHome(){
    driver.get("http://live.techpanda.org/index.php/");
    driver.manage().timeouts()
            .implicitlyWait(Duration.ofSeconds(10));
}

    public void tearDown(){
    driver.quit();
}

public void w(){
    driver.manage().timeouts()
            .implicitlyWait(Duration.ofSeconds(20));
}
    public void takeScreenshot() throws IOException {
        var screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot/mobilePage.png");
        FileUtils.copyFile(srcFile,destFile);
    }
}
