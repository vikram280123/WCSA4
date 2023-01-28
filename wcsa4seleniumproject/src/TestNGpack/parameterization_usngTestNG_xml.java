package TestNGpack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parameterization_usngTestNG_xml {
 public static WebDriver driver;
 @Test
 public void Rediff() {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Browser is an input
		driver.manage().window().maximize();
		driver.get("https://Rediff.com");
				driver.findElement(By.className("signin")).click();
				driver.findElement(By.id("loginl")).sendKeys("Seleniumpanda@rediffmail.com");
				driver.findElement(By.id("password")).sendKeys("selenium@123");
				driver.findElement(By.className("signinbtn")).click();
 }
}
