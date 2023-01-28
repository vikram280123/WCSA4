package qsp;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/login");
         driver.getTitle();
             String gettitle = driver.getTitle();
             System.out.println(gettitle );
             driver.getPageSource();
               String getpagesource = driver.getPageSource();
               System.out.println(getpagesource);

	}

}
