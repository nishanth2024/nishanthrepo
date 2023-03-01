package com.testpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class At {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Thread.sleep(5000);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );	
		
		WebDriver driver = new ChromeDriver ();
		
	 driver.get("http://www.flipkart.com/");	
		driver.manage().window().maximize();
		
		WebElement ft = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		
		ft.click();
		
		WebElement p1 = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.contextClick(p1).build().perform();
		
		Robot r = new Robot ();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement nt = driver.findElement(By.xpath("//div[text()='Appliances']"));
		
		a.contextClick(nt).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> ws = driver.getWindowHandles();
		int size = ws.size();
		System.out.println(size);
		
         for(String ss : ws) {
      System.out.println( driver.switchTo().window(ss).getTitle());
         }
		
	}
}
