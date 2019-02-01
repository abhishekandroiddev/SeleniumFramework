package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CredibllSignupPage {
	
	
	private static WebElement element = null;
	

	public static WebElement name_textbox(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='signup_fullname']"));
		return element;
		
	}
	
	
	public static WebElement email_textbox(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@placeholder='Your Email']"));
		return element;
		
	}
	
	
   public static WebElement password_textbox(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='signup_password']"));
		return element;
		
	}


   public static WebElement location_textbox(WebDriver driver) {
	
	   element = driver.findElement(By.xpath("//input[@id='candidate_address_auto_fill']"));
	   return element;
	
   }

     public static WebElement mobile_textbox(WebDriver driver) {
	
    	 element = driver.findElement(By.xpath("//input[@id='mobile']"));
    	 return element;
	
    }
     
     
     
   //click on search button  
    public static WebElement btn_submit(WebDriver driver) {
    	
    	element = driver.findElement(By.xpath("//button[@id='signup_submit']"));
    	return element;
    	
    }
  
	
    
	
}
