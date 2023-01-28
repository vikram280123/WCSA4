package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=qj97d7r5dhis");
		driver.manage().window().maximize();
	      Thread.sleep(4000);
	              WebElement usernameTextfield = driver.findElement(By.name("username"));
	              usernameTextfield.sendKeys("admin");
	              System.out.println(usernameTextfield);
	              Thread.sleep(4000);
	              driver.close();
	}

}
