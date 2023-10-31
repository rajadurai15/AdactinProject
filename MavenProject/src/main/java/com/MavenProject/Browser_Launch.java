package com.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Browser_Launch {

 public static void newtest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91729\\eclipse-workspace\\Selenium_Project\\Java_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

}
	

		
	public static void main(String[] args) {
		newtest();
			
	}

}
