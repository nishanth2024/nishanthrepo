package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//input[@name='email']"));
		input.sendKeys("nishanth don");
    	WebElement	pass = driver.findElement(By.xpath("//input[@name='pass']"));
    	pass.sendKeys("909090");
    	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    	login.click();
    	Thread.sleep(10000);
    	TakesScreenshot abc = (TakesScreenshot) driver;
    	File ef = abc.getScreenshotAs(OutputType.FILE);
    	File wps = new File("C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Screenshots\\pic3.png");
    	FileHandler.copy(ef, wps);
    	//driver.navigate().back();
	}
}
