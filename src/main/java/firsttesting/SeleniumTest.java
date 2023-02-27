package firsttesting;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class SeleniumTest {
     //public static void main(String[] args) throws Exception {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://gobeyond-dev.mytens.id/login");
        driver.findElement(new By.ById("input-nik-email")).sendKeys("helloworld@gmail.com");
        driver.findElement(new By.ById("input-password")).sendKeys("3044awdawdaw");
        driver.findElement(new By.ByTagName("button")).click();
        // takeSnapShot(driver);
        driver.quit();
    }

    public static void takeSnapShot(WebDriver webdriver) throws Exception{
        File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile, new File("/Users/muhammadriduwan4747/Documents/OPium/screenshot.png"));
    }

}
