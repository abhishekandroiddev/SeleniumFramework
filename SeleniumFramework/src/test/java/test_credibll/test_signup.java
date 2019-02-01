package test_credibll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_signup {
	
	public static WebElement nameTextbox, emailTextbox, passwordTextbox, locationTextbox, mobileTextbox;
	
	
	public static void main(String[] args) {
		credibllSignUp();
	}
	
	
	public static void credibllSignUp() {
		
		
		
		 String projectLocation = System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		 //go to Credibll Sign Up Page
		 
		 driver.get("http://credibll.stage.local/signup");
		 
		 //Enter name in the candidate name
		 
		 nameTextbox = driver.findElement(By.xpath("//input[@id='signup_fullname']"));
		 nameTextbox.sendKeys("Abhishek Tiwary");
		 
		 emailTextbox = driver.findElement(By.xpath("//input[@placeholder='Your Email']"));
		 emailTextbox.sendKeys("abhishek33@radiansys.com");
		 
		 passwordTextbox = driver.findElement(By.xpath("//input[@id='signup_password']"));
		 passwordTextbox.sendKeys("rsys506506");
		 
		 locationTextbox = driver.findElement(By.xpath("//input[@id='candidate_address_auto_fill']"));
		 locationTextbox.sendKeys("Sanfrancisco");
		 
		 mobileTextbox = driver.findElement(By.xpath("//input[@id='mobile']"));
		 mobileTextbox.sendKeys("7732850867");
		 
		 
		 // Check the Captcha
		 //driver.findElement(By.id("checkbox_id")).click();
		 
		 //click on search button
		 driver.findElement(By.xpath("//button[@id='signup_submit']")).click();
		 
		 
		 System.out.println("Test Completed Successfully");
		 
		 
		
	}

}
