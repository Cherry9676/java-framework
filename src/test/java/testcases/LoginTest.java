package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	public static WebDriver driver;
	
    @Test
    public void testValidLogin() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By username = By.xpath("//input[@placeholder='Username']");
	    By password = By.xpath("//input[@placeholder='Password']");
	    By loginButton = By.xpath("//button[@type='submit']");
	    driver.findElement(username).sendKeys("Admin");
	    driver.findElement(password).sendKeys("admin123");
	    driver.findElement(loginButton).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
    }
}

