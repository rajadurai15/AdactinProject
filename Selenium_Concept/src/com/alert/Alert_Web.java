package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Web {

	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91729\\eclipse-workspace\\Selenium_Project\\Java_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fname")).sendKeys("Rajadurai");
		
    	WebElement innerfrm = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
    	driver.switchTo().frame(innerfrm);
   
    	driver.findElement(By.name("email")).sendKeys("rajadurai@gmail.com");
    	
    	driver.switchTo().parentFrame();
    	
    	driver.findElement(By.name("1name")).sendKeys("rock");
    	
    	driver.switchTo().defaultContent();
    	
   
    	driver.findElement(By.partialLinkText("Watch tutorial")).click();
    	
    	
    	
		

	}

}
