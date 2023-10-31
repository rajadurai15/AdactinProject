package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91729\\eclipse-workspace\\Selenium_Project\\Java_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Rajadurai1123");
		
		driver.findElement(By.name("password")).sendKeys("Raj@3");
	
		driver.findElement(By.id("login")).click();
		
		WebElement singledd = driver.findElement(By.id("location"));
		Select s = new Select(singledd);
		s.selectByIndex(4);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select a = new Select(hotel);
		a.selectByValue("Hotel Sunshine");
		
		WebElement hoteltype = driver.findElement(By.id("room_type"));
		Select b = new Select(hoteltype);
		b.selectByVisibleText("Double");
		
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select c = new Select(rooms);
		c.selectByIndex(3);
		
		WebElement adr = driver.findElement(By.id("adult_room"));
		Select d = new Select(adr);
		d.selectByIndex(1);
		
		
		WebElement chi = driver.findElement(By.id("child_room"));
		Select e = new Select(chi);
		e.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.name("continue")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("raja");
		
		driver.findElement(By.name("last_name")).sendKeys("durai");
		
		driver.findElement(By.name("address")).sendKeys("pillaiyar kovil st");
		
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select n = new Select(cct);
		n.selectByIndex(2);
		
		WebElement ccm = driver.findElement(By.name("cc_exp_month"));
		Select m = new Select(ccm);
		m.selectByIndex(3);
		
		WebElement ccy = driver.findElement(By.name("cc_exp_year"));
		Select y = new Select(ccy);
		y.selectByIndex(3);
		
		driver.findElement(By.name("cc_cvv")).sendKeys("223");
		
		driver.findElement(By.id("book_now")).click();
		


	}

}
