package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
 public static WebDriver driver = RunnerClass.driver;
 
 @Given("^user Launch The Url In Adactin Application$")
 public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
	 driver.get("https://adactinhotelapp.com/");
     
      
 }

 @When("^user Enter The Username In The Username Field$")
 public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
	 driver.findElement(By.id("username")).sendKeys("Rajadurai1123");
      
 }

 @When("^user Enter The Password In The Password Field$")
 public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	 driver.findElement(By.name("password")).sendKeys("Raj@3");
      
 }

 @Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
 public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
	 driver.findElement(By.id("login")).click();
	 
	 
      
 }
 
 @When("^user Select The Location$")
 public void user_Select_The_Location() throws Throwable {
		WebElement singledd = driver.findElement(By.id("location"));
		Select s = new Select(singledd);
		s.selectByIndex(4);
      
 }

 @When("^user Select The Hotels$")
 public void user_Select_The_Hotels() throws Throwable {}

 @When("^user Select The Room Type$")
 public void user_Select_The_Room_Type() throws Throwable {
	 WebElement hoteltype = driver.findElement(By.id("room_type"));
		Select b = new Select(hoteltype);
		b.selectByVisibleText("Double");
      
 }

 @When("^user Select The Number Of Rooms$")
 public void user_Select_The_Number_Of_Rooms() throws Throwable {
	 WebElement rooms = driver.findElement(By.id("room_nos"));
		Select c = new Select(rooms);
		c.selectByIndex(3);
      
 }

 @When("^user Select The Check In Date$")
 public void user_Select_The_Check_In_Date() throws Throwable {
     driver.findElement(By.name("datepick_in")).sendKeys("31/10/2023");
      
 }

 @When("^user Select The Check Out Date$")
 public void user_Select_The_Check_Out_Date() throws Throwable {
     driver.findElement(By.name("datepick_out")).sendKeys("01/11/2023");
      
 }

 @When("^user Select The Adults Per Room$")
 public void user_Select_The_Aśḍdults_Per_Room() throws Throwable {
	 WebElement adr = driver.findElement(By.id("adult_room"));
		Select d = new Select(adr);
		d.selectByIndex(1);
      
 }

 @When("^user Select The Children Per Room$")
 public void user_Select_The_Children_Per_Room() throws Throwable {
	 WebElement chi = driver.findElement(By.id("child_room"));
		Select e = new Select(chi);
		e.selectByIndex(2);
      
 }

 @Then("^user Click The Search Button And Its Navigate To The Selected Hotel Page$")
 public void user_Click_The_Search_Button_And_Its_Navigate_To_The_Selected_Hotel_Page() throws Throwable {
	 driver.findElement(By.id("Submit")).click();
      
 }

 


	}


