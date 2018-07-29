package com.basic.FirstFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MyFirstepdef {

	WebDriver driver;
	
	@Given("^user needs to be on facebook login page$")
	public void user_needs_to_be_on_facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\chromedriver_win32_B39\\chromedriver.exe"); 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivc17049adm\\Cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^user enters first name$")
	public void user_enters_first_name()
	{
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("Rads");
}
	
//	@Then("^User checks  first name is present$")
	//public void User_checks_first_name_is_present()
//	{
	//	String actualusername = driver.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value");
	//	Assert.assertEquals("Rads",actualusername);
		
//	}
	
}
