package com.tessting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("window.chrome.driver", "C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver (); 
		
	driver.get("http://www.amazon.in/");	
		
		driver.manage().window().maximize();
		
		WebElement ft = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		
		Actions a = new Actions (driver);
		
		a.contextClick(ft).build().perform();
		
		Robot b = new Robot ();
		Thread.sleep(5000);
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement ff = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		a.contextClick(ff).build().perform();
		
		b.keyPress(KeyEvent.VK_PAGE_DOWN);
		b.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		Set<String> ws = driver.getWindowHandles();
//		int size = ws.size();
//		System.out.println(size);
//		System.out.println();
//		for(String s : ws) {
//			System.out.println(driver.switchTo().window(s).getTitle());
//		}
		
		/*Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in
		Help - Amazon Customer Service*/

		String com = "Help - Amazon Customer Service";
		Thread.sleep(5000);
		
		for(String s : ws) {
			if(driver.switchTo().window(s).getTitle().equals(com)) {
				break;	
			}
			
		}
		
		Thread.sleep(5000);
		
		String z ="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for(String s : ws) {
			if(driver.switchTo().window(s).getTitle().equals(z)) {
				break;
			}
			
		}
		
		Thread.sleep(5000);
		
		String n ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		for(String s : ws) {
			if(driver.switchTo().window(s).getTitle().equals(n)) {
				break;	
			}
			
		}
		
	}
}
