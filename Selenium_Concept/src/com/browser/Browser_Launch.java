package com.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91729\\eclipse-workspace\\Selenium_Project\\Java_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement multipledd = driver.findElement(By.xpath("//select[@id='second'"));
		
		Select s = new Select(multipledd);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
		
		s.selectByIndex(0);
		s.selectByValue("pizza");
		s.selectByVisibleText("Bonda");
		
		List<WebElement> aso = s.getAllSelectedOptions();
		
		for (int i = 0; i < aso.size() ; i++) {
			System.out.println(aso.get(i).getText());
			
		}
		
		
		
	}

}
