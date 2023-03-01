package com.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Exception {
		
WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(5000);
		WebElement h = driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
		js.executeScript("arguments[0].scrollIntoView()",h);
	}
}
