package test_credibll;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CredibllSignupPage;

public class CredibllSignupTestNG {
	
	
	private static WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpPath() {
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void credibllSignUp() {
		
		 //go to Credibll Sign Up Page
		 driver.get("http://credibll.stage.local/signup");
		 
		 //Enter name in the candidate name
		 CredibllSignupPage.name_textbox(driver).sendKeys("Abhishek Tiwary");
		 CredibllSignupPage.email_textbox(driver).sendKeys("abhishek33@radiansys.com");
		 CredibllSignupPage.password_textbox(driver).sendKeys("rsys506506");
		 CredibllSignupPage.location_textbox(driver).sendKeys("Sanfrancisco");
		 CredibllSignupPage.mobile_textbox(driver).sendKeys("7732850867");
		  
		 //click on search button
		 CredibllSignupPage.btn_submit(driver).click();
		 
				 
		 
		 
	}
	
	@AfterTest
	public void tearDownTest() {
		
		System.out.println("Test Completed Successfully");
		
	}

}
