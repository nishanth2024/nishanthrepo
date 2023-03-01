package com.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchPracice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nishanth\\SeleniumWorkspace\\SeleniumPractice\\Drivers\\chromedriver.exe" );
		
		//inteface//parent                //class or constuctor//child
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.instagram.com/");
		
		
		
		
		
		
	}
}
