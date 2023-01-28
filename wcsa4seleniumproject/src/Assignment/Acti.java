package Assignment;

import javax.swing.text.PasswordView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=qj97d7r5dhis");
		driver.manage().window().maximize();
		            WebElement usernametextbox = driver.findElement(By.name("username"));
		            
		            if (usernametextbox.isDisplayed()) {
		            	  
		            	usernametextbox.sendKeys("admin");
					}
		            else {
						   System.out.println("not displayed");
						   
					}
		                    WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		                    
		                    if (passwordtextfield.isDisplayed()) {
		                    	passwordtextfield.sendKeys("manager");
		                    	}
		                    else {
								System.out.println("not displaled");
							}
		             
		                    Thread.sleep(2000);
		                    usernametextbox.clear();
		                    Thread.sleep(2000);
		                    passwordtextfield.clear();
		                    driver.close();
		                    
		                    
		         
	}

}
