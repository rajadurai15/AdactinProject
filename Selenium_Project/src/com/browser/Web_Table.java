package com.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91729\\eclipse-workspace\\Selenium_Project\\Java_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/cricket-series/6906/asia-cup-2023/points-table");
		
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
		Thread.sleep(2000);
		for (WebElement tab : table) {
			System.out.println(tab.getText());
		}
		
		System.out.println("=============================================");
		List<WebElement> table1 = driver.findElements(By.xpath("//table/tbody/tr[1]/td[1]"));
		Thread.sleep(2000);
		for (WebElement tab : table1) {
			System.out.println(tab.getText());
		}
	}

}
