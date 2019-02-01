package test_credibll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CredibllSignupPage;

public class credibll_signup1_test {
	
	public static WebElement nameTextbox, emailTextbox, passwordTextbox, locationTextbox, mobileTextbox;
	
	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		credibllSignUp();
	}
	
	
	public static void credibllSignUp() {
		
		
		
		 String projectLocation = System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 
		 //go to Credibll Sign Up Page
		 
		 driver.get("http://credibll.stage.local/signup");
		 
		 //Enter name in the candidate name
		 
		 CredibllSignupPage.name_textbox(driver).sendKeys("Abhishek Tiwary");
		 CredibllSignupPage.email_textbox(driver).sendKeys("abhishek33@radiansys.com");
		 CredibllSignupPage.password_textbox(driver).sendKeys("rsys506506");
		 CredibllSignupPage.location_textbox(driver).sendKeys("Sanfrancisco");
		 CredibllSignupPage.mobile_textbox(driver).sendKeys("7732850867");
		 
		 
		 
		 // Check the Captcha
		 //driver.findElement(By.id("checkbox_id")).click();
		 
		 //click on search button
		 CredibllSignupPage.btn_submit(driver).click();
		 
		 
		 
		 System.out.println("Test Completed Successfully");
		 
		 
		
	}

}
