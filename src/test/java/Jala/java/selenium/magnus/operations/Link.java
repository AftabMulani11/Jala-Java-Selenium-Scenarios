package Jala.java.selenium.magnus.operations;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Set;

public class Link {
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
        driver.findElement(By.xpath("//span[@class='checkmark']")).click();
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest1() throws InterruptedException {
        /*
        Clicking a link using partialLinkText
        */
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Links']")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Link 1")).click();
        Thread.sleep(1000);
        Set<String> win= driver.getWindowHandles();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest2() throws InterruptedException {
        /*
        Clicking a link using link Text
        */
        Thread.sleep(1000);
        driver.findElement(By.linkText("Link 2")).click();
        Thread.sleep(1000);
    }
    @Test (priority = 6)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}