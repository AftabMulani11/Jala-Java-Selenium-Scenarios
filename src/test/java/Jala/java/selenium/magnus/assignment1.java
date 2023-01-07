package Jala.java.selenium.magnus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class assignment1 {
    WebDriver driver;
    @Test(priority = 0)
    public void launch() throws InterruptedException{
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void locate() throws InterruptedException {
		driver.findElement(By.id("UserName"));
		driver.findElement(By.linkText("Admin Login"));
		driver.findElement(By.className("login-box-body"));
		driver.findElement(By.name("Password"));
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));

    }
    @Test(priority = 2)
    public void autoscript() throws InterruptedException {

    }
    @Test(priority = 3)
    public void destroy() throws InterruptedException {
        
    }
}
