package com.windowhandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		Thread.sleep(10000);
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
		
		WebElement b = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		Actions b1 = new Actions (driver);
		Thread.sleep(5000);
		b1.contextClick(b).build().perform();
		Thread.sleep(5000);
		Robot bb1 = new Robot ();
		bb1.keyPress(KeyEvent.VK_PAGE_DOWN);
		bb1.keyRelease(KeyEvent.VK_PAGE_DOWN);               
		Thread.sleep(5000);
		bb1.keyPress(KeyEvent.VK_ENTER);
		bb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
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
		
		//Thread.sleep(5000);
		//Set<String> whs2 = driver.getWindowHandles();
		/*int size = whs.size();
		System.out.println(size);
		Thread.sleep(5000);*/                                                          
		/*String wh= driver.getWindowHandle();
		System.out.println(wh);
		Thread.sleep(5000);
		System.out.println("\nlist of all window names");
		Set<String> whs2 = driver.getWindowHandles();
		for(String cc : whs2) {
			String title = driver.switchTo().window(cc).getTitle();
			System.out.println(title);
			}
	System.out.println("-----------------------------------------------------------------------------");*/
		
		//Set<String> whs3 = driver.getWindowHandles();
		/*Thread.sleep(5000); 
		for(String cc : whs2) {
			if(!cc.equals(wh)) {
		driver.switchTo().window(cc).close();
			}
	}*/
		Thread.sleep(5000);
		Set<String> whs2 = driver.getWindowHandles();
		String e = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";	
		for(String cc : whs2) {
			if(driver.switchTo().window(cc).getTitle().equals(e)) {
				Thread.sleep(10000);
			TakesScreenshot tc = (TakesScreenshot) driver;
				File ss = tc.getScreenshotAs(OutputType.FILE);
				File f = new File("C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Screenshots\\pic4.png");
				FileHandler.copy(ss, f);
				break;
			}
			
		}
		
		Thread.sleep(10000);
		String t ="Amazon Pay";
		for(String cc : whs2) {
			if(driver.switchTo().window(cc).getTitle().equals(t)) {
				Thread.sleep(5000);
				WebElement ft = driver.findElement(By.xpath("//span[text()='Your Transactions']"));

				Actions gh = new Actions (driver);
				gh.doubleClick(ft).build().perform();
			break;
			}
			
		}
		Thread.sleep(5000);
		String o1 = "Amazon.in - Today's Deals";
		for(String cc : whs2) {
			if(driver.switchTo().window(cc).getTitle().equals(o1)) {	
				Thread.sleep(5000);
				JavascriptExecutor mmm = (JavascriptExecutor) driver;
				WebElement sro = driver.findElement(By.xpath("//a[text()='Protect and Build Your Brand']"));
				mmm.executeScript("arguments[0].scrollIntoView()",sro);
				break;
			}
		}
		
//		list of all window names
//		Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
//		Amazon Pay
//		Amazon.in - Today's Deals
//		Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
