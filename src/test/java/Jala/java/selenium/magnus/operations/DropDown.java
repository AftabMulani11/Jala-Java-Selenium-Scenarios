package Jala.java.selenium.magnus.operations;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
public class DropDown {
    WebDriver driver;
    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest() throws InterruptedException {
        /*
        Print all the options available in the dropdown
         */
        Select s = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        List<WebElement> options = s.getOptions();
        for(WebElement e : options)
        {
            System.out.println(e.getText());
        }
    }

    @Test (priority = 3)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }



}