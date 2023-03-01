package com.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
 public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver ();
			driver.get("http://www.amazon.in/");
			driver.manage().window().maximize();
			
			WebElement a = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
			Actions a1 = new Actions (driver);
			Thread.sleep(10000);
			a1.contextClick(a).build().perform();
			
			Robot aa1 = new Robot ();
			aa1.keyPress(KeyEvent.VK_PAGE_DOWN);
			aa1.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(5000);
			aa1.keyPress(KeyEvent.VK_ENTER);
			aa1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			aa1.keyPress(KeyEvent.VK_ENTER);
			aa1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
			
			WebElement c = driver.findElement(By.xpath(" //a[text()='Amazon Pay']"));
			Actions c1 = new Actions (driver);
			Thread.sleep(5000);
			c1.contextClick(c).build().perform();
			Thread.sleep(5000);
			Robot cc1 = new Robot ();
			cc1.keyPress(KeyEvent.VK_PAGE_DOWN);
			cc1.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(5000);
			cc1.keyPress(KeyEvent.VK_ENTER);
			cc1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			aa1.keyPress(KeyEvent.VK_ENTER);
			aa1.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
