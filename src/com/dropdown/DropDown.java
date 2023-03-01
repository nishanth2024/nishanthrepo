package com.dropdown;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("window.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	 WebElement ca = driver.findElement(By.xpath("//a[text()='Create new account']"));
	 ca.click();
	 Thread.sleep(10000);
	 WebElement ddp = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	// driver.findElement(by)
	 Select s = new Select (ddp);
	 s.selectByValue("8");
	 boolean multiple = s.isMultiple();
	 System.out.println(multiple);
	 
	 
	 
	 
	 
	}
}
