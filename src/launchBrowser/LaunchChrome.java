package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChrome {

	
		public static void main(String[] args) throws InterruptedException {
		

//		Launch Chrome	
		WebDriver driver = new ChromeDriver();
		
		//webDriver is coming Selenium & should contain webDriver. //video:3:20

		/*Q. what is the purpose ogf making another object when you already have Scanner?
 * 
 * When we create an object of Web Driver, we are using the Polymorphism concept.
 * The first rule of polymorphism is inheritance. ChromeDriver is the Class extends to the parent Class(WebDRiver)
 * actually it is not extending, its implementing because the WebDriver is the Interface. if you hover Webdriver, 
 * it says 'I' fir interface and ChromeDrive says'C' Class.	so this is the polymorphism concept with the reference 
 * of super class or parent class,for which we create an object of the child class. so all the common methods
 * of WebDriver is used over ChromeDriver.
	*/		
			

//		fetch website	
		driver.get("https://www.google.com/");	
		
// 		Maximize Browser	
		driver.manage().window().maximize();//asking the driver to manage the window to maximize it	
		
//		Type Selenium
		driver.findElement(By.name("q")).sendKeys("Selenium");	
	
		Thread.sleep(3000);
	
//		Close Browser
		driver.close();
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
