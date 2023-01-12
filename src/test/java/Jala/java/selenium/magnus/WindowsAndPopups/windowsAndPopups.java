package Jala.java.selenium.magnus.WindowsAndPopups;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
public class windowsAndPopups {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test (priority = 11)
    public void destroy () throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}