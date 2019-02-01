package test_credibll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CredibllSignupPageObjects;

public class CredibllSignupPageTest {
	
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		credibllSignupText();
	}

	
	public static void credibllSignupText() {
		
		
		String projectLocation = System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 
		 CredibllSignupPageObjects signupObj = new CredibllSignupPageObjects(driver);
		 
		 
		 //go to Credibll Sign Up Page
		 
		 driver.get("http://credibll.stage.local/signup");
		 
		 
		 signupObj.input_name("Abhishek Tiwary");
		 signupObj.input_email("abhishek@radiansys76.com");
		 signupObj.input_password("rsys506506");
		 signupObj.input_location("Sanfrancisco");
		 signupObj.input_mobile("7732850867");
		 
		 signupObj.click_submit_button();
		
	}
}
