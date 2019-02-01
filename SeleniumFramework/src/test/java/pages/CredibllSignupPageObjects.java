package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CredibllSignupPageObjects {
	
	static WebDriver driver = null;

	
	By textbox_name = By.id("signup_fullname");
	By textbox_email = By.id("signup_email");
	By textbox_password = By.id("signup_password");
	By textbox_location = By.id("candidate_address_auto_fill");
	By textbox_mobile = By.id("mobile");
	By btn_submit = By.id("signup_submit");
	
	public CredibllSignupPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public void input_name(String text) {
		
		driver.findElement(textbox_name).sendKeys(text);
	
	}

	public void input_email(String text) {
		
		driver.findElement(textbox_email).sendKeys(text);
		
	}

	public void input_password(String text) {
	
	driver.findElement(textbox_password).sendKeys(text);
	
	}


	public void input_location(String text) {
	
	driver.findElement(textbox_location).sendKeys(text);
		
	}
	
	public void input_mobile(String text) {
	
	driver.findElement(textbox_mobile).sendKeys(text);
	
	}


	public void click_submit_button() {
		
		driver.findElement(btn_submit).click();
		
	}

	
	
}
