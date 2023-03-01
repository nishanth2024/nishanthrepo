package com.ActionsAndRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobot {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		Thread.sleep(10000);
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		
		Actions abc = new Actions (driver);
		
		//abc.click(images).build().perform();
		
		abc.contextClick(images).build().perform();
		
		Robot robo = new Robot ();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		WebElement nn = driver.findElement(By.name("q"));
		abc.click(nn).build().perform();
		Robot robo2 = new Robot ();
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_U);
		robo.keyRelease(KeyEvent.VK_U);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_X);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_X);
		Thread.sleep(5000); 
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

	}
}
