package Programmonbatch_progeam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=6r2g178sa6o01");
		Thread.sleep(20000);
		
		         WebElement usernametextbox = driver.findElement(By.name("username"));
		         if(usernametextbox.isDisplayed())
		         {
		        	 usernametextbox.sendKeys("admin");
		        }
		         else
		         {
		        	 System.out.println("not displyed");
		         }
		       
		           WebElement passwordtextfeild = driver.findElement(By.name("pwd"));
		           if ( passwordtextfeild .isDisplayed()) {
		        	   
		        	   passwordtextfeild.sendKeys("manager");
		           }
		           else {
					      System.out.println("not foud");
				}
		           
		          Thread.sleep(2000);
		          usernametextbox.clear();
		          Thread.sleep(20000);
		          passwordtextfeild.clear();
		          driver.close();
		          
		        	  
					
				
		           
		         
		     
		             
		
	}

}
