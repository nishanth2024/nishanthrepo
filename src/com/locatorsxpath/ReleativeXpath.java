package com.locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReleativeXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	WebElement	name = driver.findElement(By.id("username"));
	name.sendKeys("nishanth");	 
	WebElement pass = driver.findElement(By.name("password"));	
		pass.sendKeys("12334twe2");
	WebElement	fp = driver.findElement(By.xpath("//a[text ( )='Forgot Password?']"));      
		
		fp.click();
		WebElement loginP = driver.findElement(By.id("emailadd_recovery"));
		loginP.sendKeys("www.nishanthd496@gmail.com");
		WebElement logP = driver.findElement(By.id("Submit"));
		logP.click();
	//	driver.navigate().back();
		//WebElement log = driver.findElement(By.id("login"));
	//	log.click();
		
		
		
		
		
	}
}
